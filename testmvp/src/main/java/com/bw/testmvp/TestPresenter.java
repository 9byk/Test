package com.bw.testmvp;

import org.jetbrains.annotations.NotNull;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * @ClassName TestPresenter
 * @Description TODO
 * @Author 张溢通
 * @Date 2021/9/9 19:28
 * @Version 1.0
 * Created by Android Studio.
 * User: 伊莎贝拉
 */
public class TestPresenter extends jk.TestPresenter {

    @Override
    protected jk.TestIView createv() {
        return  new TestActivity();
    }

    @Override
    protected jk.TestRepository createR() {
        return  new TestRepository();
    }


    @Override
    void cs(int a, int b, int c) {
        repository.cs(a,b,c).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<BeanFood>( ) {
                    @Override
                    public void onSubscribe(@NotNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NotNull BeanFood beanFood) {
                        view.cg(beanFood);
                    }

                    @Override
                    public void onError(@NotNull Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
