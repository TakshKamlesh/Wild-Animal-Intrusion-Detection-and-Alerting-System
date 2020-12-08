package com.example.disproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Debugging extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_debugging);
        Intent intent = getIntent();
        String str = intent.getStringExtra("error_message");
        TextView message = (TextView)findViewById(R.id.error);
        message.setText(str);
    }
}