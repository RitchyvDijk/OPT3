package com.ritchyvdijk;

import java.util.ArrayList;
import java.util.Date;

public class Meat extends Product{

    private ArrayList<Meat> meatProducts = new ArrayList<>();
    private String type;
    private String animal;
    private double weight;


    public Meat(long barcode, String brand, String name, Date useBy, String type, double weight, String animal) {
        super(barcode, brand, name, useBy);
        this.type = type;
        this.weight = weight;
        this.animal = animal;
        meatProducts.add(this);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public double getWeigth() {
        return weight;
    }

    public void setWeigth(double weight) {
        this.weight = weight;
    }

}
