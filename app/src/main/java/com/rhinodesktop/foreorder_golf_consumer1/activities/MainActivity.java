package com.rhinodesktop.foreorder_golf_consumer1.activities;

import android.Manifest;
import android.app.Fragment;
import android.os.Bundle;
import android.app.FragmentTransaction;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;

import com.bumptech.glide.Glide;
import com.rhinoactive.foreorder_library_android.utils.Constants;
import com.rhinoactive.generalutilities.GpsUtils;
import com.rhinoactive.generalutilities.MainThreadRunner;
import com.rhinodesktop.activityanimatorutility.activityutils.ActivityAnimationUtils;
import com.rhinodesktop.activityanimatorutility.fragmentutils.SupportFragmentAnimateManager;
import com.rhinodesktop.activityanimatorutility.models.AnimationType;
import com.rhinodesktop.foreorder_golf_consumer1.R;
import com.rhinodesktop.foreorder_golf_consumer1.fragments.CourseListFragment;
import com.rhinodesktop.foreorder_golf_consumer1.fragments.MenuFragment;
import com.rhinodesktop.foreorder_golf_consumer1.fragments.NoGpsFragment;
import com.rhinodesktop.foreorder_golf_consumer1.interfaces.OnClubInRangeChangeListener;
import com.rhinodesktop.foreorder_golf_consumer1.models.Club;
import com.rhinodesktop.foreorder_golf_consumer1.models.enums.DrawerToolbarType;

import com.rhinodesktop.foreorder_golf_consumer1.utils.ForeOrderSharedPrefUtils;

import com.rhinodesktop.locationutilities.newlocationupdates.utils.LastKnownLocationUtils;
import com.rhinodesktop.locationutilities.newlocationupdates.utils.LocationPermissionCallback;


import io.realm.Realm;
import timber.log.Timber;

public class MainActivity extends DrawerAppBarActivity implements OnClubInRangeChangeListener, LocationPermissionCallback {

    private TextView coursesNearYouTextView;
    private ImageView clubImageView ;



    private ActivityResultLauncher<String[]> permisionLauncher =
            registerForActivityResult(new ActivityResultContracts.RequestMultiplePermissions(),
                    result->{

                        if( result.values().contains(false)){
                            requestLocationPermission();
                        }else{
                            LastKnownLocationUtils.getLastKnownLocation(this);
                        }
                    }) ;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    @Override
    protected void onResume() {
        super.onResume();
        LastKnownLocationUtils.getLastKnownLocation(this);
        Fragment noGpsFragment = getFragmentManager().findFragmentByTag(Constants.NO_GPS_FRAGMENT_TAG);
        if (GpsUtils.isGpsEnabled(this) && noGpsFragment != null) {
            getSupportFragmentManager().beginTransaction().remove(getSupportFragmentManager().findFragmentByTag(Constants.NO_GPS_FRAGMENT_TAG)).commit();
        }
    }

    @Override
    public void onBackPressed() {

        Timber.i("OnBackPressed:- "+ selectedDrawerToolbarType);
        if(selectedDrawerToolbarType !=null && selectedDrawerToolbarType ==DrawerToolbarType.FoodItemListAppBar){
            ForeOrderSharedPrefUtils.setCurrentClubId(this, 0);
            onClubInRangeChangeEvent(DrawerToolbarType.CourseListAppBar);
            Timber.i("OnBackPressed:- " + selectedDrawerToolbarType);
        }else{
            Timber.i("OnBackPressed:- Close MainActivity");
            super.onBackPressed();
            ActivityAnimationUtils.animateActivityTransition(this, AnimationType.FADE_IN);
        }

    }

    DrawerToolbarType selectedDrawerToolbarType;

    @Override
    public void onClubInRangeChangeEvent(final DrawerToolbarType drawerToolbarType) {
        MainThreadRunner.runFromUiThread(new Runnable() {
            @Override
            public void run() {
                selectedDrawerToolbarType=drawerToolbarType;
                Fragment fragment = getProperFragment(drawerToolbarType);
                SupportFragmentAnimateManager.getInstance().changeSupportFragment(getFragmentManager(), fragment, AnimationType.FADE_IN, R.id.fragment_container);
            }
        });
    }


    private void initViews() {
        coursesNearYouTextView = findViewById(R.id.textview_courses_near_you);
        clubImageView = findViewById(R.id.imageview_menu_backdrop);
//        initCourseListFragment();
        initProperFragment();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        ForeOrderSharedPrefUtils.setCurrentClubId(this, 0);
    }


    private void initProperFragment() {
        // TODO: init fragment based on if user is in a geofence
        Realm realm = Realm.getDefaultInstance();
        int currentClubId = ForeOrderSharedPrefUtils.getCurrentClubId(this);
        Timber.i("CurrentClubÏd  "+ currentClubId);

        Club currentClub = realm.where(Club.class).equalTo("clubId", currentClubId).findFirst();
        realm.close();

        if (currentClub == null) {
            selectedDrawerToolbarType = DrawerToolbarType.CourseListAppBar;
        } else {

            try{
                selectedDrawerToolbarType = DrawerToolbarType.FoodItemListAppBar;
                Glide.with(clubImageView).load(Constants.IMAGE_BASE_URL+currentClub.getPhotoUrl()).into(clubImageView);
            }catch(Exception e)
            {
                e.printStackTrace();
            }

        }
        Fragment fragment = getProperFragment(selectedDrawerToolbarType);

        SupportFragmentAnimateManager.getInstance().addSupportFragment(getFragmentManager(), fragment, R.id.fragment_container);
    }

    private Fragment getProperFragment(DrawerToolbarType drawerToolbarType) {

        Fragment fragment;
        if (drawerToolbarType.equals(DrawerToolbarType.CourseListAppBar)) {
            fragment = initCourseListFragment();
            if (!GpsUtils.isGpsEnabled(this)) {
                initNoGpsOverlay();
            }
        } else {
            fragment = initMenuFragment();
        }


        return fragment;
    }

    private void initNoGpsOverlay() {
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.add(R.id.no_gps_layout, new NoGpsFragment(), Constants.NO_GPS_FRAGMENT_TAG);
        transaction.commit();
    }

    private Fragment initCourseListFragment() {
        coursesNearYouTextView.setVisibility(View.VISIBLE);
        clubImageView.setVisibility(View.GONE);
        initToolbar(DrawerToolbarType.CourseListAppBar);
        return new CourseListFragment();
    }

    private Fragment initMenuFragment() {
        coursesNearYouTextView.setVisibility(View.GONE);
        clubImageView.setVisibility(View.VISIBLE);
        initToolbar(DrawerToolbarType.FoodItemListAppBar);
        return new MenuFragment();
    }

    @Override
    public void requestLocationPermission() {
        permisionLauncher.launch(new String[]{
                Manifest.permission.ACCESS_FINE_LOCATION,Manifest.permission.ACCESS_COARSE_LOCATION
        });
    }
}
