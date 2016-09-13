package com.example.ayush.demomultiviewrecycler.viewholder;

import android.view.ViewGroup;
import android.widget.TextView;

import com.example.ayush.demomultiviewrecycler.BaseViewHolder;
import com.example.ayush.demomultiviewrecycler.DiscoveryItem;
import com.example.ayush.demomultiviewrecycler.R;

public class TrendingViewHolder extends BaseViewHolder<DiscoveryItem> {

    private final TextView text;

    public TrendingViewHolder(ViewGroup parent) {
        super(parent, R.layout.item_third_layout);
        text = (TextView) itemView.findViewById(R.id.text3);
    }

    public void setData(DiscoveryItem item) {
        text.setText("keyword " + item.keyword);
    }
}
