package com.droi.sdk.selfupdatedemo;

import android.app.Application;

import com.droi.sdk.core.Core;
import com.droi.sdk.selfupdate.DroiUpdate;
import com.squareup.leakcanary.LeakCanary;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        if (LeakCanary.isInAnalyzerProcess(this)) {
            return;
        }
        LeakCanary.install(this);
        Core.initialize(this);
        DroiUpdate.initialize(this, "FS8ZFO0LjI4LcnRR5rBOGdQytQAZgPKHOT2kDFw5jMZnxf3Mcjmuq2-P6aBQjOy_");
    }
}
