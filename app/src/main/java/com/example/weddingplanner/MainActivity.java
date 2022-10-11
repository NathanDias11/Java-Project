package com.example.weddingplanner;

import static com.example.weddingplanner.R.id.editTextNumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private Button button;
    private EditText editTextTextPersonName;
    private EditText editTextNumber;
    private EditText editTextNumber2;


    private boolean value;
    public static final String EXTRA_NAME="com.example.wedding planner.extra.name";
    public static final String EXTRA_NAME1="com.example.wedding planner.extra.name1";
    public static final String EXTRA_NAME2="com.example.wedding planner.extra.name2";


    public MainActivity() {
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       button=findViewById(R.id.button);
       editTextTextPersonName=findViewById(R.id.editTextTextPersonName);
        editTextNumber = findViewById(R.id.editTextNumber);
        editTextNumber2 = findViewById(R.id.editTextNumber2);




    }

    public void openActivity(View v)
    {


        Toast.makeText(this, "Thankyou", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this, MainActivity2.class);

        String location = editTextTextPersonName.getText().toString();





        intent.putExtra(EXTRA_NAME, location);
        intent.putExtra(EXTRA_NAME1, editTextNumber.getText().toString());
        intent.putExtra(EXTRA_NAME2, editTextNumber2.getText().toString());



        startActivity(intent);
    }
}