package com.njsd.utils;

import android.app.Activity;
import android.content.Context;

import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 创建时间:   2016/11/22
 * 编写者:    ZhangQing
 * <p>
 * 功能描述:
 */


public class ActivityManager {
    private Context context;

    private static ActivityManager activityManager;

    public static ActivityManager getActivityManager(Context context) {
        if (activityManager == null) {
            synchronized (ActivityManager.class) {
                if (activityManager == null) {
                    activityManager = new ActivityManager(context);
                }
            }
        }
        return activityManager;
    }

    private ActivityManager(Context context) {
        this.context = context;
    }

    /**
     * task map，用于记录activity栈，方便退出程序（这里为了不影响系统回收activity，所以用软引用）
     */
    private final HashMap<String, SoftReference<Activity>> taskMap = new HashMap<String,
            SoftReference<Activity>>();

    /**
     * 往应用task map加入activity
     */
    public final void putActivity(Activity atv) {
        taskMap.put(atv.toString(), new SoftReference<Activity>(atv));
    }

    /**
     * 删除应用task map中指定的activity
     */
    public final void removeActivity(Activity atv) {
        taskMap.remove(atv.toString());
    }

    /**
     * 清除应用的task栈，如果程序正常运行这会导致应用退回到桌面
     */
    public final void exit() {
        for (Iterator<Map.Entry<String, SoftReference<Activity>>> iterator = taskMap.entrySet().iterator();
             iterator.hasNext(); ) {
            SoftReference<Activity> activityReference = iterator.next().getValue();
            Activity activity = activityReference.get();
            if (activity != null) {
                activity.finish();
            }
        }
        taskMap.clear();
    }


}
