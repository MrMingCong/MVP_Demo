package com.mingcong.www.login.mode;

/**回调登录状态
 * Created by Administrator on 2018/5/17.
 */

public interface CallLoginListener {
    void loginSuccess(UserBean userbean);

    void loginFailed();
}
