package com.example.mykolkata;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.word_list, container, false);
        final ArrayList<Word> arr = new ArrayList<>();
        arr.add(new Word(R.string.flurys_kolkata, R.drawable.flurys_kolkata,
                R.string.flurys_kolkata_address, R.string.flurys_kolkata_price,
                R.string.flurys_kolkata_contact, R.string.flurys_kolkata_timings));
        arr.add(new Word(R.string.aminia, R.drawable.aminia,
                R.string.aminia_address, R.string.aminia_price,
                R.string.aminia_contact, R.string.aminia_timings));
        arr.add(new Word(R.string.six_ballygunge_place, R.drawable.six_ballygunge_place,
                R.string.six_ballygunge_place_address, R.string.six_ballygunge_place_price,
                R.string.six_ballygunge_place_contact, R.string.six_ballygunge_place_timings));
        arr.add(new Word(R.string.peter_cat, R.drawable.peter_cat,
                R.string.peter_cat_address, R.string.peter_cat_price,
                R.string.peter_cat_contact, R.string.peter_cat_timings));
        arr.add(new Word(R.string.zeeshan_kolkata, R.drawable.zeeshan_kolkata,
                R.string.zeeshan_kolkata_address, R.string.zeeshan_kolkata_price,
                R.string.zeeshan_kolkata_contact, R.string.zeeshan_kolkata_timings));
        arr.add(new Word(R.string.mocambo, R.drawable.mocambo,
                R.string.mocambo_address, R.string.mocambo_price,
                R.string.mocambo_contact, R.string.mocambo_timings));
        arr.add(new Word(R.string.rendezvous, R.drawable.rendezvous,
                R.string.rendezvous_address, R.string.rendezvous_price,
                R.string.rendezvous_contact, R.string.rendezvous_timings));
        arr.add(new Word(R.string.the_corner_courtyard, R.drawable.the_corner_courtyard,
                R.string.the_corner_courtyard_address, R.string.the_corner_courtyard_price,
                R.string.the_corner_courtyard_contact, R.string.the_corner_courtyard_timings));
        arr.add(new Word(R.string.oudh_1590, R.drawable.oudh_1590,
                R.string.oudh_1590_address, R.string.oudh_1590_price,
                R.string.oudh_1590_contact, R.string.oudh_1590_timings));
        arr.add(new Word(R.string.jam_house, R.drawable.jam_house,
                R.string.jam_house_address, R.string.jam_house_price,
                R.string.jam_house_contact, R.string.jam_house_timings));
        arr.add(new Word(R.string.aaheli, R.drawable.aaheli,
                R.string.aaheli_address, R.string.aaheli_price,
                R.string.aaheli_contact, R.string.aaheli_timings));
        arr.add(new Word(R.string.alfresco, R.drawable.alfresco,
                R.string.alfresco_address, R.string.alfresco_price,
                R.string.alfresco_contact, R.string.alfresco_timings));
        arr.add(new Word(R.string.bohemian_kolkata, R.drawable.bohemian_kolkata,
                R.string.bohemian_kolkata_address, R.string.bohemian_kolkata_price,
                R.string.bohemian_kolkata_contact, R.string.bohemian_kolkata_timings));
        arr.add(new Word(R.string.la_cucina, R.drawable.la_cucina,
                R.string.la_cucina_address, R.string.la_cucina_price,
                R.string.la_cucina_contact, R.string.la_cucina_timings));

        WordAdapter adapter = new WordAdapter(getActivity(), arr);
        ListView rootView = view.findViewById(R.id.list_view);
        rootView.setAdapter(adapter);

        return view;
    }
}