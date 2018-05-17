package com.mingcong.www.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.mingcong.www.MainActivity;
import com.mingcong.www.R;
import com.mingcong.www.login.mode.UserBean;
import com.mingcong.www.login.presenter.LoginPresenter;
import com.mingcong.www.login.utils.ToastUtils;
import com.mingcong.www.login.view.UserLoginView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Administrator on 2018/5/17.
 */

public class LoginActivity extends Activity implements UserLoginView {
    @BindView(R.id.et_name)
    EditText mEtUsername;
    @BindView(R.id.et_password)
    EditText mEtPassword;
    @BindView(R.id.bt_login)
    Button mBtnLogin;
    @BindView(R.id.pd_login)
    ProgressBar mPdLogin;
    private LoginPresenter mLoginPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //绑定activity
        ButterKnife.bind(this);
        mLoginPresenter = new LoginPresenter(this);
    }

    @OnClick(R.id.bt_login)
    public void login(View v) {
        mLoginPresenter.Login();
    }

    @Override
    public String getUserName() {
        return mEtUsername.getText().toString();
    }

    @Override
    public String getPassword() {
        return mEtPassword.getText().toString();
    }

    @Override
    public void clearUserName() {

    }

    @Override
    public void clearPassword() {

    }

    @Override
    public void showLoading() {
        mPdLogin.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideLoading() {
        mPdLogin.setVisibility(View.GONE);
    }

    @Override
    public void goMainActivity(UserBean userbean) {
        ToastUtils.getInstance(getApplicationContext()).show("登录成功");
        startActivity(new Intent(this, MainActivity.class));
    }

    @Override
    public void showLoginFailedError() {
        ToastUtils.getInstance(getApplicationContext()).show("登录失败");
    }
}
