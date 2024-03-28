package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A {@link Fragment} subclass that displays a list of monuments.
 */
public class ShoppingMallsFragment extends Fragment {


    public ShoppingMallsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Create an array of places
        ArrayList<Place> places = new ArrayList<Place>();

        // Add to an array new objects with the data
        places.add(new Place(getString(R.string.johor_premium_outlets), getString(R.string.johor_premium_outlets_description), R.drawable.johor_premium_outlets));
        places.add(new Place(getString(R.string.paradigm_mall), getString(R.string.paradigm_mall_description), R.drawable.paradigm_mall));
        places.add(new Place(getString(R.string.ikea_tebrau), getString(R.string.ikea_tebrau_description), R.drawable.ikea_tebrau));
        places.add(new Place(getString(R.string.angsana_mall), getString(R.string.angsana_mall_description), R.drawable.angsana_mall));
        places.add(new Place(getString(R.string.ksl_city), getString(R.string.ksl_city_description), R.drawable.ksl_city));
        places.add(new Place(getString(R.string.city_square_jb), getString(R.string.city_square_jb_description), R.drawable.city_square_jb));
        places.add(new Place(getString(R.string.aeon_bukit_indah), getString(R.string.aeon_bukit_indah_description), R.drawable.aeon_bukit_indah));

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
