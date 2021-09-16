package com.bw.testmvp;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.bw.mylibrary.BaseMVPActivity;

/**
 * @ClassName TestActivity
 * @Description TODO
 * @Author 张溢通
 * @Date 2021/9/9 19:27
 * @Version 1.0
 * Created by Android Studio.
 * User: 伊莎贝拉
 */
public class TestActivity extends BaseMVPActivity<jk.TestPresenter> implements jk.TestIView {

    private Button bt;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initEvent() {

    }


    @Override
    protected void initData(Bundle savedInstanceState) {
        bt = (Button) findViewById(R.id.bt);
        //presenter = new TestPresenter();
        bt.setOnClickListener(new View.OnClickListener( ) {
            @Override
            public void onClick(View v) {
                presenter.cs(1,20,1);
            }
        });
    }


    @Override
    public void cg(BeanFood s) {
        Log.i("123", "cg: "+s.data.get(0).title);
    }

    @Override
    public void sb(String s) {

    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        Log.i("123", "onWindowFocusChanged: ++++++++++++++++++++++++++++++++++++++++++++++++");
    }

    @Override
    protected void onStart() {
        super.onStart( );
        Log.i("123", "onStart: ++++++++++++++++++++++++++++++++++++++++++++++++");

    }

    @Override
    protected void onResume() {
        super.onResume( );
        Log.i("123", "onResume: ++++++++++++++++++++++++++++++++++++++++++++++++");

    }


}
