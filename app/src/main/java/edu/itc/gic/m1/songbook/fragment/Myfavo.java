package edu.itc.gic.m1.songbook.fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import edu.itc.gic.m1.assign_001.R;
import edu.itc.gic.m1.songbook.ListAdapter;
import edu.itc.gic.m1.songbook.db.AppDatabase;
import edu.itc.gic.m1.songbook.db.ProductionDao;
import edu.itc.gic.m1.songbook.production.Production;

/**
 * A simple {@link Fragment} subclass.
 */
public class Myfavo extends Fragment {

    RecyclerView recyclerView;
    ListAdapter adapter;

    ImageView image;
    TextView name;

    List<Production> getData() {
        return null;
    }
    List<Production> settData() {
        return null;
    }

    public Myfavo() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_production, container, false);
        recyclerView = view.findViewById(R.id.reproduc);
//        recyclerView.setAdapter(adapter = new ListAdapter(this.getContext(),250,1,getData()));
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext(), LinearLayoutManager.VERTICAL,false));

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        AppDatabase database = AppDatabase.getInstance(getContext());
        ProductionDao productionDao = database.getProductionDao();
        List<Production> productions = productionDao.loadAll();

    }
}
