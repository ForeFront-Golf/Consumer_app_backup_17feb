package com.rhinodesktop.foreorder_golf_consumer1.loggers;

import com.rhinodesktop.foreorder_golf_consumer1.BuildConfig;


import org.jetbrains.annotations.NotNull;

import timber.log.Timber;

/**
 * Created by hunter on 2018-03-20.
 */

public class TimberLogImplementation {

    public static void init() {
        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree() {
                @Override
                protected String createStackElementTag(@NotNull StackTraceElement element) {
                    return String.format("C:%s:%s",
                            super.createStackElementTag(element),
                            element.getLineNumber());
                }
            });
        }
    }
}