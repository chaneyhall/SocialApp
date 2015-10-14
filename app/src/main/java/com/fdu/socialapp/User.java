package com.fdu.socialapp;

import android.app.Application;

/**
 * Created by mao on 2015/10/12 0012.
 * A class for users
 */
public class User extends Application{
    private boolean isLogin;
    private String userName;
    public boolean isLogin() {
        return isLogin;
    }
    public String getUserName() {
        if (isLogin) return userName;
        else return null;
    }
    public void setUserName(String name) {
        userName = name;
    }

    public void login() {
        isLogin = true;
    }

    public void logout() {
        isLogin = false;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        isLogin = false;
        userName = null;
    }
}
