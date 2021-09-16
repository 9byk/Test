package com.bw.testmvp;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * @ClassName api
 * @Description TODO
 * @Author 张溢通
 * @Date 2021/9/9 20:03
 * @Version 1.0
 * Created by Android Studio.
 * User: 伊莎贝拉
 */
public interface api {
    @GET("dish_list.php?")
    Observable<BeanFood> get(@Query("stage_id") int a,@Query("limit") int b,@Query("page") int c);
}
