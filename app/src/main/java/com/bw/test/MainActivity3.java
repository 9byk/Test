package com.bw.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bw.testphoto.Test;

import java.util.Iterator;
import java.util.ServiceLoader;

public class MainActivity3 extends AppCompatActivity {
    private ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        img = (ImageView) findViewById(R.id.img);

    }

    public void jz(View view) {
        ServiceLoader<Test> load=ServiceLoader.load(Test.class);
        for (Test cs:load){
            cs.cs("http://www.qubaobei.com/ios/cf/uploadfile/132/9/8289.jpg",this,img);
        }
    }
}