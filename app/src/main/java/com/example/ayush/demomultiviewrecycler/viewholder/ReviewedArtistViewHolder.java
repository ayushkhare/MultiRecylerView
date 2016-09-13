package com.example.ayush.demomultiviewrecycler.viewholder;

import android.view.ViewGroup;
import android.widget.TextView;

import com.example.ayush.demomultiviewrecycler.BaseViewHolder;
import com.example.ayush.demomultiviewrecycler.DiscoveryItem;
import com.example.ayush.demomultiviewrecycler.R;

public class ReviewedArtistViewHolder extends BaseViewHolder<DiscoveryItem> {

    private final TextView text;

    public ReviewedArtistViewHolder(ViewGroup parent) {
        super(parent, R.layout.item_second_layout);
        text = (TextView) itemView.findViewById(R.id.text2);
    }

    public void setData(DiscoveryItem item) {
        text.setText("last reviwed professional " + item.userName);
    }
}
