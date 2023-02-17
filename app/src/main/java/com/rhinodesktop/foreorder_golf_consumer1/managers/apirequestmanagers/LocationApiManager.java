package com.rhinodesktop.foreorder_golf_consumer1.managers.apirequestmanagers;

import android.location.Location;

import com.rhinodesktop.foreorder_golf_consumer1.callbacks.UnauthorizedCallback;
import com.rhinodesktop.foreorder_golf_consumer1.networking.ApiRequests;
import com.rhinodesktop.foreorder_golf_consumer1.parsers.UpdateUserLocationParser;

import okhttp3.Call;
import okhttp3.Callback;

/**
 * Created by Hunter Andrin on 2017-04-04.
 */

public class LocationApiManager {

    public static void updateCurrentUserLocationOnServer(int userId, Location location) {
        UpdateUserLocationParser updateUserLocationParser = new UpdateUserLocationParser();
        try {
            Callback callback = new UnauthorizedCallback(updateUserLocationParser);
            Call call = ApiRequests.getInstance().updateCurrentUserLocation(userId, location);
            call.enqueue(callback);
        } catch (Exception ex) {
            updateUserLocationParser.handleError(ex);
        }
    }
}
