package com.xt.app;
import android.app.Application;
import android.content.Context;
/**
 * App的appliction,用于保存一些公共数据
 * sunshine on 2016/10/27 10:57
 */
public class SingleLoginApp extends Application{
    public static SingleLoginApp mApp;
    public static Context mAppContext;
    @Override
    public void onCreate() {
        super.onCreate();
        mApp = this;
        mAppContext = getApplicationContext();
    }
    public static SingleLoginApp getInstance() {
        return mApp;
    }
    public static Context getAppContext() {
        return mAppContext;
    }

}
