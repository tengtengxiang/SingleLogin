package com.xt.utils;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * 管理activity的工具类
 * Created by s_nshine on 2016/10/21.
 */
public class ActivityCollector {
    public static List<Activity> activities = new ArrayList<>();

    /**
     * 添加Activity
     * @param activity
     */
    public static void addActivity(Activity activity){
        activities.add(activity);
    }

    /**
     * 移除Activity
     * @param activity
     */
    public static void removeActivity(Activity activity){
        activities.remove(activity);
    }

    /**
     * 移除所有Activity
     */
    public static  void removeAllActivity(){
        for (Activity activity : activities){
            if(!activity.isFinishing()){
                activity.finish();
            }
        }
    }

}
