package com.bw.mylibrary;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * @ClassName BaseMVPActivity
 * @Description TODO
 * @Author 张溢通
 * @Date 2021/9/9 19:06
 * @Version 1.0
 * Created by Android Studio.
 * User: 伊莎贝拉
 */
public abstract class BaseMVPActivity<P extends BasePresenter> extends AppCompatActivity {
    protected P presenter;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(getLayoutId());
        initData(savedInstanceState);
        initEvent();
    }

    protected abstract int getLayoutId();

    protected abstract void initEvent();

    protected abstract void initData(Bundle savedInstanceState);
}
