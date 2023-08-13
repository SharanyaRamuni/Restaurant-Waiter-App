package com.example.waiterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class TablePage extends AppCompatActivity {
ImageView iv1,iv2,iv3,iv4,iv5,iv6;
TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_page);
        iv1 = (ImageView) findViewById(R.id.table1i);
        iv2 = (ImageView) findViewById(R.id.table2i);
        iv3 = (ImageView) findViewById(R.id.table3i);
        iv4 = (ImageView) findViewById(R.id.table4i);
        iv5 = (ImageView) findViewById(R.id.table5i);
        iv6 = (ImageView) findViewById(R.id.table6i);
        tv1 = (TextView) findViewById(R.id.table1);
        tv2 = (TextView) findViewById(R.id.table2);
        tv3 = (TextView) findViewById(R.id.table3);
        tv4 = (TextView) findViewById(R.id.table4);
        tv5 = (TextView) findViewById(R.id.table5);
        tv6 = (TextView) findViewById(R.id.table6);
        tv7 = (TextView) findViewById(R.id.occupied);
        tv8 = (TextView) findViewById(R.id.empty);
        iv1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(TablePage.this,Category.class);
                startActivity(intent);
            }
        });
        iv2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(TablePage.this,Category.class);
                startActivity(intent);
            }
        });
        iv3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(TablePage.this,Category.class);
                startActivity(intent);
            }
        });
        iv4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(TablePage.this,Category.class);
                startActivity(intent);
            }
        });
        iv5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(TablePage.this,Category.class);
                startActivity(intent);
            }
        });
        iv6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(TablePage.this,Category.class);
                startActivity(intent);
            }
        });
    }
    }
