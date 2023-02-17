package com.rhinodesktop.foreorder_golf_consumer1.managers.apirequestmanagers;

import com.rhinoactive.jsonparsercallback.StandardCallback;
import com.rhinodesktop.foreorder_golf_consumer1.callbacks.NoContentCallback;
import com.rhinodesktop.foreorder_golf_consumer1.networking.ApiRequests;
import com.rhinodesktop.foreorder_golf_consumer1.parsers.ClubsParser;

import okhttp3.Call;

/**
 * Created by Hunter Andrin on 2017-04-04.
 */

public class ClubApiManager {

    public static void getClubsNearCurrentUser(int userId/*Location location*/) {
        ClubsParser clubsParser = new ClubsParser();
        try {
            StandardCallback callback = new NoContentCallback(clubsParser);
            Call call = ApiRequests.getInstance().getClubsNearCurrentUser(userId /*location*/);
//            Call call = ApiRequests.getInstance().getClubsNearCurrentUser(location);
            call.enqueue(callback);
        } catch (Exception ex) {
            clubsParser.handleError(ex);
        }
    }
}
