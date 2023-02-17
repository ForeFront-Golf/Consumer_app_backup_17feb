package com.rhinodesktop.foreorder_golf_consumer1.googlelogin;

import com.facebook.login.LoginResult;

public interface GoogleCallback<Result> {

    void onSuccess(LoginResult loginResult);
}
