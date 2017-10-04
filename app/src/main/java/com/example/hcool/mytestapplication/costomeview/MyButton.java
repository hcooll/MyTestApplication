package com.example.hcool.mytestapplication.costomeview;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.Button;

/**
 * Created by Administrator on 2017/10/1.
 */

public class MyButton extends android.support.v7.widget.AppCompatButton {

    public MyButton(Context context) {
        super(context);
    }

    public MyButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        //事件分发
        Log.e("Demo", "MyButton --> dispatchTouchEvent " + event);
        return super.dispatchTouchEvent(event);
        //return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        //触摸
        Log.e("Demo", "MyButton --> onTouchEvent " + event);
        //return super.onTouchEvent(event);
        //return false;
        return true;
    }

}
