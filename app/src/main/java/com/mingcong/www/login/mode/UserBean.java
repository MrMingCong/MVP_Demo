package com.mingcong.www.login.mode;

import java.io.Serializable;

/**java实体类
 * Created by Administrator on 2018/5/17.
 */

public class UserBean implements Serializable {
    private String username;
    private String password;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

