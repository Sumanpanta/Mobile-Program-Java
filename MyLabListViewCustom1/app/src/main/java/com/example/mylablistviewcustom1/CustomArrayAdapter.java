package com.example.mylablistviewcustom1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class CustomArrayAdapter extends ArrayAdapter<CustomItem> {

    public CustomArrayAdapter(Context context, List<CustomItem> items) {
        super(context, 0, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        CustomItem item = getItem(position);

        TextView itemNameTextView = convertView.findViewById(R.id.itemNameTextView);
        itemNameTextView.setText(item.getItemName());

        return convertView;
    }
}

