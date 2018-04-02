package com.example.t7830.test6;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.t7830.test6.MainActivity;
import com.example.t7830.test6.R;

//闪屏页
public class SplashActivity extends AppCompatActivity {

    protected Handler  mHandler=new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
               startActivity(new Intent(SplashActivity.this,MainActivity.class));
            }
        },2000);
    }
}
