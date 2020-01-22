package edu.itc.gic.m1.songbook.fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import edu.itc.gic.m1.assign_001.R;
import edu.itc.gic.m1.songbook.ListAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class SongFragment extends Fragment {

    RecyclerView recyclerView;

    public SongFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_song, container, false);
        recyclerView = view.findViewById(R.id.resong);
        recyclerView.setAdapter(new ListAdapter(this.getContext(),50,3));
        recyclerView.setLayoutManager(new GridLayoutManager(this.getContext(),2));
        return view;
    }
}
