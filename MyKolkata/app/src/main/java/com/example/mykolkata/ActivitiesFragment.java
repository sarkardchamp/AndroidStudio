package com.example.mykolkata;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class ActivitiesFragment extends Fragment {

    public ActivitiesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.word_list, container, false);
        final ArrayList<Word> arr = new ArrayList<>();
        arr.add(new Word(R.string.aquatica, R.drawable.aquatica,
                R.string.aquatica_address, R.string.aquatica_fee));
        arr.add(new Word(R.string.nicco_park, R.drawable.nicco_park,
                R.string.nicco_park_address, R.string.nicco_park_fee));
        arr.add(new Word(R.string.dakshineshwar_temple, R.drawable.dakshineshwar_temple,
                R.string.dakshineshwar_temple_address, R.string.dakshineshwar_temple_fee));
        arr.add(new Word(R.string.science_city_kolkata, R.drawable.science_city_kolkata,
                R.string.science_city_kolkata_address, R.string.science_city_kolkata_fee));
        arr.add(new Word(R.string.birla_planetarium, R.drawable.birla_planetarium,
                R.string.birla_planetarium_address, R.string.birla_planetarium_fee));
        arr.add(new Word(R.string.snow_park, R.drawable.snow_park,
                R.string.snow_park_address, R.string.snow_park_fee));

        WordAdapter adapter = new WordAdapter(getActivity(), arr);
        ListView rootView = view.findViewById(R.id.list_view);
        rootView.setAdapter(adapter);

        return view;
    }
}