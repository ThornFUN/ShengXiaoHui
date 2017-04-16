package com.njsd.utils;


/**
 * 创建时间:   2016/11/22
 * 编写者:    ZhangQing
 * <p>
 * 功能描述: Log 工具类
 */

public class Logger {

    private static final boolean DEBUG = true;

    public static void v(String tag, String msg) {
        if (DEBUG) {
            android.util.Log.v(tag, msg);
        }
    }

    public static void v(String tag, String msg, Throwable tr) {
        if (DEBUG) {
            android.util.Log.v(tag, msg, tr);
        }
    }

    public static void d(String tag, String msg) {
        if (DEBUG) {
            android.util.Log.d(tag, msg);
        }
    }

    public static void d(String tag, String msg, Throwable tr) {
        if (DEBUG) {
            android.util.Log.d(tag, msg, tr);
        }
    }

    public static void i(String tag, String msg) {
        if (DEBUG) {
            android.util.Log.i(tag, msg);
        }
    }

    public static void i(String tag, String msg, Throwable tr) {
        if (DEBUG) {
            android.util.Log.i(tag, msg, tr);
        }
    }

    public static void w(String tag, String msg) {
        if (DEBUG) {
            android.util.Log.w(tag, msg);
        }
    }

    public static void w(String tag, String msg, Throwable tr) {
        if (DEBUG) {
            android.util.Log.w(tag, msg, tr);
        }
    }

    public static void w(String tag, Throwable tr) {
        if (DEBUG) {
            android.util.Log.w(tag, tr);
        }
    }

    public static void e(String tag, String msg) {
        if (DEBUG) {
            android.util.Log.e(tag, msg);
        }
    }

    public static void e(String tag, String msg, Throwable tr) {
        if (DEBUG) {
            android.util.Log.e(tag, msg, tr);
        }
    }

    //规定每段显示的长度
    private static int LOG_MAXLENGTH = 2000;

    public static void longE(String TAG, String msg) {
        int strLength = msg.length();
        int start = 0;
        int end = LOG_MAXLENGTH;
//        for (int i = 0; i < 100; i++) {
//            //剩下的文本还是大于规定长度则继续重复截取并输出
//            if (strLength > end) {
//                Logger.e(TAG + i, msg.substring(start, end));
//                start = end;
//                end = end + LOG_MAXLENGTH;
//            } else {
//                Logger.e(TAG, msg.substring(start, strLength));
//                break;
//            }
//        }

        int i = 0;
        while(strLength > end){
            Logger.e(TAG + (++i), msg.substring(start, end));
            start = end;
            end = end + LOG_MAXLENGTH;
        }
        Logger.e(TAG, msg.substring(start, strLength));
    }
}
