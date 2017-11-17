package com.example.mcweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by 西安 on 2017/11/17.
 */

public class HttpUtil {
    public static void sendOkHttpRequst(String address,okhttp3.Callback callback){
        OkHttpClient client=new OkHttpClient();
        Request request=new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
