package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A {@link Fragment} subclass that displays a list of parks.
 */
public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Create an array of places
        ArrayList<Place> places = new ArrayList<Place>();

        // Add to an array new objects with the data
        places.add(new Place(getString(R.string.restoran_kari_kambing_40_hari), getString(R.string.restoran_kari_kambing_40_hari_description), R.drawable.restoran_kari_kambing_40_hari));
        places.add(new Place(getString(R.string.kacang_pool_haji), getString(R.string.kacang_pool_haji_description), R.drawable.kacang_pool_haji));
        places.add(new Place(getString(R.string.kopi_keju), getString(R.string.kopi_keju_description), R.drawable.kopi_keju));
        places.add(new Place(getString(R.string.murtabak_majid_special_cheese), getString(R.string.murtabak_majid_special_cheese_description), R.drawable.murtabak_majid_special_cheese));
        places.add(new Place(getString(R.string.restoran_zz_sup_tulang), getString(R.string.restoran_zz_sup_tulang_description), R.drawable.restoran_zz_sup_tulang));
        places.add(new Place(getString(R.string.pisang_goreng_mawar), getString(R.string.pisang_goreng_mawar_description), R.drawable.pisang_goreng_mawar));
        places.add(new Place(getString(R.string.onn_kitchen), getString(R.string.onn_kitchen_description), R.drawable.onn_kitchen));

        // Inflate current View object in places_list.xml
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        // Create PlaceAdapter object in current activity for data from places array
        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), places);

        // Create ListView object in places_list.xml and set the PlaceAdapter object to it
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(placeAdapter);

        // Return current View object with the data
        return rootView;
    }
}
