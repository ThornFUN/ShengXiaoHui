package com.njsd.shengxiaohui;

import android.app.Application;

import com.njsd.utils.DisplayUtil;

/**
 * 创建时间:   2016/11/21
 * 编写者:    ZhangQing
 * <p>
 * 功能描述: 全局application变量.
 */

public class AppContext extends Application {

    private static AppContext singleInstance;
    private static int heightPixels;
    private static int widthPixels;

    public static AppContext getInstance() {
        return singleInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        singleInstance = this;
        // 获取屏幕高度
        heightPixels = DisplayUtil.getScreenHeight(this);
        //获取屏幕宽度
        widthPixels = DisplayUtil.getScreenWidth(this);


    }

    /**
     * 获取context对象
     *
     * @return context
     */
    public static Application getContext() {

        return singleInstance;
    }


}