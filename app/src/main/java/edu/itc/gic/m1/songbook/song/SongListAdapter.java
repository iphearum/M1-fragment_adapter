package edu.itc.gic.m1.songbook.song;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import edu.itc.gic.m1.assign_001.R;

public class SongListAdapter extends RecyclerView.Adapter<SongListAdapter.SongViewHolder> {
    Context context;
    private int number_of_list;
    int num_number;
    public SongListAdapter(Context context){
        this.context=context;
    }

    @NonNull
    @Override
    public SongViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View itemView  = inflater.inflate(R.layout.item_list_song, parent,false);
        return new SongViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull SongViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 50;
    }

    public class SongViewHolder extends RecyclerView.ViewHolder {
        public SongViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
