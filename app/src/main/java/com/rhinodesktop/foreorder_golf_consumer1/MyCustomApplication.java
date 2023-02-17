package com.rhinodesktop.foreorder_golf_consumer1;

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;

public class MyCustomApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
        RealmConfiguration realmConfig = new RealmConfiguration.Builder()
                .name("tasky.realm")
                .schemaVersion(0)
                .build();
        Realm.setDefaultConfiguration(realmConfig);
    }
}