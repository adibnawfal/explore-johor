package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A {@link Fragment} subclass that displays a list of shopping places.
 */
public class EventsFragment extends Fragment {


    public EventsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Create an array of places
        ArrayList<Place> places = new ArrayList<Place>();

        // Add to an array new objects with the data
        places.add(new Place(getString(R.string.galleria_battle_of_the_legend), getString(R.string.galleria_battle_of_the_legend_description), R.drawable.galleria_battle_of_the_legend));
        places.add(new Place(getString(R.string.wilderness_survival_camp), getString(R.string.wilderness_survival_camp_description), R.drawable.wilderness_survival_camp));
        places.add(new Place(getString(R.string.spark_all_riders_gathering_arg), getString(R.string.spark_all_riders_gathering_arg_description), R.drawable.spark_all_riders_gathering_arg));
        places.add(new Place(getString(R.string.karnival_jualan_lawak_rakyat), getString(R.string.karnival_jualan_lawak_rakyat_description), R.drawable.karnival_jualan_lawak_rakyat));
        places.add(new Place(getString(R.string.maqan_food_fest_2020), getString(R.string.maqan_food_fest_2020_description), R.drawable.maqan_food_fest_2020));
        places.add(new Place(getString(R.string.jauhar_tun_fatimah), getString(R.string.jauhar_tun_fatimah_description), R.drawable.jauhar_tun_fatimah));
        places.add(new Place(getString(R.string.fesku_2020), getString(R.string.fesku_2020_description), R.drawable.fesku_2020));
        places.add(new Place(getString(R.string.muslim_roadshow), getString(R.string.muslim_roadshow_description), R.drawable.muslim_roadshow));
        places.add(new Place(getString(R.string.festival_layang_sedunia), getString(R.string.festival_layang_sedunia_description), R.drawable.festival_layang_sedunia));

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
