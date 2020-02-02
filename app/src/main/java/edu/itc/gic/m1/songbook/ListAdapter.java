package edu.itc.gic.m1.songbook;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import edu.itc.gic.m1.assign_001.R;

public abstract class ListAdapter<T> extends RecyclerView.Adapter<ListAdapter.ViewHolder> {

    List<T> data;
    Context context;
    private int number_of_list;
    int num_number;
    public ListAdapter(Context context, int num, int num_layout, List<T> list){
        this.context=context;
        this.number_of_list = num;
        this.num_number = num_layout;
        this.data = list;
    }

    public List<T> getData() {
        return this.data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View itemView = null;
        switch (this.num_number){
            case 1:
                 itemView = inflater.inflate(R.layout.item_list_production, parent,false);
                 break;
            case 2:
                 itemView = inflater.inflate(R.layout.item_list_singer, parent,false);
                 break;
            case 3:
                itemView = inflater.inflate(R.layout.item_list_song, parent,false);
                break;
            default:
                itemView = null;
        }
        return new ViewHolder(itemView);
    }

//    @Override
//    public void onBindViewHolder(@NonNull RecyclerView.SongViewHolder holder, int position) {
//        Production item = (Production) getData().get(position);
//        item.setName("hello");
//        item.setImage("hello.jpg");
////                holder.imageView.sette;
//    }

    @Override
    public int getItemCount() {
        return this.number_of_list;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
