package com.ritchyvdijk;

import java.util.ArrayList;
import java.util.Date;

public class Drinks extends Product{
    private ArrayList<Drinks> drinkProducts = new ArrayList<>();
    private String flavor;
    private double volumeInL;

    public Drinks(long barcode, String brand, String name, Date useBy, String flavor, Double volumeInL) {
        super(barcode, brand, name, useBy);
        this.flavor = flavor;
        this.volumeInL = volumeInL;
        drinkProducts.add(this);
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getVolumeInL() {
        return volumeInL;
    }

    public void setVolumeInL(double volumeInL) {
        this.volumeInL = volumeInL;
    }

}
