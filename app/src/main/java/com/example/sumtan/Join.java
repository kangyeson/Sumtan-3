package com.example.sumtan;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class Join extends AppCompatActivity implements View.OnClickListener {

    private FragmentManager fm;
    private FragmentTransaction ft;
    private Frag_join_shelter fjs;
    private Frag_join_user fju;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);

        Button go_animalButton=(Button)findViewById(R.id.go_animalButton);
        Button go_publicButton=(Button)findViewById(R.id.go_publicButton);

        go_animalButton.setOnClickListener(this);
        go_publicButton.setOnClickListener(this);

        fjs=new Frag_join_shelter();
        fju=new Frag_join_user();
        setFrag(0);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.go_animalButton:
                Join.this.setFrag(0);
                break;
            case R.id.go_publicButton:
                Join.this.setFrag(1);
                break;
        }
    }

    private void setFrag(int n) {
        fm = getSupportFragmentManager();
        ft = fm.beginTransaction();
        switch (n) {
            case 0:
                ft.replace(R.id.join_frame, fjs);
                ft.commit();
                break;
            case 1:
                ft.replace(R.id.join_frame, fju);
                ft.commit();
                break;
        }
    }
}