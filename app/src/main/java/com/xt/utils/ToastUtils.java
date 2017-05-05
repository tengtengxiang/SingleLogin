package com.xt.utils;
import android.content.Context;
import android.view.Gravity;
import android.widget.Toast;

import com.xt.app.SingleLoginApp;

/**
 * Toast吐司工具类
 * sunshine on 2016/10/27 11:52
 */
public class ToastUtils {
    public static Toast toast ;
    public static boolean isShow = true;
    private ToastUtils(){
        throw new UnsupportedOperationException("cannot be instantiated");
    }

    /**
     * 短时间显示Toast
     *
     * @param context
     * @param message
     */
    public static void showShort(Context context, String message)
    {
        if (isShow){
            if (toast == null) {
                toast = Toast.makeText(context,
                        message,
                        Toast.LENGTH_SHORT);
            } else {
                toast.setText(message);
            }
            toast.show();
        }
    }

    /**
     * 短时间显示Toast
     *
     * @param context
     * @param message
     */
    public static void showShort(Context context, int message)
    {
        if (isShow){
            if (toast == null) {
                toast = Toast.makeText(context,
                        message,
                        Toast.LENGTH_SHORT);
            } else {
                toast.setText(message);
            }
            toast.show();
        }
    }

    /**
     * 长时间显示Toast
     *
     * @param context
     * @param message
     */
    public static void showLong(Context context, String message)
    {
        if (isShow){
            if (toast == null) {
                toast = Toast.makeText(context,
                        message,
                        Toast.LENGTH_SHORT);
            } else {
                toast.setText(message);
            }
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }
    }

    /**
     * 长时间显示Toast
     *
     * @param context
     * @param message
     */
    public static void showLong(Context context, int message)
    {
        if (isShow){
            if (toast == null) {
                toast = Toast.makeText(context,
                        message,
                        Toast.LENGTH_SHORT);
            } else {
                toast.setText(message);
            }
            toast.show();
        }
    }

    /**
     * 自定义显示Toast时间
     *
     * @param context
     * @param message
     * @param duration
     */
    public static void show(Context context, CharSequence message, int duration)
    {
        if (isShow){
            if (toast == null) {
                toast = Toast.makeText(context,
                        message,
                        duration);
            } else {
                toast.setText(message);
            }
            toast.show();
        }
    }

    /**
     * 自定义显示Toast时间
     *
     * @param context
     * @param message
     * @param duration
     */
    public static void show(Context context, int message, int duration)
    {
        if (isShow){
            if (toast == null) {
                toast = Toast.makeText(context,
                        message,
                       duration);
            } else {
                toast.setText(message);
            }
            toast.show();
        }
    }

    /**
     * 居中短时间显示
     * @param context
     * @param message
     */
    public static void showCenter(Context context, String message)
    {
        Toast toast = null;
        if (isShow){
            if (toast == null) {
                toast = Toast.makeText(context,
                        message,
                        Toast.LENGTH_SHORT);
            } else {
                toast.setText(message);
            }
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

    }

    /**
     * 服务器返回提示
     *
     * @param code
     */
    public static void showMessage(int code, String msg) {
        switch (code) {
            case -1:
                Toast.makeText(SingleLoginApp.getAppContext(), msg, Toast.LENGTH_SHORT).show();
                break;
            case -2: //未登录
                Toast.makeText(SingleLoginApp.getAppContext(), msg, Toast.LENGTH_SHORT).show();
                break;
            case 0:// 失败或其他原因
                Toast.makeText(SingleLoginApp.getAppContext(), msg, Toast.LENGTH_SHORT).show();
                break;
            case 1:// 成功
//                Toast.makeText(BaseProjectApp.getAppContext(), msg, Toast.LENGTH_SHORT).show();
                break;
            default:
                Toast.makeText(SingleLoginApp.getAppContext(), msg, Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
