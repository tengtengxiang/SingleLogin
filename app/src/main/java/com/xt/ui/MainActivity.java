package com.xt.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import com.xt.R;
import com.xt.base.BaseActivity;
import com.xt.utils.LogUtils;
import com.xt.utils.PushSmsServiceUtil;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        Button bt_force_offline = (Button) findViewById(R.id.bt_force_offline);
        bt_force_offline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LogUtils.showLog("停止服务");
                // 停止服务
                Intent pushService = new Intent(MainActivity.this, PushSmsServiceUtil.class);
                stopService(pushService);
            }
        });
    }

}
