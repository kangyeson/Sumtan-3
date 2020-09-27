package com.example.sumtan;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class Write_resume extends AppCompatActivity implements View.OnClickListener{
    LinearLayout personal, group;
    Button bt1, bt2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write_resume);

        personal=(LinearLayout)findViewById(R.id.personal);
        group=(LinearLayout)findViewById(R.id.group);

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

        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
    }

    @Override
    public void onClick(View arg0){
        switch (arg0.getId()){
            case R.id.button1:
                personal.setVisibility(View.VISIBLE);
                group.setVisibility(View.GONE);
                break;

            case R.id.button2:
                personal.setVisibility(View.GONE);
                group.setVisibility(View.VISIBLE);
                break;
        }
    }
}