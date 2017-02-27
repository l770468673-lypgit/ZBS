package com.myapp.e_home.zbs;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {
    private static final long MAX_TIME = 2000;
    private RadioButton home_btn, Neighborhoods_btn;   //  底部按钮
    private boolean isBackPressed = false;
    private RadioGroup home_rgb;     // RadioGroup

    private static final String TAG = "MainActivity";
    public static ImageButton opendoor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        // 初始化首页的控件
        initView();

    }

    @Override
    public void onDestroy() {

    }

    private void initView() {

        home_rgb = (RadioGroup) findViewById(R.id.rgb);         //  radiogroup
        home_btn = (RadioButton) findViewById(R.id.home_btn);  //首页 --btn
        Neighborhoods_btn = (RadioButton) findViewById(R.id.Neighborhoods_btn);  //  社区的 --btn
        home_rgb.setOnCheckedChangeListener(this);           // 首页点击按钮的条状页面的操作 --> 跳转页面

        home_rgb.getChildAt(0).performClick();//模拟点击第一个RB
        opendoor = (ImageButton) findViewById(R.id.opendoor);


    }


    //双击退出
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (KeyEvent.KEYCODE_BACK == event.getKeyCode()) {
            if (isBackPressed) {
                finish();
            } else {
                //				new Timer().schedule(task, when);
                isBackPressed = true;
                Toast.makeText(MainActivity.this, "再按一次退出", Toast.LENGTH_SHORT).show();

                new Timer().schedule(new TimerTask() {

                    @Override
                    public void run() {
                        // TODO Auto-generated method stub
                        isBackPressed = false;
                    }
                }, MAX_TIME);
            }
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }


    @Override
    protected void onResume() {
        super.onResume();


    }


    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {

        switch (checkedId) {
            case R.id.home_btn:
                getSupportFragmentManager().beginTransaction().replace(R.id.home_frg, new Home_Fragment()).commit();
                break;
            case R.id.Neighborhoods_btn:
                getSupportFragmentManager().beginTransaction().replace(R.id.home_frg, new Neighb_Fragment()).commit();
                break;
        }
    }
}

