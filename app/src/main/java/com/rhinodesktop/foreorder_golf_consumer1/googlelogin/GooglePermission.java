package com.rhinodesktop.foreorder_golf_consumer1.googlelogin;

import static com.facebook.AccessToken.getCurrentAccessToken;

import java.util.Set;

public class GooglePermission {
    public static final String PUBLIC_PROFILE ="public_profile" ;

//    String personName = acct.getDisplayName();
//    String personGivenName = acct.getGivenName();
//    String personFamilyName = acct.getFamilyName();
//    String personEmail = acct.getEmail();
//    String personId = acct.getId();
//    Uri personPhoto = acct.getPhotoUrl();

//    PUBLIC_PROFILE("public_profile"),
//    EMAIL_PERMISSION("email"),
//    BIRTHDAY_PERMISSION("user_birthday"),
//    PHOTOS_PERMISSION("user_photos");
//    USER_LIKES_PERMISSION("user_likes"),
//    WORK_HISTORY_PERMISSION("user_work_history"),
//    ABOUT_ME_PERMISSION("user_about_me");

    private final String name;

    GooglePermission(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean hasPermission() {
        boolean hasPermission = false;
        if (getCurrentAccessToken() != null) {
            Set<String> declinedPermissions = getCurrentAccessToken().getDeclinedPermissions();
            if (!declinedPermissions.contains(this.getName())) {
                hasPermission = true;
            }
        }
        return hasPermission;
    }

    @Override
    public String toString() {
        return getName();
    }
}
