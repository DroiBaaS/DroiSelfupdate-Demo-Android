package com.droi.sdk.selfupdatedemo;

import android.app.Application;

import com.droi.sdk.core.Core;
import com.droi.sdk.selfupdate.DroiUpdate;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Core.initialize(this);
        DroiUpdate.initialize(this);
        //DroiUpdate.setUpdateOnlyWifi(true);
    }
}
