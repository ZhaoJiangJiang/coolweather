package android.coolweather.com.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by 赵江江 on 2018/8/2.
 * 用于和服务器交互
 */

public class HttpUtil {

    public static void sendOkHttpRequest(String address, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
