package com.bw.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView tt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tt = (TextView) findViewById(R.id.tt);
        String host=getIntent( ).getData( ).getHost( );
        String path=getIntent( ).getData( ).getPath( );
        String username=getIntent( ).getData( ).getQueryParameter("username");
        tt.setText(host+path+username);

    }
}