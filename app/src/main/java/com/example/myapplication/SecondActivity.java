package com.example.myapplication;

import static com.example.myapplication.R.id.textView;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String editText1 = getIntent().getStringExtra("editText1");
        TextView textView1 = findViewById(R.id.textView1);
        textView1.setText(editText1);
        String editText2 = getIntent().getStringExtra("editText2");
        TextView textView2 = findViewById(R.id.textView2);
        textView2.setText(editText2);
        String editText3 = getIntent().getStringExtra("editText3");
        TextView textView3 = findViewById(R.id.textView3);
        textView3.setText(editText3);





    }
}