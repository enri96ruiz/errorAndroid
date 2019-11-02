package com.example.vt2_08;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;


public class Activity2 extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
    Bundle extras = getIntent().getExtras();
    if(extras !=null){
        String name=extras.getString("name");
        textView.setText(name);

        }

    }
}
