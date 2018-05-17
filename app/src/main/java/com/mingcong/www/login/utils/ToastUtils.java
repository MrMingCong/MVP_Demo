package com.mingcong.www.login.utils;

import android.content.Context;
import android.view.View;
import android.widget.Toast;


/**
 * Created by wjsay on 2017/12/25.
 */

public class ToastUtils {
    private Toast toast;
    private View view;
    static ToastUtils instance;

    private ToastUtils(Context context) {

        toast = new Toast(context);

        view = Toast.makeText(context, "", Toast.LENGTH_SHORT).getView();

        toast.setView(view);

    }

    public static ToastUtils getInstance(Context context) {

        if (instance == null) {

            instance = new ToastUtils(context);

        }

        return instance;

    }

    public void show(String msg) {

        toast.setText(msg);

        toast.setDuration(Toast.LENGTH_SHORT);

        toast.show();
    }


}
