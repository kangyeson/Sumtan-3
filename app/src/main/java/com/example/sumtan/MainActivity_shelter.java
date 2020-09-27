package com.example.sumtan;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity_shelter extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView; // 바텀 네비게이션 뷰
    private FragmentManager fm;
    private FragmentTransaction ft;
    private Frag_home_shelter fh;
    private Frag_check_shelter fc;
    private Frag_my_shelter fms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_shelter);

        bottomNavigationView=(BottomNavigationView)findViewById(R.id.bottomNa);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.action_home_shelter:
                        setFrag(0);
                        break;
                    case R.id.action_check_shelter:
                        setFrag(1);
                        break;
                    case R.id.action_my_shelter:
                        setFrag(2);
                        break;
                }
                return true;
            }
        });
        fh= new Frag_home_shelter();
        fc= new Frag_check_shelter();
        fms= new Frag_my_shelter();
        setFrag(0); // 첫 프래그먼트 화면을 무엇으로 지정해줄 것인지 선택.

    }

    //프래그먼트 교체가 일어나는 실행 함수수
    private void setFrag(int n) {
        fm = getSupportFragmentManager();
        ft = fm.beginTransaction();
        switch (n) {
            case 0:
                ft.replace(R.id.main_frame, fh);
                ft.commit();
                break;
            case 1:
                ft.replace(R.id.main_frame, fc);
                ft.commit();
                break;
            case 2:
                ft.replace(R.id.main_frame, fms);
                ft.commit();
                break;
        }
    }
}