package com.bw.mylibrary;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @ClassName MyRetrofit
 * @Description TODO
 * @Author 张溢通
 * @Date 2021/9/3 13:48
 * @Version 1.0
 * Created by Android Studio.
 * User: 伊莎贝拉
 */
public class MyRetrofit {
    private static MyRetrofit myRetrofit;
    public  static MyRetrofit get(){
        if(myRetrofit==null){
            synchronized (MyRetrofit.class){
                if(myRetrofit==null){
                    myRetrofit=new MyRetrofit();
                }
            }
        }
        return myRetrofit;
    }

    //dish_list.php?stage_id=1&limit=20&page=1
    private Retrofit retrofit;
    public Retrofit getRetrofit(){
        if(retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl("http://www.qubaobei.com/ios/cf/")
                    .client(new OkHttpClient.Builder()
                            .addInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
                            .build())
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
