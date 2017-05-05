package com.xt.utils;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import com.xt.app.SingleLoginApp;
import com.xt.biz.HomeBiz;
import com.xt.biz.ICallBackListener;
import com.xt.model.HomePageModel;
import com.xt.model.MessageEvent;

import org.greenrobot.eventbus.EventBus;

import okhttp3.Request;

/**
 * 短信推送服务类，在后台长期运行，每隔一段时间就向服务器发送一次请求
 *
 * @author s_nshine
 */
public class PushSmsServiceUtil extends Service {
    private MyThread myThread;
    private boolean flag = true;
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        this.myThread = new MyThread();
        this.myThread.start();
        super.onCreate();
    }

    @Override
    public void onDestroy() {
        this.flag = false;
        myThread.interrupt();
        super.onDestroy();
    }

    private class MyThread extends Thread {
        @Override
        public void run() {
            while (flag) {
                LogUtils.showLog("发送请求");
                try {
                    // 每个8秒向服务器发送一次请求
                    Thread.sleep(8000);
                    HomeBiz.getHomePage(new ICallBackListener<HomePageModel>() {
                        @Override
                        public void onSuccessed(HomePageModel res) {
                            if(res.getCode() == 1){
                                LogUtils.showLog("SingleLogin："+res.getMsg());
                                ToastUtils.showShort(SingleLoginApp.getAppContext(),res.getMsg());
                                EventBus.getDefault().post(new MessageEvent("FORCE_OFFLINE"));
                            }
                        }

                        @Override
                        public void onFailed(Request request, Exception e) {
                            ToastUtils.showShort(SingleLoginApp.getAppContext(),"请求失败");
                        }
                    });
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

        }
    }

}
