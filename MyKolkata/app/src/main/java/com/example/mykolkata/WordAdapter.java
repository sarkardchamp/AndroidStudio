package com.example.mykolkata;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Activity context, ArrayList<Word> arr) {
        super(context, 0, arr);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext())
                    .inflate(R.layout.list_view_item, parent, false);
        }

        Word word = getItem(position);

        ImageView imageView = listItemView.findViewById(R.id.list_item_ic);
        imageView.setImageResource(word.getImageId());

        TextView name = listItemView.findViewById(R.id.name);
        name.setText(word.getNameId());

        TextView description = listItemView.findViewById(R.id.description);
        description.setText(word.getDescId());

        TextView contact = listItemView.findViewById(R.id.contact);
        TextView price = listItemView.findViewById(R.id.price);
        TextView price_text = listItemView.findViewById(R.id.price_text);

        int cId = word.getContactId();
        int tId = word.getTimingsId();

        if(cId != 0) {
            contact.setText(cId);
            price.setText(word.getPriceId());
        } else {
            contact.setVisibility(View.GONE);
            listItemView.findViewById(R.id.contact_text).setVisibility(View.GONE);
            price_text.setText(R.string.entry_fee);
            price.setText(word.getEntryFeeId());
        }

        if(tId != 0 && cId != 0) {
            price_text.setText(R.string.restaurant_price);
            TextView timings = listItemView.findViewById(R.id.timings);
            timings.setText(word.getTimingsId());

        } else {
            listItemView.findViewById(R.id.timings_text).setVisibility(View.GONE);
            listItemView.findViewById(R.id.timings).setVisibility(View.GONE);
        }

        String urlAddr = description.getText().toString();
        Button btn = listItemView.findViewById(R.id.route);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"Item Clicked!", Toast.LENGTH_SHORT).show();
                StringBuilder url = new StringBuilder("https://www.google.com/maps/dir/?api=1&destination=");
                for(int i = 0; i < urlAddr.length(); i++) {
                    if(urlAddr.charAt(i) == ' ') url.append('+');
                    else if(urlAddr.charAt(i) == ',') url.append("%2C");
                    else url.append(urlAddr.charAt(i));
                }
                url.append("&travelmode=driving");
                Log.v("onClick",url.toString());
                Intent it = new Intent(Intent.ACTION_VIEW, Uri.parse(url.toString()));
                getContext().startActivity(it);
            }
        });

        return listItemView;
    }
}
