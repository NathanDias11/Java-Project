package com.example.weddingplanner;

import static java.lang.String.*;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    EditText editTextTextPersonName4;
    EditText editTextTextPersonName5;
    EditText editTextTextPersonName6;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        editTextTextPersonName4=findViewById(R.id.editTextTextPersonName4);
        editTextTextPersonName5=findViewById(R.id.editTextTextPersonName5);
        editTextTextPersonName6=findViewById(R.id.editTextTextPersonName6);

        Intent intent = getIntent();
        String loc = intent.getStringExtra(MainActivity.EXTRA_NAME);
        String gus = intent.getStringExtra(MainActivity.EXTRA_NAME1);
        String bud = intent.getStringExtra(MainActivity.EXTRA_NAME2);



        editTextTextPersonName4.setText(loc);
        editTextTextPersonName5.setText(gus);
        editTextTextPersonName6.setText(bud);




    }
}