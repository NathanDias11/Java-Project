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

        int number = Integer.parseInt(gus);
        int budget = Integer.parseInt(bud);
        int n;

        if(number == 100 && budget == 1)
        {
            n=1;
        }
        else
        {
            if(number == 200 && budget == 2)
            {
                 n=2;
            }
            else
            {
                if(number == 300 && budget == 3)
                {
                    n=3;
                }
                else
                {
                    n=0;
                }
            }

        }

        switch(n)
        {
            case 1:
                editTextTextPersonName4.setText("Name: Rajesh Patil");
                editTextTextPersonName5.setText("Contact: 7249735828");
                editTextTextPersonName6.setText("Company:R J Event Managers");
                break;

            case 2:
                editTextTextPersonName4.setText("Name: Raj Shinde");
                editTextTextPersonName5.setText("Contact: 9970851627");
                editTextTextPersonName6.setText("Company:Star Event Organizers");
                break;

            case 3:
                editTextTextPersonName4.setText("Name: Prakash Mane");
                editTextTextPersonName5.setText("Contact: 8600098830");
                editTextTextPersonName6.setText("Company:MANE Event Organizers");
                break;


                default:
                editTextTextPersonName4.setText("NO MATCH FOUND");
                editTextTextPersonName5.setText("NO MATCH FOUND");
                editTextTextPersonName6.setText("NO MATCH FOUND");



        }







    }
}