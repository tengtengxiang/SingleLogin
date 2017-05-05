package com.xt.ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.Toast;

import com.xt.R;
import com.xt.base.BaseActivity;
import com.xt.utils.PushSmsServiceUtil;

/**
 * 登陆Activity
 */
public class LoginActivity extends BaseActivity {
    EditText name;
    EditText pwd;
    Toast toast = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_login);
        initView();

    }

    private void initView() {
        name = (EditText) findViewById(R.id.et_name);
        pwd = (EditText) findViewById(R.id.et_pwd);
    }

    /**
     * 登陆
     * @param view
     */
    public void Login(View view){
        String mname = name.getText().toString().trim();
        String mpwd = pwd.getText().toString().trim();
        if(TextUtils.isEmpty(mname) || TextUtils.isEmpty(mpwd)){
            toast =  Toast.makeText(LoginActivity.this,"账号或密码不能为空",Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER,0,0);
            toast.show();
        }else{
            if("a".equals(mname) && "b".equals(mpwd)){
                // 启动服务
                Intent pushService = new Intent(this, PushSmsServiceUtil.class);
                startService(pushService);
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
            }else{
                toast = Toast.makeText(LoginActivity.this,"用户名或密码错误",Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER,0,0);
                toast.show();
            }
        }
    }

}
