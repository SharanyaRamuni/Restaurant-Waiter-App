package com.example.waiterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Category extends AppCompatActivity {
ImageView iv1,iv2,iv3;
TextView tv1,tv2,tv3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        iv1 = (ImageView) findViewById(R.id.indiani);
        iv2 = (ImageView) findViewById(R.id.chinesei);
        iv3 = (ImageView) findViewById(R.id.drinksi);
        tv1 = (TextView) findViewById(R.id.indian);
        tv2 = (TextView) findViewById(R.id.chinese);
        tv3 = (TextView) findViewById(R.id.drinks);
        iv1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Category.this,indian.class);
                startActivity(intent);
            }
        });
        iv2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Category.this,chinese.class);
                startActivity(intent);
            }
        });
        iv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Category.this, drinks.class);
                startActivity(intent);
            }
        });
    }
}