package com.example.ayush.demomultiviewrecycler;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.example.ayush.demomultiviewrecycler.viewholder.BookedArtistViewHolder;
import com.example.ayush.demomultiviewrecycler.viewholder.HeaderTypeViewHolder;
import com.example.ayush.demomultiviewrecycler.viewholder.ReviewedArtistViewHolder;
import com.example.ayush.demomultiviewrecycler.viewholder.TrendingViewHolder;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<BaseViewHolder<DiscoveryItem>> {

    private List<DiscoveryItem> discoveryItems;

    public MyAdapter(List<DiscoveryItem> discoveryItems) {
        this.discoveryItems = discoveryItems;
    }

    public void setData(List<DiscoveryItem> discoveyItems) {
        this.discoveryItems = discoveyItems;
    }

    @Override
    public BaseViewHolder<DiscoveryItem> onCreateViewHolder(ViewGroup parent, int viewType) {
        BaseViewHolder<DiscoveryItem> viewHolder;
        switch (viewType) {
            case DiscoveryItem.HEADER_TYPE:
                viewHolder = new HeaderTypeViewHolder(parent);
                break;
            case DiscoveryItem.LAST_BOOKED_TYPE:
                viewHolder = new BookedArtistViewHolder(parent);
                break;
            case DiscoveryItem.LAST_REVIEWED_TYPE:
                viewHolder = new ReviewedArtistViewHolder(parent);
                break;
            case DiscoveryItem.TREDNING_TYPE:
                viewHolder = new TrendingViewHolder(parent);
                break;
            default:
                viewHolder = new BookedArtistViewHolder(parent);
                break;
        }
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(BaseViewHolder<DiscoveryItem> holder, int position) {
        DiscoveryItem item = discoveryItems.get(position);
        holder.setData(item);
    }

    @Override
    public int getItemCount() {
        return discoveryItems.size();
    }

    @Override
    public int getItemViewType(int position) {

        return discoveryItems.get(position).type;
    }
}
