package com.example.ayush.demomultiviewrecycler.model;

import java.util.List;

public class LastBookedArtist {

    private Category category;

    private List<Professionals> professionals;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Professionals> getProfessionalsList() {
        return professionals;
    }

    public void setProfessionalsList(List<Professionals> professionalsList) {
        this.professionals = professionalsList;
    }
}
