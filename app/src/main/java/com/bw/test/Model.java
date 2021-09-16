package com.bw.test;

import dagger.Module;
import dagger.Provides;

/**
 * @ClassName Model
 * @Description TODO
 * @Author 张溢通
 * @Date 2021/9/8 18:44
 * @Version 1.0
 * Created by Android Studio.
 * User: 伊莎贝拉
 */
@Module
public class Model {

    @Provides
    public User get(){
        return new User();
    }

}
