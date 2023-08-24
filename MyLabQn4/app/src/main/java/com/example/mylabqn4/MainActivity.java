package com.example.mylabqn4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextName;
    private EditText editTextAddress;
    private EditText editTextGender;
    private EditText editTextProgram;
    private Button buttonSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextName = findViewById(R.id.editTextName);
        editTextAddress = findViewById(R.id.editTextAddress);
        editTextGender = findViewById(R.id.editTextGender);
        editTextProgram = findViewById(R.id.editTextProgram);
        buttonSubmit = findViewById(R.id.buttonSubmit);

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Retrieve the input values
                String name = editTextName.getText().toString();
                String address = editTextAddress.getText().toString();
                String gender = editTextGender.getText().toString();
                String program = editTextProgram.getText().toString();

                // Create an intent to start the DisplayActivity
                Intent intent = new Intent(MainActivity.this, DisplayActivity.class);

                // Pass the input values to the DisplayActivity
                intent.putExtra("name", name);
                intent.putExtra("address", address);
                intent.putExtra("gender", gender);
                intent.putExtra("program", program);

                // Start the DisplayActivity
                startActivity(intent);
            }
        });
    }
}
