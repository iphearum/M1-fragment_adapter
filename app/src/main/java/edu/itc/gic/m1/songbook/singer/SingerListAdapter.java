package edu.itc.gic.m1.songbook.singer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import edu.itc.gic.m1.assign_001.R;
import edu.itc.gic.m1.songbook.production.Production;

public class SingerListAdapter extends RecyclerView.Adapter<SingerListAdapter.ViewHolder> {
    Context context;
    private int number_of_list;
    int num_number;
    List<Singer> singers;

    public SingerListAdapter(Context context){
        this.context=context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View itemView  = inflater.inflate(R.layout.item_list_singer, parent,false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 50;
    }

    public void setData(List<Production> data) {
        this.singers = data;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
