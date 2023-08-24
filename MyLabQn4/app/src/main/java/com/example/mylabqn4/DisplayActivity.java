package com.example.mylabqn4;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DisplayActivity extends AppCompatActivity {

    private TextView textViewName;
    private TextView textViewAddress;
    private TextView textViewGender;
    private TextView textViewProgram;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        textViewName = findViewById(R.id.textViewName);
        textViewAddress = findViewById(R.id.textViewAddress);
        textViewGender = findViewById(R.id.textViewGender);
        textViewProgram = findViewById(R.id.textViewProgram);

        // Retrieve the values passed from the MainActivity
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String address = intent.getStringExtra("address");
        String gender = intent.getStringExtra("gender");
        String program = intent.getStringExtra("program");

        // Display the values in the TextViews
        textViewName.setText("Name: " + name);
        textViewAddress.setText("Address: " + address);
        textViewGender.setText("Gender: " + gender);
        textViewProgram.setText("Program: " + program);
    }
}
