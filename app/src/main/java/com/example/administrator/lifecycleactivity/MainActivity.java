package com.example.administrator.lifecycleactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.administrator.lifecyclefragment.TestActivity;


public class MainActivity extends Activity {

    private static final String TAG = "MainActivity";
    private int param = 1;
    private Button toTestActivity;
    //Activity创建时被调用
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toTestActivity=(Button)findViewById(R.id.btn_toTestActivity);
        toTestActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent=new  Intent();
                intent.setClass(MainActivity.this, TestActivity.class);
                startActivity(intent);

            }
        });
         Log.e(TAG, "onCreate() executed ");
    }

    //Activity创建或者从后台重新回到前台时被调用
    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "onStart() executed ");
    }
    //Activity创建或者从被覆盖、后台重新回到前台时被调用
    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "onResume() executed ");
    }
    //Activity被覆盖到下面或者锁屏时被调用
    @Override
    protected void onPause() {
        super.onPause();
        Log.e("TAG", "onPause() executed ");
    }
    //退出当前Activity或者跳转到新Activity时被调用
    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "onStop() executed ");
    }
    //退出当前Activity时被调用,调用之后Activity就结束了
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy() executed ");
    }
    //Activity从后台重新回到前台时被调用
    @Override
    protected void onRestart() {
        super.onRestart();

        Log.e(TAG, "onRestart() executed ");
    }

    /**
     * Activity被系统杀死时被调用.
     * 例如:屏幕方向改变时,Activity被销毁再重建;当前Activity处于后台,系统资源紧张将其杀死.
     * 另外,当跳转到其他Activity或者按Home键回到主屏时该方法也会被调用,系统是为了保存当前View组件的状态.
     * 在onPause之前被调用.
     */
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putInt("param", param);
        Log.e(TAG, "onSaveInstanceState executed. put param: " + param);

    }


    /**
     * Activity被系统杀死后再重建时被调用.
     * 例如:屏幕方向改变时,Activity被销毁再重建;当前Activity处于后台,系统资源紧张将其杀死,用户又启动该Activity.
     * 这两种情况下onRestoreInstanceState都会被调用,在onStart之后.
     */
//
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        param = savedInstanceState.getInt("param");
        Log.e(TAG, "onRestoreInstanceState executed. get param: " + param);

    }

    //Activity窗口获得或失去焦点时被调用,在onResume之后或onPause之后
    /*@Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        Log.i(TAG, "onWindowFocusChanged excuted.");
    }*/
}
