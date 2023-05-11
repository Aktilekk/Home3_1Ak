package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    AppCompatButton button;
    EditText editText;
    EditText editText_sec;
    EditText editText_three;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        setClicks();
    }

    private void findViews() {
        button = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);
        editText_sec = findViewById(R.id.editText_sec);
        editText_three = findViewById(R.id.editText_three);
    }

    private void setClicks() {
        button.setOnClickListener(v -> {
            Intent intent = new Intent(this, SecondActivity.class);
            String editText1 = editText.getText().toString();
            String editText2 = editText_sec.getText().toString();
            String editText3 = editText_three.getText().toString();
            intent.putExtra("editText1", editText1);
            intent.putExtra("editText2", editText2);
            intent.putExtra("editText3", editText3);
            startActivity(intent);
        });
    }


}