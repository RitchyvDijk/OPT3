package com.ritchyvdijk;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Meat extends Product {

    private ArrayList<Meat> meatProducts = new ArrayList<>();
    private String type;
    private String animal;
    private double weight;


    public Meat(long barcode, String brand, String name, String useBy, String type, double weight, String animal) throws ParseException {
        super(barcode, brand, name, new SimpleDateFormat("dd/MM/yyyy").parse(useBy));
        this.type = type;
        this.weight = weight;
        this.animal = animal;
        meatProducts.add(this);
    }

    public Long getBarcode() {
        return super.getProductBarcode();
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
