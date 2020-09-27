package com.example.sumtan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintSet;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.view.MotionEvent;
import android.view.View;
//import android.view.View.onClickListener;
import android.widget.Button;
import android.widget.LinearLayout;

import android.os.Bundle;
import android.widget.TextView;

public class Login extends AppCompatActivity implements View.OnClickListener {
    LinearLayout aa, bb;
    Button bt1, bt2;
    TextView tv_goto_join1, tv_goto_join2;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        aa=(LinearLayout)findViewById(R.id.aa);
        bb=(LinearLayout)findViewById(R.id.bb);

        bt1=(Button)findViewById(R.id.button1);
        bt1.setBackgroundColor(Color.rgb(179,152,131));
        bt1.setOnTouchListener(new View.OnTouchListener(){
            public boolean onTouch(View view, MotionEvent motionEvent) {
                bt1.setBackgroundColor(Color.rgb(179,152,131));
                bt2.setBackgroundColor(Color.WHITE);
                return false;
            }
        });
        bt2=(Button)findViewById(R.id.button2);
        bt2.setBackgroundColor(Color.WHITE);
        bt2.setOnTouchListener(new View.OnTouchListener(){
            public boolean onTouch(View view, MotionEvent motionEvent) {
                bt2.setBackgroundColor(Color.rgb(179,152,131));
                bt1.setBackgroundColor(Color.WHITE);
                return false;
            }
        });

        tv_goto_join1=(TextView)findViewById(R.id.tv_goto_join1);
        tv_goto_join1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Join.class);
                startActivity(intent);
            }
        });

        tv_goto_join2=(TextView)findViewById(R.id.tv_goto_join2);
        tv_goto_join2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Join.class);
                startActivity(intent);
            }
        });

        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
    }

    @Override
    public void onClick(View arg0) {
        switch (arg0.getId()){
            case R.id.button1:
                aa.setVisibility(View.VISIBLE);
                bb.setVisibility(View.GONE);
                break;

            case R.id.button2:
                aa.setVisibility(View.GONE);
                bb.setVisibility(View.VISIBLE);
                break;
        }
    }
}