package com.rhinodesktop.foreorder_golf_consumer1.parsers;

import android.app.Activity;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.rhinoactive.imageutility.amazonimageuploaders.AmazonImageFileUploader;
import com.rhinoactive.imageutility.amazonimageuploaders.AmazonImageUploader;
import com.rhinodesktop.foreorder_golf_consumer1.managers.apirequestmanagers.ForeOrderImageUploader;
import com.rhinodesktop.foreorder_golf_consumer1.parsers.loginparsers.CreateAccountParser;

import java.io.File;

/**
 * Created by Hunter Andrin on 2017-04-26.
 */

public class CreateAccountParserWithPhoto extends CreateAccountParser {

    private File userImageFile;

    public CreateAccountParserWithPhoto(Activity previousActivity, File userImageFile) {
        super(previousActivity);
        this.userImageFile = userImageFile;
    }

    @Override
    protected void handleSuccessfulLogin(JsonObject obj, GsonBuilder builder) {
        super.handleSuccessfulLogin(obj, builder);
        AmazonImageUploader amazonImageUploader = new AmazonImageFileUploader(userImageFile);
        ForeOrderImageUploader.uploadImageToAmazon(amazonImageUploader);
    }
}
