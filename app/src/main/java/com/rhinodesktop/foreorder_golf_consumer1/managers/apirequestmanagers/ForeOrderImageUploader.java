package com.rhinodesktop.foreorder_golf_consumer1.managers.apirequestmanagers;

import com.rhinoactive.generalutilities.NetworkUtils;
import com.rhinoactive.imageutility.amazonimageuploaders.AmazonImageUploader;
import com.rhinodesktop.foreorder_golf_consumer1.R;
import com.rhinodesktop.foreorder_golf_consumer1.callbacks.AmazonImageUploadCallback;
import com.rhinodesktop.foreorder_golf_consumer1.models.User;
import com.rhinodesktop.foreorder_golf_consumer1.utils.ForeOrderApp;
import com.rhinodesktop.foreorder_golf_consumer1.utils.ForeOrderResourceUtils;
import com.rhinodesktop.foreorder_golf_consumer1.utils.ForeOrderToastUtils;

import io.realm.Realm;

/**
 * Created by hunter on 2018-03-20.
 */

public class ForeOrderImageUploader {

    public static void uploadImageToAmazon(AmazonImageUploader amazonImageUploader) {
        if (NetworkUtils.hasNetworkConnection(ForeOrderApp.getAppContext())) {
            Realm realm = Realm.getDefaultInstance();
            User currentUser = realm.where(User.class).findFirst();
            String s3Path = "public/user/" + currentUser.getUserId() + "/profile.jpg";
            realm.close();

            AmazonImageUploadCallback amazonImageUploadCallback =
                    new AmazonImageUploadCallback(Realm.getDefaultInstance().where(User.class).findFirst().getUserId(), s3Path);
            amazonImageUploader.uploadUserImageToAmazon(s3Path, amazonImageUploadCallback);
        } else {
            String errorMsg = ForeOrderResourceUtils.getInstance().strRes(R.string.no_internet_uploading_photo);
            ForeOrderToastUtils.getInstance().displayToastFromMainThreadLong(errorMsg);
        }
    }

}
