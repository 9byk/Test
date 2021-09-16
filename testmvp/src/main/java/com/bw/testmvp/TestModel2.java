package com.bw.testmvp;

import com.bw.mylibrary.MyRetrofit;

import io.reactivex.Observable;

/**
 * @ClassName TestModel2
 * @Description TODO
 * @Author 张溢通
 * @Date 2021/9/11 9:24
 * @Version 1.0
 * Created by Android Studio.
 * User: 伊莎贝拉
 */
public class TestModel2 implements jk.TestModel{
    @Override
    public Observable<BeanFood> cs(int a, int b, int c) {
        api api=MyRetrofit.get( ).getRetrofit( ).create(api.class);
        return api.get(a,b,c+1);
    }
}
