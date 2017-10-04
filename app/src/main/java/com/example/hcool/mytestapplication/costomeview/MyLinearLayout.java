package com.example.hcool.mytestapplication.costomeview;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * Created by Administrator on 2017/10/1.
 */

public class MyLinearLayout extends LinearLayout {

    public MyLinearLayout(Context context) {
        super(context);
    }

    public MyLinearLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyLinearLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }



    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.e("Demo", "MyLinearLayout --> dispatchTouchEvent "+ev);
        return super.dispatchTouchEvent(ev);
        //return false;
        //return true;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.e("Demo", "MyLinearLayout --> onInterceptTouchEvent "+ev);
        return super.onInterceptTouchEvent(ev);
        //return false;
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e("Demo", "MyLinearLayout --> onTouchEvent "+event);
        return super.onTouchEvent(event);
    }
}
