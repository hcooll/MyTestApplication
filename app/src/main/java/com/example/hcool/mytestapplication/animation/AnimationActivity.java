package com.example.hcool.mytestapplication.animation;

import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.Toast;

import com.example.hcool.mytestapplication.R;

public class AnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);

        Animation animation = new TranslateAnimation(0, 300, 0, 300);
        animation.setDuration(2000);
        animation.setFillAfter(true);

        Button button1 = (Button) findViewById(R.id.myButton1);
        button1.startAnimation(animation);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AnimationActivity.this, "点击  myButton1", Toast.LENGTH_SHORT).show();
            }
        });

        Button button2 = (Button) findViewById(R.id.myButton2);

        ObjectAnimator
                .ofFloat(button2, "translationX", 0f, 300f)
                //.setInterpolator(new LinearInterpolator())
                //.setEvaluator(IntEvaluator)
                .setDuration(3000)
                .start();

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AnimationActivity.this, "点击  myButton2", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
