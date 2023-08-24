package com.example.simplenoteapp.view;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.simplenoteapp.R;
import com.example.simplenoteapp.database.Note;

import java.util.List;

public class NotesAdapter extends RecyclerView.Adapter<NotesAdapter> {
    private Context context;
    private List<Note> notesList;
    AdapterView.OnItemClickListener itemClickListener;

    @NonNull
    @Override
    public NotesAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull NotesAdapter holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView note;
        public TextView dot;
        public TextView timestamp;
        public RelativeLayout viewBackground, viewForeground;
        public ImageView setting;

        public MyViewHolder(View view) {
            super(view);
            note = view.findViewById(R.id.note);

        }
    }

}
