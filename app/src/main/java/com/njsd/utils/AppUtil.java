package com.njsd.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.Vibrator;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AppUtil {
    public static final double MONEY_EPS = 0.0001;
    private static long lastClickTime;
    private static final String TAG = "AppUtil";


    /**
     * 获取Asserts下的资源文件内容
     *
     * @param fileName
     * @return
     */
    public static String getFromAssets(Context context, String fileName) {
        String Result = "";
        InputStreamReader inputReader = null;
        BufferedReader bufReader = null;
        try {
            inputReader = new InputStreamReader(context.getResources().getAssets().open(fileName));
            bufReader = new BufferedReader(inputReader);
            String line = "";
            while ((line = bufReader.readLine()) != null) {
                Result += line;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufReader != null) {
                    bufReader.close();
                }
                if (inputReader != null) {
                    inputReader.close();
                }
            } catch (IOException e) {
            }
        }
        return Result;
    }

    /**
     * 防止按钮连续点击
     *
     * @param @return 设定文件
     * @return boolean 返回类型
     * @throws
     * @Title: isFastDoubleClick
     */
    public static boolean isFastDoubleClick() {
        long time = System.currentTimeMillis();
        long timeD = time - lastClickTime;
        if (0 < timeD && timeD < 2500) {
            return true;
        }
        lastClickTime = time;
        return false;
    }

    /**
     * 设备的 唯一码
     *
     * @param @param  context
     * @param @return 设定文件
     * @return String 返回类型
     * @throws
     * @Title: isDeviceID
     */
    public static String getDeviceID(Context context) {
        final TelephonyManager tm = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
        final String tmDevice, tmSerial, tmPhone, androidId;
        tmDevice = "" + tm.getDeviceId();
        tmSerial = "" + tm.getSimSerialNumber();
        androidId = ""
                + android.provider.Settings.Secure.getString(context.getContentResolver(),
                android.provider.Settings.Secure.ANDROID_ID);
        UUID deviceUuid = new UUID(androidId.hashCode(), ((long) tmDevice.hashCode() << 32) | tmSerial
                .hashCode());
        String uniqueId = deviceUuid.toString();
        return uniqueId;
    }

    /**
     * @param @param context
     * @param @param file 设定文件
     * @return void 返回类型
     * @throws
     * @Title: openApk
     */
    public static void openApk(Context context, File file) {
        Intent intent = new Intent();
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.setAction(Intent.ACTION_VIEW);
        String type = getMIMEType(file);
        intent.setDataAndType(Uri.fromFile(file), type);
        context.startActivity(intent);
    }

    /* 判断文件MimeType */
    private static String getMIMEType(File f) {
        String type = "";
        String fName = f.getName();
        /* 取得扩展名 */
        String end = fName.substring(fName.lastIndexOf(".") + 1, fName.length()).toLowerCase(Locale.US);
        /* 依扩展名的类型决定MimeType */
        if (end.equals("m4a") || end.equals("mp3") || end.equals("mid") || end.equals("xmf") || end.equals
                ("ogg")
                || end.equals("wav")) {
            type = "audio";
        } else if (end.equals("3gp") || end.equals("mp4")) {
            type = "video";
        } else if (end.equals("jpg") || end.equals("gif") || end.equals("png") || end.equals("jpeg")
                || end.equals("bmp")) {
            type = "image";
        } else if (end.equals("apk")) {
            /* android.permission.INSTALL_PACKAGES */
            type = "application/vnd.android.package-archive";
        } else {
            type = "*";
        }
        /* 如果无法直接打开，就跳出软件列表给用户选择 */
        if (!end.equals("apk")) {
            type += "/*";
        }

        return type;
    }

    /**
     * @param context
     * @return boolean
     * @Title: 获取手机所有连接管理对象（包括对wi-fi,net等连接的管理）
     */
    public static boolean checkNet(Context context) {
        try {
            ConnectivityManager cManager = (ConnectivityManager) context.getSystemService(Context
                    .CONNECTIVITY_SERVICE);

            if (cManager != null) {
                // 获取网络连接对象
                NetworkInfo info = cManager.getActiveNetworkInfo();
                if (info != null && info.isConnected()) {
                    // 判断当前网络是否已经连接
                    if (info.getState() == NetworkInfo.State.CONNECTED) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            // e.printStackTrace();
        }
        return false;
    }

    /**
     * @param context
     * @return String
     * @Title:获取设备的唯一标示IMEI
     */
    public static String getImei(Context context) {
        TelephonyManager tm = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
        String imei = tm.getDeviceId();
        return imei;
    }

    /**
     * @return
     * @Title: 判断SDCard是否存在
     */
    public static boolean isExistSDCard() {
        if (Environment.getExternalStorageState().endsWith(Environment.MEDIA_MOUNTED)) {
            return true;
        }
        return false;
    }

    /**
     * 检测SD卡剩余容量
     *
     * @return
     */
    public static int getSDCardRemainingSpace() {
        String sdcard = Environment.getExternalStorageDirectory().getPath();
        File file = new File(sdcard);
        StatFs statFs = new StatFs(file.getPath());
        int remainingSpace = (int) (statFs.getBlockSize() * ((long) statFs.getAvailableBlocks() - 4));

        return remainingSpace;
    }

    /**
     * BitmapDrawable
     *
     * @param imgURL
     * @return
     */
    public static BitmapDrawable downloadBitmapDrawable(String imgURL) {
        BitmapDrawable icon = null;
        try {
            URL url = new URL(imgURL);
            HttpURLConnection hc = (HttpURLConnection) url.openConnection();
            icon = new BitmapDrawable(hc.getInputStream());
        } catch (Exception e) {
            // e.printStackTrace();
            return null;
        }
        return icon;
    }

    /**
     * Bitmap url 拿到 bitmap
     *
     * @param url
     * @return
     */
    public static Bitmap returnBitMap(String url, Context c) {
        URL myFileUrl = null;
        Bitmap bitmap = null;
        Resources res = c.getResources();
        try {
            myFileUrl = new URL(url);
            HttpURLConnection conn = (HttpURLConnection) myFileUrl.openConnection();
            conn.setDoInput(true);
            conn.connect();
            /*
             * String cookieval = conn.getHeaderField("set-cookie");
			 * if(cookieval != null) { String sess = cookieval.substring(0,
			 * cookieval.indexOf(";")); String id[]=sess.split("=");
			 * GlobalClass.SESSIONID =id[1];
			 * }
			 */
            InputStream is = conn.getInputStream();
            bitmap = BitmapFactory.decodeStream(is);
            is.close();
        } catch (Exception e) {
            // e.printStackTrace();
        }
        return bitmap;
    }

    // 获得圆角图片的方法
    public static Bitmap getRoundedCornerBitmap(Bitmap bitmap, float roundPx) {
        Bitmap output = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Config.ARGB_8888);
        Canvas canvas = new Canvas(output);

        final int color = 0xff424242;
        final Paint paint = new Paint();
        final Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        final RectF rectF = new RectF(rect);

        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(color);
        canvas.drawRoundRect(rectF, roundPx, roundPx, paint);

        paint.setXfermode(new PorterDuffXfermode(Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);

        return output;
    }

    /**
     * @param urlStr
     * @return
     */
    public static String getSessionid(String urlStr) {
        String sess = "";
        try {
            URL url = new URL(urlStr);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            String cookieval = conn.getHeaderField("set-cookie");
            if (cookieval != null) {
                sess = cookieval.substring(0, cookieval.indexOf(";"));
            }
        } catch (MalformedURLException e) {
            // e.printStackTrace();
        } catch (IOException e) {
            // e.printStackTrace();
        }
        return sess;

    }

    /**
     * url InputStream
     *
     * @param imageURL
     * @return
     */
    public static InputStream getStreamFromURL(String imageURL) {
        InputStream in = null;
        try {
            URL url = new URL(imageURL);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            in = connection.getInputStream();
        } catch (Exception e) {
            // e.printStackTrace();
        }
        return in;

    }

    /**
     * 判断文件可存在
     *
     * @param fullName
     * @return
     */
    public static boolean isExistFile(String fullName) {
        if (TextUtils.isEmpty(fullName)) {
            return false;
        }

        File file = new File(fullName);
        if (file.exists()) {
            return true;
        }
        return false;
    }

    /**
     * 删除文件
     *
     * @param fullName
     */
    public static boolean deleteFile(String fullName) {
        if (!TextUtils.isEmpty(fullName)) {
            File file = new File(fullName);
            if (file.exists()) {
                return file.delete();
            }
        }
        return false;
    }

    /**
     * 删文件夹下面的文件
     *
     * @param file 2013-7-02
     */
    public static void deleteFile(File file) {

        if (file.exists()) { // 判断文件是否存在
            if (file.isFile()) { // 判断是否是文件
                file.delete(); // delete()方法 你应该知道 是删除的意思;
            } else if (file.isDirectory()) { // 否则如果它是一个目录
                File files[] = file.listFiles(); // 声明目录下所有的文件 files[];
                for (int i = 0; i < files.length; i++) { // 遍历目录下所有的文件
                    deleteFile(files[i]); // 把每个文件 用这个方法进行迭代
                }
            }
            file.delete();
        } else {
        }
    }

    /**
     * 判断网络 所有的的网络 是否已经连接
     *
     * @return boolean 返回类型
     * @Title: isNetworkAvailable
     * @Description: (判断网络)
     */
    public static boolean isNetworkAvailable(Context cont) {

        Context context = cont.getApplicationContext();
        ConnectivityManager connectivity = (ConnectivityManager) context.getSystemService(Context
                .CONNECTIVITY_SERVICE);

        if (connectivity == null) {
            return false;
        } else {
            NetworkInfo[] infos = connectivity.getAllNetworkInfo();
            if (infos != null) {
                for (int i = 0; i < infos.length; i++) {
                    if (infos[i].getState() == NetworkInfo.State.CONNECTED) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /**
     * 只判断wifi
     *
     * @return
     */
    public static boolean isWifiNetworkAvailable(Context cont) {

        Context context = cont.getApplicationContext();
        ConnectivityManager connectivity = (ConnectivityManager) context.getSystemService(Context
                .CONNECTIVITY_SERVICE);

        if (connectivity == null) {
            return false;
        } else {
            NetworkInfo[] infos = connectivity.getAllNetworkInfo();
            if (infos != null) {
                for (int i = 0; i < infos.length; i++) {
                    if (infos[i].getType() == ConnectivityManager.TYPE_WIFI
                            && infos[i].getState() == NetworkInfo.State.CONNECTED) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /*
     * ***************************************时间的处理******************************
     * **************************
     */
    public static String getDateStringFromDate(Date date) {
        SimpleDateFormat formatter;
        formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA);
        String dateString = formatter.format(date);
        return dateString.trim();
    }

    public static Date getDateFromDateString(String dateStr) {
        SimpleDateFormat formatter;
        Date date = null;
        formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA);
        try {
            date = (Date) formatter.parse(dateStr);
            return date;
        } catch (ParseException e) {
            // e.printStackTrace();
        }
        return null;
    }

    public static String getDateFromDatelong(long dateStr) {
        String time;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss", Locale.US);
        try {
            time = sdf.format(new Date(dateStr)).toString();
            return time;
        } catch (Exception e) {
            // e.printStackTrace();
        }
        return null;
    }

    // "yyyy-MM-dd HH:mm"
    public static Date getDateFromDateStringWithoutss(String dateStr, String template) {
        SimpleDateFormat formatter;
        Date date = null;
        formatter = new SimpleDateFormat(template, Locale.CHINA);
        try {
            date = (Date) formatter.parse(dateStr);
        } catch (ParseException e) {
            // e.printStackTrace();
        }
        return date;
    }


    /**
     * 检测是否连接wifi
     *
     * @param context
     * @return
     */
    public static boolean isWifiConnected(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context
                .getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo wifiNetworkInfo = connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
        if (wifiNetworkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    /**
     * *************** 2014年7月4日13:46:45 ***********************
     */
    public static boolean isCard(String idNum) {

        boolean flag = false;
        Pattern idNumPattern = Pattern.compile("(\\d{14}[0-9a-zA-Z])|(\\d{17}[0-9a-zA-Z])");
        // 通过Pattern获得Matcher
        Matcher idNumMatcher = idNumPattern.matcher(idNum);
        // 判断用户输入是否为身份证号
        if (idNumMatcher.matches()) {
            // 如果是，定义正则表达式提取出身份证中的出生日期
            Pattern birthDatePattern = Pattern.compile("\\d{6}(\\d{4})(\\d{2})(\\d{2}).*");// 身份证上的前6位以及出生年月日
            // 通过Pattern获得Matcher
            Matcher birthDateMather = birthDatePattern.matcher(idNum);
            // 通过Matcher获得用户的出生年月日
            if (birthDateMather.find()) {
                String year = birthDateMather.group(1);
                String month = birthDateMather.group(2);
                String date = birthDateMather.group(3);
                // 输出用户的出生年月日
            }
            flag = true;
        } else {
            // 如果不是，输出信息提示用户
            flag = false;
        }

        return flag;

    }

    // 身份证验证
    public static boolean regSFZ(String sfzhm) {
        boolean flag = false;
        // 18
        // ^[1-9]\d{5}[1-9]\d{3}((0\d)|(1[0-2]))(([0|1|2]\d)|3[0-1])\d{3}([0-9]|X)$
        // 15
        // ^[1-9]\d{7}((0\d)|(1[0-2]))(([0|1|2]\d)|3[0-1])\d{3}$
        Pattern patternSfzhm1 = Pattern
                .compile("^[1-9]\\d{5}[1-9]\\d{3}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}([0-9]|X)$");
        Pattern patternSfzhm2 = Pattern.compile("^[1-9]\\d{7}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}$");
        Matcher matcherSfzhm1 = patternSfzhm1.matcher(sfzhm);
        Matcher matcherSfzhm2 = patternSfzhm2.matcher(sfzhm);

        if (!matcherSfzhm1.find() && !matcherSfzhm2.find()) {
            // showToast("身份证号码格式不正确，请重新输入！");
            flag = false;
        } else {
            flag = true;
        }

        return flag;
    }

    /**
     * 获取系统版本
     *
     * @return
     */
    public static String getSystemVersion() {
        return Build.VERSION.RELEASE;
    }

    /**
     * 获取SDK版本
     *
     * @return
     */
    public static int getSDKVersion() {
        return Build.VERSION.SDK_INT;
    }

    /**
     * 获取设备型号
     *
     * @return
     */
    public static String getDeviceModel() {
        return Build.MODEL;
    }

    /**
     * 获取当前网络类型
     *
     * @param mContext 上下文环境
     * @return
     */
    public static String getNetworkType(Context mContext) {
        ConnectivityManager cm = (ConnectivityManager) mContext.getSystemService(Context
                .CONNECTIVITY_SERVICE);
        NetworkInfo ni = cm.getActiveNetworkInfo();
        if (ni == null) {
            return "null";
        }
        return ni.getTypeName();
    }

    /**
     * 获取当前系统语言环境
     *
     * @param mContext 上下文环境
     * @return
     */
    public static String getSystemLanguage(Context mContext) {
        Locale mLocale = mContext.getResources().getConfiguration().locale;
        return mLocale.getLanguage();
    }

    /**
     * 获取当前系统时区
     *
     * @return
     */
    public static String getSystemTimeZone() {
        TimeZone tz = TimeZone.getDefault();
        return tz.getDisplayName(false, TimeZone.SHORT);
    }

    /**
     * 输出日志到sd卡
     */
    public static void writeLog2SDCard(String log) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
        SimpleDateFormat logfile = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        String MYLOG_PATH_SDCARD_DIR = Environment.getExternalStorageDirectory().getPath();
        String MYLOGFILEName = "KSPushLog.txt";
        Date nowtime = new Date();
        String needWriteFiel = logfile.format(nowtime);
        String needWriteMessage = sdf.format(nowtime) + "    " + log + "\n";
        File file = new File(MYLOG_PATH_SDCARD_DIR, needWriteFiel + MYLOGFILEName);
        try {
            FileWriter filerWriter = new FileWriter(file, true);
            BufferedWriter bufWriter = new BufferedWriter(filerWriter);
            bufWriter.write(needWriteMessage);
            bufWriter.newLine();
            bufWriter.close();
            filerWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 从asset路径下读取对应文件转String输出
     *
     * @param mContext
     * @return
     */
    public static String getJson(Context mContext, String fileName) {
        StringBuilder sb = new StringBuilder();
        AssetManager am = mContext.getAssets();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(am.open(fileName)));
            String next = "";
            while (null != (next = br.readLine())) {
                sb.append(next);
            }
        } catch (IOException e) {
            e.printStackTrace();
            sb.delete(0, sb.length());
        }
        return sb.toString().trim();
    }

    /**
     * 隐藏软键盘
     *
     * @param context
     * @param view
     */
    public static void hide_keyboard_from(Context context, View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) context
                .getSystemService(Activity.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    /**
     * 显示软键盘
     *
     * @param context
     * @param view
     */
    public static void show_keyboard_from(Context context, View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) context
                .getSystemService(Activity.INPUT_METHOD_SERVICE);
        inputMethodManager.showSoftInput(view, InputMethodManager.SHOW_FORCED);
    }

    /**
     * 获取屏幕宽度
     *
     * @param mContext
     * @return
     */
    public static int getWindowWidth(Context mContext) {
        WindowManager wm = (WindowManager) mContext.getSystemService(Context.WINDOW_SERVICE);
        return wm.getDefaultDisplay().getWidth();
    }

    public static Point getScreenSize(Context context) {
        Point point = new Point();
        WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.HONEYCOMB_MR2) {
            wm.getDefaultDisplay().getSize(point);
        } else {
            Display display = wm.getDefaultDisplay();
            point.x = display.getWidth();
            point.y = display.getHeight();
        }
        return point;
    }

    public static boolean checkMapContainsAllKeys(Map<String, ?> map, String[] keys) {

        for (String key : keys) {
            if (!map.containsKey(key)) {
                return false;
            }
        }
        return true;
    }

    /**
     * @param content
     * @return
     * @description 获取一段字符串的字符个数（包含中英文，一个中文算2个字符）
     */
    public static int getCharacterNum(final String content) {
        if (TextUtils.isEmpty(content)) {
            return 0;
        } else {
            return (content.length() + getChineseNum(content));
        }
    }


    /**
     * @param s
     * @return
     * @description 返回字符串里中文字或者全角字符的个数
     */
    public static int getChineseNum(String s) {
        int num = 0;
        char[] myChar = s.toCharArray();
        for (int i = 0; i < myChar.length; i++) {
            if ((char) (byte) myChar[i] != myChar[i]) {
                num++;
            }
        }
        return num;
    }

    /**
     * 显示提示语
     *
     * @param context
     * @param msg
     */
    public static void showTip(Context context, String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show();
    }

    /**
     * 显示提示语
     *
     * @param context
     * @param resId
     */
    public static void showTip(Context context, int resId) {
        showTip(context, context.getString(resId));
    }

    /**
     * 获取指定长度的字符串（中文字或者全角字符算2个长度，英文1个）
     *
     * @param src
     * @param len
     * @return
     */
    public static String getCharacters(String src, int len) {
        String dst = "";
        int count = 0;
        if (!TextUtils.isEmpty(src)) {
            for (int i = 0; i < src.length(); i++) {
                if (getChineseNum(src.substring(i, i + 1)) != 0) {
                    count += 2;
                } else {
                    count += 1;
                }
                if (count > len) {
                    break;
                } else {
                    dst += src.substring(i, i + 1);
                }
            }
        }
        return dst;
    }

    /**
     * 播放铃声
     */
    public static MediaPlayer mRingTonePlayer;

    public static void startRingTone(Context context) {
        ((AudioManager) context.getSystemService(Context.AUDIO_SERVICE)).setMode(AudioManager.MODE_NORMAL);
        if (mRingTonePlayer == null) {
            mRingTonePlayer = new MediaPlayer();
        } else {
            mRingTonePlayer.reset();
        }
        try {
            AssetManager am = context.getAssets();
            AssetFileDescriptor fd = am.openFd("ring.mp3");
            mRingTonePlayer.setDataSource(fd.getFileDescriptor(), fd.getStartOffset(), fd.getLength());

            final AudioManager audioManager = (AudioManager) context.getSystemService(Context.AUDIO_SERVICE);

            if (audioManager.getStreamVolume(AudioManager.STREAM_RING) != 0) {
                mRingTonePlayer.setAudioStreamType(AudioManager.STREAM_RING);
                mRingTonePlayer.setLooping(false);
                mRingTonePlayer.prepare();
                mRingTonePlayer.start();
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 震动
     *
     * @param context
     * @param timelong
     */
    public static void startVibrate(Context context, long timelong) {
        Vibrator vibrator = (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);
        if (vibrator == null) {
            Vibrator localVibrator = (Vibrator) context.getApplicationContext().getSystemService(Context
                    .VIBRATOR_SERVICE);
            vibrator = localVibrator;
        }
        vibrator.vibrate(timelong);
    }

    /**
     * 获取缓存目录
     *
     * @param context
     * @return
     */
    public static File getCacheDir(Context context, String cacheDir) {
        File appCacheDir = null;
        if (Environment.MEDIA_MOUNTED.equals(Environment.getExternalStorageState()) &&
                hasExternalStoragePermission(context)) {
            appCacheDir = new File(Environment.getExternalStorageDirectory(), cacheDir);
        }

        if (appCacheDir == null || !appCacheDir.exists() && !appCacheDir.mkdirs()) {
            appCacheDir = context.getCacheDir();
        }

        return appCacheDir;
    }

    public static boolean hasExternalStoragePermission(Context context) {
        int perm = context.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE");
        return perm == 0;
    }

    //判断传过来的参数是不是数字
    public static boolean isNumeric(String str) {
        Pattern pattern = Pattern.compile("[0-9]*");
        Matcher isNum = pattern.matcher(str);
        if (!isNum.matches()) {
            return false;
        }
        return true;
    }

    public static int parseInt(String str) {
        try {
            return Integer.parseInt(str);
        } catch (Exception e) {

        }
        return 0;
    }
}
