package com.example.hcool.mytestapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.hcool.mytestapplication.costomeview.TouchEventActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void touchEventTest(View view){
        startActivity(new Intent(this, TouchEventActivity.class));
    }
}
