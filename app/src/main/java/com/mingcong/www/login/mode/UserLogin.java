package com.mingcong.www.login.mode;

/**
 * Created by Administrator on 2018/5/17.
 */

public interface UserLogin {
     void login(String username, String password, CallLoginListener loginListener);
}
