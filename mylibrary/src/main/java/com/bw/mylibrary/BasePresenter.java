package com.bw.mylibrary;

/**
 * @ClassName BasePresenter
 * @Description TODO
 * @Author 张溢通
 * @Date 2021/9/9 19:09
 * @Version 1.0
 * Created by Android Studio.
 * User: 伊莎贝拉
 */
public abstract class BasePresenter<R extends BaseRepository,V extends IView> {

    protected R repository;
    protected V view;

    public BasePresenter() {
        repository=createR();
        view=createv();
    }

    protected abstract V createv();

    protected abstract R createR();


}
