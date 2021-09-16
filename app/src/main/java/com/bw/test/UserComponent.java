package com.bw.test;

import java.lang.annotation.Target;

/**
 * @ClassName Component
 * @Description TODO
 * @Author 张溢通
 * @Date 2021/9/8 18:45
 * @Version 1.0
 * Created by Android Studio.
 * User: 伊莎贝拉
 */


@dagger.Component(modules={Model.class})
public interface UserComponent {
    void cs(MainActivity mainActivity);
}
