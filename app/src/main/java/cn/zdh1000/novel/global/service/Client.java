package cn.zdh1000.novel.global.service;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/**
 * Created by Administrator(wdzdh@qq.com) on 2016/10/14.
 */

public class Client {
    public static String root = "http://api.zhuishushenqi.com/";
    public static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(root)
            .addConverterFactory(ScalarsConverterFactory.create())
            .build();
    public static NovelService service = retrofit.create(NovelService.class);
}
