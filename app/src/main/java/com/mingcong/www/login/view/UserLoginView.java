package com.mingcong.www.login.view;

import com.mingcong.www.login.mode.UserBean;

/**
 * Created by Administrator on 2018/5/17.
 */

public interface  UserLoginView {

    //获取用户登录的名字
    String getUserName();
    //获取用户登录的密码
    String getPassword();
    //清除用户登录的名字
    void clearUserName();
    //清除用户登录的密码
    void clearPassword();
    //显示登录时的进度条
    void showLoading();
    //隐藏登录时的进度条
    void hideLoading();
    //去主界面
    void goMainActivity(UserBean userbean);
    //登录失败异常
    void showLoginFailedError();
}
