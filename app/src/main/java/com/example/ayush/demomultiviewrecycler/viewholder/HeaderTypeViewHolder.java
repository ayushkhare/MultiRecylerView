package com.example.ayush.demomultiviewrecycler.viewholder;

import android.view.ViewGroup;
import android.widget.TextView;

import com.example.ayush.demomultiviewrecycler.BaseViewHolder;
import com.example.ayush.demomultiviewrecycler.DiscoveryItem;
import com.example.ayush.demomultiviewrecycler.R;

public class HeaderTypeViewHolder extends BaseViewHolder<DiscoveryItem> {

    private final TextView text;

    public HeaderTypeViewHolder(ViewGroup parent) {
        super(parent, R.layout.item_forth_layout);
        text = (TextView) itemView.findViewById(R.id.text4);
    }

    public void setData(DiscoveryItem item) {
        text.setText(String.valueOf(item.type));
    }
}
