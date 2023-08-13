package com.example.waiterapp;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View.OnClickListener;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import com.example.waiterapp.LoginActivity;
import com.example.waiterapp.R;

public class MainActivity extends AppCompatActivity {
    public Button button;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = (TextView) findViewById(R.id.welcome);
        button = (Button) findViewById(R.id.b1);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }



}