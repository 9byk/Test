package com.bw.testmvp;

import com.bw.mylibrary.MyRetrofit;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * @ClassName TestModel
 * @Description TODO
 * @Author 张溢通
 * @Date 2021/9/9 19:27
 * @Version 1.0
 * Created by Android Studio.
 * User: 伊莎贝拉
 */
public class TestModel implements jk.TestModel {
    @Override
    public Observable<BeanFood> cs(int a, int b, int c) {
        api api=MyRetrofit.get( ).getRetrofit( ).create(api.class);
        return api.get(a,b,c);
    }
}
