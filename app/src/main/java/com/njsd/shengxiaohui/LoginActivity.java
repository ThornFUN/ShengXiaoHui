package com.njsd.shengxiaohui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.gson.Gson;
import com.njsd.admin.net.NetHandler;
import com.njsd.admin.pojo.Member;
import com.njsd.admin.pojo.RequestResult;
import com.njsd.utils.CheckUtils;
import com.njsd.utils.ToastUtil;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/**
 * Created by mac on 2017/4/10.
 */

public class LoginActivity extends BaseActivity implements View.OnClickListener, Callback {


    private EditText editText_password, editText_name;
    private Button button_login;
    private Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_login);
        initView();
        initListener();

    }



    private void initView() {
//        initToolbar(R.layout.toolbar,R.id.toolbar_title,R.string.login);
        editText_name = (EditText) findViewById(R.id.editText_name);
        editText_password = (EditText) findViewById(R.id.editText_password);
        button_login = (Button) findViewById(R.id.button_login);

    }

    private void initListener() {
        button_login.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_login:
                String email_phone = editText_name.getText().toString();
                String password = editText_password.getText().toString();
                if(CheckUtils.isNUllString(email_phone)){
                    ToastUtil.showToastDefault(this,"请输入注册号码");
                    return;
                }
                if(CheckUtils.isNUllString(password)){
                    ToastUtil.showToastDefault(this,"请输入密码");
                    return;
                }
                Member user = new Member();
                user.setEmail_phone(editText_name.getText().toString());
                user.setU_pwd(editText_password.getText().toString());
                NetHandler.getInstance().login(user, this);
                break;
        }
    }

    @Override
    public void onFailure(Call call, IOException e) {
        Log.d(TAG,"onFailure:"+e);
    }

    @Override
    public void onResponse(Call call, Response response) throws IOException {
        RequestResult result = new Gson().fromJson(response.body().string(), RequestResult.class);
            if(result.getSuccess().equals("true")&&result.getStatus().equals("true")){
                Log.d(TAG,"login success");
                Intent intent = new Intent(this,MainActivity.class);
                startActivity(intent);
            }else{
                Log.d(TAG,"login failed"+result.getMess());
            }
    }


}
