package edu.itc.gic.m1.songbook;

import android.content.Context;
import android.view.LayoutInflater;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import edu.itc.gic.m1.songbook.production.Production;
import edu.itc.gic.m1.songbook.production.ProductionListAdabter;

public abstract class BaseRecyclerAdabter <T, VH extends RecyclerView.ViewHolder>
        extends RecyclerView.Adapter<VH>{

    List<T> data;

    protected final LayoutInflater inflater;

    public BaseRecyclerAdabter(Context context) {
        this.inflater = LayoutInflater.from(context);
    }

    public void setData(List<T> data) {
        this.data = data;
        notifyDataSetChanged();
    }

    public List<T> getData() {
        return data;
    }

    public abstract void onBindViewHolder(@NonNull ProductionListAdabter.ProductionViewHolder holder, int position, @NonNull List<Production> payloads);
}
