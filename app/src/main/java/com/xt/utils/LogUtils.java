package com.xt.utils;
import android.util.Log;

public class LogUtils {

	static String TAG = "Project";
	static String TAG_NET = "NET";
	static boolean isDebug = true;

	public static void showErrorLog(String mess)
	{
		if(isDebug)
			Log.e(TAG, mess);
	}

	public static void showErrorNetLog(String mess)
	{
		if(isDebug)
			Log.e(TAG_NET, mess);
	}
	public static void showLog(String mess)
	{
		if(isDebug)
		Log.v(TAG, mess);
	}
	
	public static void showNetLog(String mess)
	{
		if(isDebug)
		Log.v(TAG_NET, mess);
	}
	
}
