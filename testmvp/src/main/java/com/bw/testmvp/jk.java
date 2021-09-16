package com.bw.testmvp;

import com.bw.mylibrary.BasePresenter;
import com.bw.mylibrary.BaseRepository;
import com.bw.mylibrary.IModel;
import com.bw.mylibrary.IView;

import io.reactivex.Observable;

/**
 * @ClassName jk
 * @Description TODO
 * @Author 张溢通
 * @Date 2021/9/9 19:21
 * @Version 1.0
 * Created by Android Studio.
 * User: 伊莎贝拉
 */
public interface jk {

    interface TestModel extends IModel{
        Observable<BeanFood> cs(int a, int b, int c);
    }


    abstract class TestRepository extends BaseRepository<TestModel>{
        abstract  Observable<BeanFood> cs(int a, int b, int c);
    }

    interface TestIView extends IView {

        void cg(BeanFood s);
        void sb(String  s);
    }

    abstract class TestPresenter extends BasePresenter<TestRepository,TestIView>{
        abstract void cs(int a, int b, int c);
    }

}
