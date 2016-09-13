package com.example.ayush.demomultiviewrecycler;

import com.example.ayush.demomultiviewrecycler.model.Data;
import com.example.ayush.demomultiviewrecycler.model.LastBookedArtist;
import com.example.ayush.demomultiviewrecycler.model.LastReviewedArtist;
import com.example.ayush.demomultiviewrecycler.model.Professionals;
import com.example.ayush.demomultiviewrecycler.model.Trending;

import java.util.ArrayList;
import java.util.List;

//separate class to convert the data received from the api response into individual discovery items

public class DiscoveryResponseConverter {

    private Data data;

    public DiscoveryResponseConverter(Data data) {
        this.data = data;
    }

    public List<DiscoveryItem> convert() {

        List<DiscoveryItem> discoveryItemList = new ArrayList<>();

        // header being added to discovery item list
        DiscoveryItem header1 = new DiscoveryItem();
        header1.type = DiscoveryItem.HEADER_TYPE;
        discoveryItemList.add(header1);

        // last booked artist conversion into discovery items and adding each discovery item to discovery item list
        if(data.getLastBookedArtistList() != null) {
            for (LastBookedArtist artist : data.getLastBookedArtistList()) {
                List<Professionals> professionalList = artist.getProfessionalsList();
                for (Professionals professional : professionalList) {
                    DiscoveryItem item = convertProfessional(professional);
                    discoveryItemList.add(item);
                }
            }
        }

        // another head after last booked artist list being added into discovery items list
        DiscoveryItem header2 = new DiscoveryItem();
        header2.type = DiscoveryItem.HEADER_TYPE;
        discoveryItemList.add(header2);

        // now we add all the last reviewed artist username into discovery item list
        if(data.getLastReviewedArtistList() != null) {
            for (LastReviewedArtist artist : data.getLastReviewedArtistList()) {
                DiscoveryItem item = new DiscoveryItem();
                item.type = DiscoveryItem.LAST_REVIEWED_TYPE;
                item.userName = artist.getUserName();
                discoveryItemList.add(item);
            }
        }

        //now we add all the trending keyword into discovery item list
        for (Trending keyword : data.getTrendingList()) {
            DiscoveryItem item = new DiscoveryItem();
            item.type = DiscoveryItem.TREDNING_TYPE;
            item.keyword = keyword.getKeyword();
            discoveryItemList.add(item);
        }
        return discoveryItemList;
    }

    // function to covert each professional object into discovery item
    private DiscoveryItem convertProfessional(Professionals professional) {
        DiscoveryItemLastBooked item = new DiscoveryItemLastBooked();
        item.type = DiscoveryItem.LAST_BOOKED_TYPE;
        item.name = professional.getUserName();
        return item;
    }
}
