package com.example.sumtan;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class Modify_shelter extends AppCompatActivity {

    private View view;
    private ArrayAdapter adapter;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modify_shelter);

        final Spinner[] spinner = {(Spinner) findViewById(R.id.a_address1_spinner)};
        adapter = ArrayAdapter.createFromResource(this, R.array.address1, android.R.layout.simple_spinner_dropdown_item);
        spinner[0].setAdapter(adapter);

        spinner[0].setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //서울시
                if (position == 0) {
                    spinner[0] = (Spinner) findViewById(R.id.a_address2_spinner);
                    adapter = ArrayAdapter.createFromResource(Modify_shelter.this, R.array.Seoul, android.R.layout.simple_spinner_dropdown_item);
                    spinner[0].setAdapter(adapter);

                    spinner[0].setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            //강남
                            if (position == 0) {
                                spinner[0] = (Spinner) findViewById(R.id.a_address3_spinner);
                                adapter = ArrayAdapter.createFromResource(Modify_shelter.this, R.array.Gangnam, android.R.layout.simple_spinner_dropdown_item);
                                spinner[0].setAdapter(adapter);

                                //강동
                            } else if (position == 1) {
                                spinner[0] = (Spinner) findViewById(R.id.a_address3_spinner);
                                adapter = ArrayAdapter.createFromResource(Modify_shelter.this, R.array.Gangdong, android.R.layout.simple_spinner_dropdown_item);
                                spinner[0].setAdapter(adapter);
                            }
                            //강북
                            else if (position == 2) {
                                spinner[0] = (Spinner) findViewById(R.id.a_address3_spinner);
                                adapter = ArrayAdapter.createFromResource(Modify_shelter.this, R.array.Gangbuk, android.R.layout.simple_spinner_dropdown_item);
                                spinner[0].setAdapter(adapter);
                            }


                            //노가다 화이팅......

                            else {
                                spinner[0] = (Spinner) findViewById(R.id.a_address3_spinner);
                                adapter = ArrayAdapter.createFromResource(Modify_shelter.this, R.array.Gangbuk, android.R.layout.simple_spinner_dropdown_item);
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
                    adapter = ArrayAdapter.createFromResource(Modify_shelter.this, R.array.Gyeonggi, android.R.layout.simple_spinner_dropdown_item);
                    spinner[0].setAdapter(adapter);

                    spinner[0].setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            //가평군
                            if (position == 0) {
                                spinner[0] = (Spinner) findViewById(R.id.a_address3_spinner);
                                adapter = ArrayAdapter.createFromResource(Modify_shelter.this, R.array.Gapyeong, android.R.layout.simple_spinner_dropdown_item);
                                spinner[0].setAdapter(adapter);
                                //고양시 덕양구
                            } else if (position == 1) {
                                spinner[0] = (Spinner) findViewById(R.id.a_address3_spinner);
                                adapter = ArrayAdapter.createFromResource(Modify_shelter.this, R.array.Goyang_Deogyang, android.R.layout.simple_spinner_dropdown_item);
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

        Button btn_modify=(Button)findViewById(R.id.btn_modify);
        btn_modify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}