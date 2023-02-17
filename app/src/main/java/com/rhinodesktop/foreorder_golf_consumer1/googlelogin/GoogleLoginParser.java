package com.rhinodesktop.foreorder_golf_consumer1.googlelogin;

import android.app.Activity;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.rhinoactive.foreorder_library_android.utils.Constants;
import com.rhinoactive.imageutility.amazonimageuploaders.AmazonImageLinkUploader;
import com.rhinoactive.imageutility.amazonimageuploaders.AmazonImageUploader;
import com.rhinodesktop.foreorder_golf_consumer1.managers.apirequestmanagers.ForeOrderImageUploader;
import com.rhinodesktop.foreorder_golf_consumer1.models.FacebookUser;
import com.rhinodesktop.foreorder_golf_consumer1.parsers.loginparsers.ForeOrderLoginParser;

public class GoogleLoginParser extends ForeOrderLoginParser {


    public GoogleLoginParser(Activity previousActivity) {
        super(previousActivity);
    }

    @Override
    protected void handleSuccessfulLogin(JsonObject obj, GsonBuilder builder) {
        super.handleSuccessfulLogin(obj, builder);
        if (user.getProfilePhotoUrl() == null) {
            uploadGoogleProfilePhoto(obj, builder);
        }
    }

    private void uploadGoogleProfilePhoto(JsonObject obj, GsonBuilder builder) {
        JsonObject fbUsrObj = obj.getAsJsonObject(Constants.USER_TABLE).getAsJsonObject(Constants.FACEBOOK_USER);
        FacebookUser facebookUser = builder.create().fromJson(fbUsrObj, FacebookUser.class);
        String imgLink = facebookUser.getProfileImageUrl();
        AmazonImageUploader amazonImageUploader = new AmazonImageLinkUploader(imgLink);
        ForeOrderImageUploader.uploadImageToAmazon(amazonImageUploader);


    }
}
