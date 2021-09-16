package com.bw.testmvp.dagger;

import com.bw.mylibrary.BaseRepository;
import com.bw.testmvp.TestRepository;

import dagger.Component;
import dagger.Provides;

/**
 * @ClassName MvpModel
 * @Description TODO
 * @Author 张溢通
 * @Date 2021/9/11 8:32
 * @Version 1.0
 * Created by Android Studio.
 * User: 伊莎贝拉
 */

@Component(modules=MyModule.class)
public interface MvpModel {

    void cs(TestRepository cs);

}
