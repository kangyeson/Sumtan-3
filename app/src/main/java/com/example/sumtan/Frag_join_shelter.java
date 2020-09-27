package com.example.sumtan;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
public class Frag_join_shelter extends Fragment {
    private ArrayAdapter adapter;
    private Spinner spinner;
    private View v;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        v = inflater.inflate(R.layout.activity_frag_join_shelter,container,false);
        final Spinner[] spinner = {(Spinner) v.findViewById(R.id.a_address1_spinner)};
        adapter = ArrayAdapter.createFromResource(getActivity(), R.array.address1, android.R.layout.simple_spinner_dropdown_item);
        spinner[0].setAdapter(adapter);
        spinner[0].setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //서울시
                if (position == 0) {
                    spinner[0] = (Spinner) v.findViewById(R.id.a_address2_spinner);
                    adapter = ArrayAdapter.createFromResource(getActivity(), R.array.Seoul, android.R.layout.simple_spinner_dropdown_item);
                    spinner[0].setAdapter(adapter);
                    spinner[0].setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            //강남
                            if (position == 0) {
                                spinner[0] = (Spinner) v.findViewById(R.id.a_address3_spinner);
                                adapter = ArrayAdapter.createFromResource(getActivity(), R.array.Gangnam, android.R.layout.simple_spinner_dropdown_item);
                                spinner[0].setAdapter(adapter);
                                //강동
                            } else if (position == 1) {
                                spinner[0] = (Spinner) v.findViewById(R.id.a_address3_spinner);
                                adapter = ArrayAdapter.createFromResource(getActivity(), R.array.Gangdong, android.R.layout.simple_spinner_dropdown_item);
                                spinner[0].setAdapter(adapter);
                            }
                            //강북
                            else if (position == 2) {
                                spinner[0] = (Spinner) v.findViewById(R.id.a_address3_spinner);
                                adapter = ArrayAdapter.createFromResource(getActivity(), R.array.Gangbuk, android.R.layout.simple_spinner_dropdown_item);
                                spinner[0].setAdapter(adapter);
                            }

                            //노가다 화이팅......
                            else {
                                spinner[0] = (Spinner) v.findViewById(R.id.a_address3_spinner);
                                adapter = ArrayAdapter.createFromResource(getActivity(), R.array.Gangbuk, android.R.layout.simple_spinner_dropdown_item);
                                spinner[0].setAdapter(adapter);
                            }
                        }
                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {
                        }
                    }); //end of 서울
                    //경기도
                } else if (position == 1) {
                    spinner[0] = (Spinner) v.findViewById(R.id.a_address2_spinner);
                    adapter = ArrayAdapter.createFromResource(getActivity(), R.array.Gyeonggi, android.R.layout.simple_spinner_dropdown_item);
                    spinner[0].setAdapter(adapter);
                    spinner[0].setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            //가평군
                            if (position == 0) {
                                spinner[0] = (Spinner) v.findViewById(R.id.a_address3_spinner);
                                adapter = ArrayAdapter.createFromResource(getActivity(), R.array.Gapyeong, android.R.layout.simple_spinner_dropdown_item);
                                spinner[0].setAdapter(adapter);
                                //고양시 덕양구
                            } else if (position == 1) {
                                spinner[0] = (Spinner) v.findViewById(R.id.a_address3_spinner);
                                adapter = ArrayAdapter.createFromResource(getActivity(), R.array.Goyang_Deogyang, android.R.layout.simple_spinner_dropdown_item);
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
            public void onNothingSelected (AdapterView< ? > parent){ }
        }); //end of Start
        Button btn_join_shelter=(Button)v.findViewById(R.id.btn_join_shelter);
        btn_join_shelter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), MainActivity_shelter.class));
            }
        });

        return v;
    }
}