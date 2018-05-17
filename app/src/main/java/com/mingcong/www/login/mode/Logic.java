package com.mingcong.www.login.mode;

import android.os.Handler;

/**处理请求
 * Created by Administrator on 2018/5/17.
 */

public class Logic implements UserLogin{
    private Handler mHandler = new Handler();
    @Override
    public void login(final String username, final String password, final CallLoginListener loginListener) {
        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //模拟登录成功
                if ("123456".equals(username) && "123456".equals(password))
                {
                    UserBean userbean = new UserBean();
                    userbean.setUsername(username);
                    userbean.setPassword(password);
                    loginListener.loginSuccess(userbean);
                } else
                {
                    loginListener.loginFailed();
                }
            }
        }, 3000);
    }
}
