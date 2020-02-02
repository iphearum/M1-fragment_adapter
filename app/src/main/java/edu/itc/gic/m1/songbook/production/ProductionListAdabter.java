package edu.itc.gic.m1.songbook.production;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import edu.itc.gic.m1.assign_001.R;
import edu.itc.gic.m1.songbook.BaseRecyclerAdabter;

public class ProductionListAdabter extends BaseRecyclerAdabter {

    ProductionListAdabter(Context context) {
        super(context);
    }

    @NonNull
    @Override
    public ProductionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = inflater.inflate(R.layout.item_list_production, parent, false);
        return new ProductionViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
//        Production item = (Production) getData().get(position);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductionViewHolder holder, int position, @NonNull List payloads) {
        Production item = (Production) getData().get(position);
        holder.image.setImageURI(Uri.parse(item.getImage())); // This doesn't work!
        holder.textName.setText(item.getName());
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ProductionViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView textName;

        public ProductionViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.imageIconView);
            textName = itemView.findViewById(R.id.textNameView);
        }
    }
}
