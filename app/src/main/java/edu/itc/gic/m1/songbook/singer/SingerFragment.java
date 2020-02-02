package edu.itc.gic.m1.songbook.singer;


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
import edu.itc.gic.m1.songbook.db.AppDatabase;
import edu.itc.gic.m1.songbook.db.ProductionDao;
import edu.itc.gic.m1.songbook.production.Production;

/**
 * A simple {@link Fragment} subclass.
 */
public class SingerFragment extends Fragment {

    RecyclerView recyclerView;
    SingerListAdapter adapter;
    List<Singer> singers;

    ImageView image;
    TextView name;

    List<Singer> getData() {
        return this.singers;
    }
    List<Singer> setData() {
        return this.singers;
    }

    public SingerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_production, container, false);
        recyclerView = view.findViewById(R.id.reproduc);
        recyclerView.setAdapter(adapter = new SingerListAdapter(this.getContext()));
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext(), LinearLayoutManager.VERTICAL,false));
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        AppDatabase database = AppDatabase.getInstance(getContext());
        ProductionDao productionDao = database.productionDao();
        final List<Production> data = productionDao.loadAll();
        getActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
                adapter.setData(data);
            }
        });
    }
}
