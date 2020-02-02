package edu.itc.gic.m1.songbook.production;


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

/**
 * A simple {@link Fragment} subclass.
 */
public class ProductionFragment extends Fragment {

    RecyclerView recyclerView;
    ProductionListAdabter adapter;

    ImageView image;
    TextView name;
    // Room uses this factory method to create User objects.


    private Production[] PRODUCTS = {RED_LAMP,YELLOW_LAMP};

    private List<String,Production> productions;

    public Production create(long id, String name, String image) {
        return new Production(id, name, image);
        for (Production product : PRODUCTS) {
            productions.add(String.valueOf(product.getId()),product);
        }
    }

    public static final Production RED_LAMP = new Production(1,"Red Lamp","image");
    public static final Production YELLOW_LAMP = new Production(1,"Red Lamp","image");

    public ProductionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_production, container, false);
        recyclerView = view.findViewById(R.id.reproduc);
        recyclerView.setAdapter(adapter = new ProductionListAdabter(this.getContext()));
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext(), LinearLayoutManager.VERTICAL,false));
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        AppDatabase database = AppDatabase.getInstance(getContext());
        ProductionDao productionDao = database.productionDao();
//        final List<Production> productions = productionDao.loadAll();

        getActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
                adapter.setData(productions);
            }
        });
    }
}
