package com.bw.testmvp.dagger;


import com.bw.testmvp.TestModel;
import com.bw.testmvp.TestModel2;

import dagger.Module;
import dagger.Provides;

/**
 * @ClassName MyModule
 * @Description TODO
 * @Author 张溢通
 * @Date 2021/9/11 8:22
 * @Version 1.0
 * Created by Android Studio.
 * User: 伊莎贝拉
 */

@Module
public class MyModule {

    @Provides
    public TestModel getModel(){
        return new TestModel();
    }

    @Provides
    public TestModel2 getModel2(){
        return new TestModel2();
    }

}
