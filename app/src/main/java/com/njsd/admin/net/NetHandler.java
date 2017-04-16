package com.njsd.admin.net;


import com.njsd.admin.pojo.Member;
import com.njsd.admin.pojo.News;
import com.njsd.admin.pojo.Shengxiao;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by 费辉 on 2017/4/10.
 * 用来处理app跟服务器接口
 */

public class NetHandler {

    private static final String TAG ="NetHandler";


    public static final String ROOT = "http://www.vmpingtai.com";//域名地址
    public static final String LOGIN = ROOT+"/user/login.action";//用户登录接口
    public static final String VerifyCodeImg = ROOT+"/VerifyCodeImg.action";//验证码接口
    public static final String REG = ROOT+"/user/reg.action";//注册接口
    public static final String MODIMYSELF = ROOT+"/home/modimyself.action";//修改个人信息
    public static final String UPDATEIMG  = ROOT+"/home/updateimg.action";  //修改头像
    public static final String UPPWD = ROOT+"/home/uppwd.action";//修改密码
    public static final String UPPAYPWD = ROOT+"/home/uppaypwd.action";//修改支付密码
    public static final String UPDATE_SHOUYI = ROOT+"/home/update_shouyi.action";//收益状态接口
    public static final String SHOUYI_XIAJI = ROOT+"home/shouyi_xiaji.action";//手动收益下级
    public static final String JIHUO = ROOT+"/home/jihuo.action";//激活生肖
    public static final String GETSTUDYMONEY = ROOT+"/home/getStudyMoney.action";//收获学分
    public static final String XUEFENRUKU  = ROOT+"/home/xuefenruku.action";//学分入库
    public static final String XUEFENGUIWEI = ROOT+"/home/xuefenguiwei.action";//学分归为
    public static final String GUIZE = ROOT+"/app/guize.action";//游戏规则
    public static final String DOACTIVE = ROOT+"/home/doActive.action";//我要付款,我要打款,确定打款
    public static final String SHANGJI = ROOT+"/app/shangji.action";//上级推广人,最新推广
    public static final String SHENGXIAO = ROOT+"/app/shengxiao.action";//查询生肖

    public static final MediaType JSON
            = MediaType.parse("application/json; charset=utf-8");

    private OkHttpClient client;

    private static NetHandler mNetHandler;

    private NetHandler() {
        client = new OkHttpClient();
    }

    public static NetHandler getInstance(){
        if(mNetHandler==null)
            mNetHandler = new NetHandler();
        return mNetHandler;
    }

    /**
     * 登录
     * @param user 用户
     * @param callback 回调，网络数据返回回调
     */
    public void login(Member user, Callback callback){

        Map<String,String> params = new HashMap();
        params.put("user.email_phone",user.getEmail_phone());
        params.put("user.u_pwd",user.getU_pwd());

        request(LOGIN,params,callback);

    }


    /**
     * 验证码接口
     * @param callback 回调，网络数据返回回调
     */
    public void verifyCodeImg(Callback callback){

    }

    /**
     * 注册
     * @param user 用户
     * @param callback 回调，网络数据返回回调
     */
    public void reg(Member user,Callback callback){

    }

    /**
     * 修改个人信息
     * @param user 用户
     * @param callback 回调，网络数据返回回调
     */
    public void modimyself(Member user,Callback callback){

    }

    /**
     * 更新头像
     * @param user
     * @param callback 回调，网络数据返回回调
     */
    public void updateimg(Member user,Callback callback){

    }

    /**
     * 更新密码
     * @param user
     * @param callback 回调，网络数据返回回调
     */
    public void uppwd(Member user,Callback callback){

    }

    /**
     * 更新支付密码
     * @param user
     * @param callback 回调，网络数据返回回调
     */
    public void uppaypwd(Member user,Callback callback){

    }

    /**
     * 更新收益
     * @param user
     * @param callback 回调，网络数据返回回调
     */
    public void update_shouyi(Member user,Callback callback){

    }

    /**
     * 手动收益下级
     * @param user
     * @param callback 回调，网络数据返回回调
     */
    public void shouyi_xiaji(Member user,Callback callback){

    }

    /**
     * 激活生肖
     * @param sx
     * @param callback 回调，网络数据返回回调
     */
    public void jihuo(Shengxiao sx,Callback callback){

    }

    /**
     * 获取学分
     * @param news
     * @param callback 回调，网络数据返回回调
     */
    public void getStudyMoney(News news,Callback callback){

    }

    /**
     * 学分入库
     * @param callback 回调，网络数据返回回调
     */
    public void xuefenruku(Callback callback){

    }

    /**
     * 学分归为
     * @param callback 回调，网络数据返回回调
     */
    public void xuefenguiwei(Callback callback){

    }

    /**
     * 查询生肖
     * @param user
     * @param callback 回调，网络数据返回回调
     */
    public void myShengxiaoList(Member user,Callback callback){

    }

    /**
     * 规则
     * @param news
     * @param callback 回调，网络数据返回回调
     */
    public void guize(News news,Callback callback){

    }

    /**
     * 我要付款,我要打款,确定打款
     * @param sx
     * @param callback 回调，网络数据返回回调
     */
    public void doActive(Shengxiao sx,Callback callback){

    }

    /**
     * 上级推广人,最新推广
     * @param user
     * @param callback 回调，网络数据返回回调
     */
    public void shangji(Member user,Callback callback){

    }

    /**
     * 查询生肖
     * @param user
     * @param callback 回调，网络数据返回回调
     */
    public void shengxiao(Member user,Callback callback){

    }

    /**
     * 请求网络数据
     * @param url 请求数据的url地址
     * @param params url中包含的参数
     * @param callback 接收到数据的回调
     */
    private void request(String url, Map params,Callback callback){
        HttpUrl.Builder urlBuilder = HttpUrl.parse(url).newBuilder();
        Set<String> keys = params.keySet();
        for(String key:keys){
            urlBuilder.addQueryParameter(key,params.get(key).toString());
        }
        String URL = urlBuilder.build().toString();
        Request request = new Request.Builder().url(URL).build();

        client.newCall(request).enqueue(callback);
    }
}
