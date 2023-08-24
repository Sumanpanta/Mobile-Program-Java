package com.example.mylabreportqn7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView lifecycleTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lifecycleTextView = findViewById(R.id.lifecycle_text_view);
        logLifecycle("onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        logLifecycle("onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        logLifecycle("onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        logLifecycle("onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        logLifecycle("onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        logLifecycle("onDestroy");
    }
    private void logLifecycle(String lifecycleEvent) {
        String currentText = lifecycleTextView.getText().toString();
        String newText = currentText + "\n" + lifecycleEvent;
        lifecycleTextView.setText(newText);
        Log.d("Lifecycle", lifecycleEvent);
    }
    }
