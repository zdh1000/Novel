package cn.zdh1000.novel.global.service;

import java.util.HashMap;

import cn.zdh1000.novel.global.api.NovelItemInfo;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Administrator(wdzdh@qq.com) on 2016/10/14.
 */

public interface NovelService {
    @GET("book/fuzzy-search")
    Call<String> searchBooks(@Query("query") String name);

    @GET("xml.php")
    Call<String> searchWeather(@Query("city") String name,@Query("password") String password,@Query("day") int day);
}
