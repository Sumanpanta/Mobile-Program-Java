package com.example.mylablistviewcustom1;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);

        List<CustomItem> itemList = new ArrayList<>();
        itemList.add(new CustomItem("Item 1"));
        itemList.add(new CustomItem("Item 2"));
        itemList.add(new CustomItem("Item 3"));

        CustomArrayAdapter adapter = new CustomArrayAdapter(this, itemList);
        listView.setAdapter(adapter);

        // Set item click listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                CustomItem selectedItem = itemList.get(position);
                String itemName = selectedItem.getItemName();
                Toast.makeText(MainActivity.this, "Clicked: " + itemName, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
