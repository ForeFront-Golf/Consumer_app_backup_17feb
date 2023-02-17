package com.rhinodesktop.foreorder_golf_consumer1.parsers;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.rhinoactive.foreorder_library_android.utils.Constants;
import com.rhinoactive.jsonparsercallback.JsonArrayParser;
import com.rhinodesktop.foreorder_golf_consumer1.events.PrivateClubsListEvent;
import com.rhinodesktop.foreorder_golf_consumer1.models.Club;

import org.greenrobot.eventbus.EventBus;

import java.util.List;

import timber.log.Timber;

/**
 * Created by sungwook on 2018-04-12.
 */

public class PrivateClubsListParser extends JsonArrayParser<Club> {
    @Override
    public void handleError(Exception ex) {
        Timber.e("PrivateClubsListParser: Error "+ ex.getMessage());
        EventBus.getDefault().post(new PrivateClubsListEvent(null, false));
    }

    @Override
    protected String getJsonKey() {
        return Constants.CLUB_TABLE;
    }

    @Override
    protected Club parseSingleElement(JsonElement singleJsonElement, GsonBuilder builder) {
        return builder.create().fromJson(singleJsonElement, Club.class);
    }

    @Override
    protected void postSuccessfulParsingLogic(List<Club> privateClubsList) {
        Timber.i("PrivateClubListParse: "+privateClubsList);
        EventBus.getDefault().post(new PrivateClubsListEvent(privateClubsList, true));
    }
}
