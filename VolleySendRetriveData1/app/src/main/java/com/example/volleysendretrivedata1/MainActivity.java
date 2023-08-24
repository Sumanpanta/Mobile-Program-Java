package com.example.volleysendretrivedata1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    private TextView responseTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        responseTextView = findViewById(R.id.responseTextView);
        Button getButton = findViewById(R.id.getButton);
        Button postButton = findViewById(R.id.postButton);

        final RequestQueue requestQueue = Volley.newRequestQueue(this);

        getButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                performGetRequest(requestQueue);
            }
        });

        postButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                performPostRequest(requestQueue);
            }
        });
    }

    private void performGetRequest(RequestQueue requestQueue) {
        String url = "https://jsonplaceholder.typicode.com/posts/1";

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, url, null,
                response -> responseTextView.setText(response.toString()),
                error -> responseTextView.setText("Error: " + error.toString()));

        requestQueue.add(jsonObjectRequest);
    }

    private void performPostRequest(RequestQueue requestQueue) {
        String url = "https://jsonplaceholder.typicode.com/posts";

        JSONObject postData = new JSONObject();
        try {
            postData.put("key", "value");
        } catch (JSONException e) {
            e.printStackTrace();
        }

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.POST, url, postData,
                response -> responseTextView.setText(response.toString()),
                error -> responseTextView.setText("Error: " + error.toString()));

        requestQueue.add(jsonObjectRequest);
    }
}
