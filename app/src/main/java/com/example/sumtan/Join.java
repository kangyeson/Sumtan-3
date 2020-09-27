package com.example.sumtan;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

public class Join extends AppCompatActivity implements View.OnClickListener {
    LinearLayout aa, bb;
    Button bt1, bt2;
    private ArrayAdapter adapter;
    private Spinner spinner;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);

        aa=(LinearLayout)findViewById(R.id.ajoin);
        bb=(LinearLayout)findViewById(R.id.pjoin);

        bt1=(Button)findViewById(R.id.go_animalButton);
        bt1.setBackgroundColor(Color.rgb(179,152,131));
        bt1.setOnTouchListener(new View.OnTouchListener(){
            public boolean onTouch(View view, MotionEvent motionEvent) {
                bt1.setBackgroundColor(Color.rgb(179,152,131));
                bt2.setBackgroundColor(Color.WHITE);
                return false;
            }
        });

        bt2=(Button)findViewById(R.id.go_publicButton);
        bt2.setBackgroundColor(Color.WHITE);
        bt2.setOnTouchListener(new View.OnTouchListener(){
            public boolean onTouch(View view, MotionEvent motionEvent) {
                bt2.setBackgroundColor(Color.rgb(179,152,131));
                bt1.setBackgroundColor(Color.WHITE);
                return false;
            }
        });

        final Spinner[] spinner = {(Spinner) findViewById(R.id.a_address1_spinner)};
        adapter = ArrayAdapter.createFromResource(this, R.array.address1, android.R.layout.simple_spinner_dropdown_item);
        spinner[0].setAdapter(adapter);

        spinner[0].setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //서울시
                if (position == 0) {
                    spinner[0] = (Spinner) findViewById(R.id.a_address2_spinner);
                    adapter = ArrayAdapter.createFromResource(Join.this, R.array.Seoul, android.R.layout.simple_spinner_dropdown_item);
                    spinner[0].setAdapter(adapter);

                    spinner[0].setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            //강남
                            if (position == 0) {
                                spinner[0] = (Spinner) findViewById(R.id.a_address3_spinner);
                                adapter = ArrayAdapter.createFromResource(Join.this, R.array.Gangnam, android.R.layout.simple_spinner_dropdown_item);
                                spinner[0].setAdapter(adapter);

                                //강동
                            } else if (position == 1) {
                                spinner[0] = (Spinner) findViewById(R.id.a_address3_spinner);
                                adapter = ArrayAdapter.createFromResource(Join.this, R.array.Gangdong, android.R.layout.simple_spinner_dropdown_item);
                                spinner[0].setAdapter(adapter);
                            }
                            //강북
                            else if (position == 2) {
                                spinner[0] = (Spinner) findViewById(R.id.a_address3_spinner);
                                adapter = ArrayAdapter.createFromResource(Join.this, R.array.Gangbuk, android.R.layout.simple_spinner_dropdown_item);
                                spinner[0].setAdapter(adapter);
                            }


                            //노가다 화이팅......

                            else {
                                spinner[0] = (Spinner) findViewById(R.id.a_address3_spinner);
                                adapter = ArrayAdapter.createFromResource(Join.this, R.array.Gangbuk, android.R.layout.simple_spinner_dropdown_item);
                                spinner[0].setAdapter(adapter);
                            }

                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {
                        }
                    }); //end of 서울

                    //경기도
                } else if (position == 1) {
                    spinner[0] = (Spinner) findViewById(R.id.a_address2_spinner);
                    adapter = ArrayAdapter.createFromResource(Join.this, R.array.Gyeonggi, android.R.layout.simple_spinner_dropdown_item);
                    spinner[0].setAdapter(adapter);

                    spinner[0].setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            //가평군
                            if (position == 0) {
                                spinner[0] = (Spinner) findViewById(R.id.a_address3_spinner);
                                adapter = ArrayAdapter.createFromResource(Join.this, R.array.Gapyeong, android.R.layout.simple_spinner_dropdown_item);
                                spinner[0].setAdapter(adapter);
                                //고양시 덕양구
                            } else if (position == 1) {
                                spinner[0] = (Spinner) findViewById(R.id.a_address3_spinner);
                                adapter = ArrayAdapter.createFromResource(Join.this, R.array.Goyang_Deogyang, android.R.layout.simple_spinner_dropdown_item);
                                spinner[0].setAdapter(adapter);
                            }
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {
                        }
                    });
                } //end of 경기도

                //인천
                else if(position == 2){

                }
            }
            @Override
            public void onNothingSelected (AdapterView < ? > parent){ }
        }); //end of Start

        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
    }

    @Override
    public void onClick(View arg0) {
        switch (arg0.getId()){
            case R.id.go_animalButton:
                aa.setVisibility(View.VISIBLE);
                bb.setVisibility(View.GONE);
                break;

            case R.id.go_publicButton:
                aa.setVisibility(View.GONE);
                bb.setVisibility(View.VISIBLE);
                break;
        }
    }
}