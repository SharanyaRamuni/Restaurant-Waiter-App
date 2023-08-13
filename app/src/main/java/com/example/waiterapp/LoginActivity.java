package com.example.waiterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
EditText et1,et2;
Button btn;
TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        et1 = (EditText) findViewById(R.id.email);
        et2 = (EditText) findViewById(R.id.password);
        tv1= (TextView) findViewById(R.id.textView);
        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(LoginActivity.this, TablePage.class);
                startActivity(intent);
            }
        });
    }
}