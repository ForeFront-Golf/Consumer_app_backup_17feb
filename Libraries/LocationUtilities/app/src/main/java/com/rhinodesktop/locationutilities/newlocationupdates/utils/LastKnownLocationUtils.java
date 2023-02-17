package com.rhinodesktop.locationutilities.newlocationupdates.utils;

import android.Manifest;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.location.Location;
//import androidx.core.app.ActivityCompat;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.widget.Toast;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnSuccessListener;
import com.rhinodesktop.locationutilities.newlocationupdates.events.LastKnownLocationEvent;

import org.greenrobot.eventbus.EventBus;

import timber.log.Timber;

/**
 * Created by sungwook on 2018-03-19.
 */

public class LastKnownLocationUtils {

    public static void getLastKnownLocation(Activity activity) {
        //TODO: do we really want this client here?
        Timber.i("GetLastKnownLocation: from "+activity.getLocalClassName());
        FusedLocationProviderClient fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(activity);
        if (ActivityCompat.checkSelfPermission(activity, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
            fusedLocationProviderClient.getLastLocation().addOnSuccessListener(activity, new OnSuccessListener<Location>() {
                @Override
                public void onSuccess(Location location) {

                    try{
                        Timber.i("GetLastKnownLocation: lat "+location.getLatitude()+" long: "+location.getLongitude());
                        EventBus.getDefault().post(new LastKnownLocationEvent(location));
                    }catch (Exception e){
                        Timber.i("GetLastKnownLocation: "+e.getLocalizedMessage());
                        e.printStackTrace();
                    }

                }
            });
        } else {
            Timber.i("GetLastKnownLocation: Location permission required");
            Toast.makeText(activity, "Location permission required for core functionality", Toast.LENGTH_SHORT).show();

            try{
                LocationPermissionCallback permissionCallback = (LocationPermissionCallback) activity;
                permissionCallback.requestLocationPermission();
            }catch (Exception e){
                e.printStackTrace();
            }

        }
    }
}
