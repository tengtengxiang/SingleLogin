package com.xt.base;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.xt.ui.LoginActivity;
import com.xt.model.MessageEvent;
import com.xt.utils.ActivityCollector;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

/**
 * 基类Activity
 * Created by s_nshine on 2016/10/21.
 */
public class BaseActivity extends AppCompatActivity{
    private static final String TAG = "BroadCastProject";
    Context mContext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG,"Activity:"+getClass().getSimpleName());
        mContext = this;
        EventBus.getDefault().register(this);
        ActivityCollector.addActivity(this);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    /**
     * 无论事件在哪个线程中发布，发布和接收消息都在UI线程中执行，用于更新UI，避免耗时操作
     * @param event
     */
    @Subscribe
    public void onEventMainThread(MessageEvent event) {
        AlertDialog.Builder diaBuilder = new AlertDialog.Builder(mContext);
        diaBuilder.setTitle("警告");
        diaBuilder.setMessage("QQ在其他地方登陆，你被迫下线，请重新登陆！");
        diaBuilder.setCancelable(false);
        diaBuilder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intent = new Intent(mContext, LoginActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                mContext.startActivity(intent);
            }
        });
        diaBuilder.show();
    }
}
