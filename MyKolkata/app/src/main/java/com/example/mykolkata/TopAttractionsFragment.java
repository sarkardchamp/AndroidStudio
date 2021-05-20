package com.example.mykolkata;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class TopAttractionsFragment extends Fragment {

    public TopAttractionsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.word_list, container, false);
        final ArrayList<Word> arr = new ArrayList<>();

        arr.add(new Word(R.string.victoria_memorial, R.drawable.victoria_memorial,
                R.string.victoria_memorial_address, R.string.victoria_memorial_fee));
        arr.add(new Word(R.string.fort_william, R.drawable.fort_william,
                R.string.fort_william_address, R.string.fort_william_fee));
        arr.add(new Word(R.string.marble_palace, R.drawable.marble_palace,
                R.string.marble_palace_address, R.string.marble_palace_fee));
        arr.add(new Word(R.string.howrah_bridge, R.drawable.howrah_bridge,
                R.string.howrah_bridge_address, R.string.howrah_bridge_fee));
        arr.add(new Word(R.string.tagore_house, R.drawable.tagore_house,
                R.string.tagore_house_address, R.string.tagore_house_fee));
        arr.add(new Word(R.string.mother_house, R.drawable.mother_house,
                R.string.mother_house_address, R.string.mother_house_fee));
        arr.add(new Word(R.string.sundarbans, R.drawable.sundarbans,
                R.string.sundarbans_address, R.string.sundarbans_fee));
        arr.add(new Word(R.string.rabindra_sarovar, R.drawable.rabindra_sarovar,
                R.string.rabindra_sarovar_address, R.string.rabindra_sarovar_fee));
        arr.add(new Word(R.string.botanical_gargen, R.drawable.botanical_garden,
                R.string.botanical_gargen_address, R.string.botanical_gargen_fee));
        arr.add(new Word(R.string.alipore_zoo, R.drawable.alipore_zoo,
                R.string.alipore_zoo_address, R.string.alipore_zoo_fee));
        arr.add(new Word(R.string.st_paul_cathedral, R.drawable.st_paul_cathedral,
                R.string.st_paul_cathedral_address, R.string.st_paul_cathedral_fee));
        arr.add(new Word(R.string.birla_temple, R.drawable.birla_temple,
                R.string.birla_temple_address, R.string.birla_temple_fee));
        arr.add(new Word(R.string.nakhoda_mosque, R.drawable.nakhoda_mosque,
                R.string.nakhoda_mosque_address, R.string.nakhoda_mosque_fee));
        arr.add(new Word(R.string.princep_ghat, R.drawable.princep_ghat,
                R.string.princep_ghat_address, R.string.princep_ghat_fee));
        arr.add(new Word(R.string.eden_gardens, R.drawable.eden_gardens,
                R.string.eden_gardens_address, R.string.eden_gardens_fee));

        WordAdapter adapter = new WordAdapter(getActivity(), arr);
        ListView rootView = view.findViewById(R.id.list_view);
        rootView.setAdapter(adapter);

        return view;
    }
}