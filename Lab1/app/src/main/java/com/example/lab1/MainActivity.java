package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Handler handler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
                finish();
            }
        },4200);

        Animation animation=AnimationUtils.loadAnimation(this,R.anim.scale_text_anim);
        TextView tv=findViewById(R.id.tv_social);
        tv.setAnimation(animation);
        tv.setVisibility(View.VISIBLE);

    }
}