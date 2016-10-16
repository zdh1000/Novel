package cn.zdh1000.novel.utils.http;

/**
 * Created by Administrator(wdzdh@qq.com) on 2016/10/15.
 */

/**
 * HttpURLConnection网络请求返回监听器
 */
public interface HttpCallbackListener {
    // 网络请求成功
    void onFinish(byte[] response);

    // 网络请求失败
    void onError(Exception e);
}