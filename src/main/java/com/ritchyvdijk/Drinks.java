package com.ritchyvdijk;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Drinks extends Product{
    private ArrayList<Drinks> drinkProducts = new ArrayList<>();
    private String flavor;
    private double volumeInL;

    public Drinks(long barcode, String brand, String name, String useBy, String flavor, double volumeInL) throws ParseException {
        super(barcode, brand, name, new SimpleDateFormat("dd/MM/yyyy").parse(useBy));
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
