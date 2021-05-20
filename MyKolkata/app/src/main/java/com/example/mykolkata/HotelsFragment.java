package com.example.mykolkata;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class HotelsFragment extends Fragment {

    public HotelsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.word_list, container, false);
        final ArrayList<Word> arr = new ArrayList<>();
        arr.add(new Word(R.string.the_oberoi_grand_kolkata, R.drawable.the_oberoi_grand_kolkata,
                R.string.the_oberoi_grand_kolkata_address, R.string.the_oberoi_grand_kolkata_price,
                R.string.the_oberoi_grand_kolkata_contact));
        arr.add(new Word(R.string.itc_royal_bengal, R.drawable.itc_royal_bengal,
                R.string.itc_royal_bengal_address, R.string.itc_royal_bengal_price,
                R.string.itc_royal_bengal_contact));
        arr.add(new Word(R.string.the_westin_kolkata_rajarhat, R.drawable.the_westin_kolkata_rajarhat,
                R.string.the_westin_kolkata_rajarhat_address, R.string.the_westin_kolkata_rajarhat_price,
                R.string.the_westin_kolkata_rajarhat_contact));
        arr.add(new Word(R.string.jw_marriot_hotel_kolkata, R.drawable.jw_marriot_hotel_kolkata,
                R.string.jw_marriot_hotel_kolkata_address, R.string.jw_marriot_hotel_kolkata_price,
                R.string.jw_marriot_hotel_kolkata_contact));
        arr.add(new Word(R.string.holiday_inn_kolkata_airport, R.drawable.holiday_inn_kolkata_airport,
                R.string.holiday_inn_kolkata_airport_address, R.string.holiday_inn_kolkata_airport_price,
                R.string.holiday_inn_kolkata_airport_contact));
        arr.add(new Word(R.string.novotel_kolkata_hotel, R.drawable.novotel_kolkata_hotel,
                R.string.novotel_kolkata_hotel_address, R.string.novotel_kolkata_hotel_price,
                R.string.novotel_kolkata_hotel_contact));
        arr.add(new Word(R.string.vivanta_kolkata_em_bypass, R.drawable.vivanta_kolkata_em_bypass,
                R.string.vivanta_kolkata_em_bypass_address, R.string.vivanta_kolkata_em_bypass_price,
                R.string.vivanta_kolkata_em_bypass_contact));
        arr.add(new Word(R.string.itc_sonar, R.drawable.itc_sonar,
                R.string.itc_sonar_address, R.string.itc_sonar_price,
                R.string.itc_sonar_contact));
        arr.add(new Word(R.string.the_rajbari_bawali, R.drawable.the_rajbari_bawali,
                R.string.the_rajbari_bawali_address, R.string.the_rajbari_bawali_price,
                R.string.the_rajbari_bawali_contact));

        WordAdapter adapter = new WordAdapter(getActivity(), arr);
        ListView rootView = view.findViewById(R.id.list_view);
        rootView.setAdapter(adapter);
        rootView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
        return view;
    }
}