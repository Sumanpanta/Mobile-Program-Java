package com.example.signinscreenproject3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.*;
import android.widget.*;


public class MainActivity extends AppCompatActivity {
    private EditText emailText;
    private EditText passwordText;
    private Button signInButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailText = findViewById(R.id.emailText);
        passwordText = findViewById(R.id.passwordText);
        signInButton = findViewById(R.id.signInButton);

        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailText.getText().toString();
                String password = passwordText.getText().toString();

                if(email.isEmpty() || password.isEmpty()) {
                    Toast.makeText(MainActivity.this,"Please enter email",Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this,"Login Successful",Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}