package com.rhinodesktop.foreorder_golf_consumer1.managers.apirequestmanagers;

import android.content.Context;

import com.rhinoactive.jsonparsercallback.StandardCallback;
import com.rhinodesktop.foreorder_golf_consumer1.callbacks.NoContentCallback;
import com.rhinodesktop.foreorder_golf_consumer1.networking.ApiRequests;
import com.rhinodesktop.foreorder_golf_consumer1.parsers.MenusParser;

import okhttp3.Call;

/**
 * Created by Hunter Andrin on 2017-04-04.
 */

public class MenuApiManager {

    public static void getMenusForCurrentClub(Context context, int clubId) {
        MenusParser menusParser = new MenusParser(context);
        try {
            StandardCallback callback = new NoContentCallback(menusParser);
            Call call = ApiRequests.getInstance().getMenuForCurrentClub(clubId);
            call.enqueue(callback);
        } catch (Exception ex) {
            menusParser.handleError(ex);
        }
    }
}
