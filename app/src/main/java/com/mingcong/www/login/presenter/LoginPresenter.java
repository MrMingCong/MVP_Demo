package com.mingcong.www.login.presenter;

import android.os.Handler;

import com.mingcong.www.login.mode.CallLoginListener;
import com.mingcong.www.login.mode.Logic;
import com.mingcong.www.login.mode.UserBean;
import com.mingcong.www.login.mode.UserLogin;
import com.mingcong.www.login.view.UserLoginView;

/**
 * Created by Administrator on 2018/5/17.
 */

public class LoginPresenter {
    private UserLogin userBiz;
    private UserLoginView userLoginView;
    private Handler mHandler = new Handler();

    public LoginPresenter(UserLoginView userLoginView) {
        this.userLoginView = userLoginView;
        this.userBiz = new Logic();
    }

    public void Login() {
        userLoginView.showLoading();
        userBiz.login(userLoginView.getUserName(), userLoginView.getPassword(), new CallLoginListener() {
            @Override
            public void loginSuccess(final UserBean userbean) {
                //需要在UI线程执行
                mHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        userLoginView.goMainActivity(userbean);
                        userLoginView.hideLoading();
                    }
                });

            }

            @Override
            public void loginFailed() {
                //需要在UI线程执行
                mHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        userLoginView.showLoginFailedError();
                        userLoginView.hideLoading();
                    }
                });

            }
        });
    }

    public void clear() {
        userLoginView.clearUserName();
        userLoginView.clearPassword();
    }


}