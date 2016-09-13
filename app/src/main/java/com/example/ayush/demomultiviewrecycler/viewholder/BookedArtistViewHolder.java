package com.example.ayush.demomultiviewrecycler.viewholder;

import android.view.ViewGroup;
import android.widget.TextView;

import com.example.ayush.demomultiviewrecycler.BaseViewHolder;
import com.example.ayush.demomultiviewrecycler.DiscoveryItem;
import com.example.ayush.demomultiviewrecycler.DiscoveryItemLastBooked;
import com.example.ayush.demomultiviewrecycler.R;

public class BookedArtistViewHolder extends BaseViewHolder<DiscoveryItem> {

    private TextView textView;

    public BookedArtistViewHolder(ViewGroup parent) {
        super(parent, R.layout.item_first_layout);
        textView = (TextView) itemView.findViewById(R.id.text1);
    }

    public void setData(DiscoveryItem item) {
        DiscoveryItemLastBooked di = (DiscoveryItemLastBooked) item;
        String userName = di.name;
        String email = di.email;
        textView.setText("last booked professional " + userName);
    }
}
