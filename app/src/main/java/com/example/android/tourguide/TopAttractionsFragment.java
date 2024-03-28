package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A {@link Fragment} subclass that displays a list of cultural places.
 */
public class TopAttractionsFragment extends Fragment {


    public TopAttractionsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Create an array of places
        ArrayList<Place> places = new ArrayList<Place>();

        // Add to an array new objects with the data
        places.add(new Place(getString(R.string.legoland_malaysia), getString(R.string.legoland_malaysia_description), R.drawable.legoland_malaysia));
        places.add(new Place(getString(R.string.pasar_karat_jb), getString(R.string.pasar_karat_jb_description), R.drawable.pasar_karat_jb));
        places.add(new Place(getString(R.string.desaru_beach), getString(R.string.desaru_beach_description), R.drawable.desaru_beach));
        places.add(new Place(getString(R.string.desaru_fruit_farm), getString(R.string.desaru_fruit_farm_description), R.drawable.desaru_fruit_farm));
        places.add(new Place(getString(R.string.teluk_sengat_crocodile_farm), getString(R.string.teluk_sengat_crocodile_farm_description), R.drawable.teluk_sengat_crocodile_farm));
        places.add(new Place(getString(R.string.sultan_abu_bakar_state_mosque), getString(R.string.sultan_abu_bakar_state_mosque_description), R.drawable.sultan_abu_bakar_state_mosque));
        places.add(new Place(getString(R.string.tan_hiok_nee_heritage_street), getString(R.string.tan_hiok_nee_heritage_street_description), R.drawable.tan_hiok_nee_heritage_street));

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
