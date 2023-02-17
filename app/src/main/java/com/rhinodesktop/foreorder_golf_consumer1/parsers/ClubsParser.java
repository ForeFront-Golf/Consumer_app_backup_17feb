package com.rhinodesktop.foreorder_golf_consumer1.parsers;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.rhinoactive.foreorder_library_android.utils.Constants;
import com.rhinoactive.jsonparsercallback.JsonArrayParser;
import com.rhinodesktop.foreorder_golf_consumer1.events.ClubsUpdatedEvent;
import com.rhinodesktop.foreorder_golf_consumer1.models.Club;
import com.rhinodesktop.foreorder_golf_consumer1.utils.ForeOrderToastUtils;

import org.greenrobot.eventbus.EventBus;

import java.util.List;

import io.realm.Realm;
import timber.log.Timber;

/**
 * Created by Hunter Andrin on 2017-04-04.
 */

public class ClubsParser extends JsonArrayParser<Club> {

    @Override
    public void handleError(Exception ex) {
        ex.printStackTrace();
        Timber.e("Error getting clubs: %s", ex.getMessage());
        ForeOrderToastUtils.getInstance().displayToastFromMainThreadLong(Constants.ERROR_OCCURRED_GETTING_CLUBS);
    }

    @Override
    protected String getJsonKey() {
        return Constants.CLUB_TABLE;
    }

    @Override
    protected Club parseSingleElement(JsonElement clubElement, GsonBuilder builder) {
        Club club = builder.create().fromJson(clubElement, Club.class);
        if(club.getDist()!=null){
            club.setDist(club.getDist() / 1000); // Convert M to KM
        }
        return club;
    }

    @Override
    protected void postSuccessfulParsingLogic(final List<Club> parsedObject) {
        Timber.i("NearbyClubs: "+parsedObject);
        try (Realm realm = Realm.getDefaultInstance()) {
            realm.executeTransaction(new Realm.Transaction() {
                @Override
                public void execute(Realm realm) {
                    realm.insertOrUpdate(parsedObject);
                }
            });
        }
        EventBus.getDefault().post(new ClubsUpdatedEvent());
    }
}
