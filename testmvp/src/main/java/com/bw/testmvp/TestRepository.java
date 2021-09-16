package com.bw.testmvp;

import com.bw.testmvp.dagger.DaggerMvpModel;

import javax.inject.Inject;
import io.reactivex.Observable;

/**
 * @ClassName TestRepository
 * @Description TODO
 * @Author 张溢通
 * @Date 2021/9/9 19:28
 * @Version 1.0
 * Created by Android Studio.
 * User: 伊莎贝拉
 */
public class TestRepository extends jk.TestRepository {

    @Inject
    TestModel model;

    @Inject
    TestModel2 model2;

    @Override
    Observable<BeanFood> cs(int a, int b, int c) {
        DaggerMvpModel.create().cs(this);
        return model2.cs(a,b,c);
    }

}
