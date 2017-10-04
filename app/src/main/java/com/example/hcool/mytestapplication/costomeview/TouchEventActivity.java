package com.example.hcool.mytestapplication.costomeview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import com.example.hcool.mytestapplication.R;

public class TouchEventActivity extends AppCompatActivity implements View.OnTouchListener, View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_touch_event);

        findViewById(R.id.myLinearLayout).setOnTouchListener(this);
        findViewById(R.id.myButton).setOnTouchListener(this);


        findViewById(R.id.myLinearLayout).setOnClickListener(this);
        findViewById(R.id.myButton).setOnClickListener(this);

    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.e("Demo", "TouchEventActivity " + "dispatchTouchEvent "+ev);
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public void onUserInteraction() {
        Log.e("Demo", "TouchEventActivity " + "onUserInteraction ");
        super.onUserInteraction();
    }

    @Override
    public void onClick(View v) {
        Log.e("Demo", "点击事件 " + "onClick "+v);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        Log.e("Demo", "触摸事件 " + "onTouch "+ v + "  "+event);
        return false;
    }
}
