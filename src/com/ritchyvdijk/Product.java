package com.ritchyvdijk;

import java.util.ArrayList;
import java.util.Date;

public class Product {
    public static ArrayList<Product> products = new ArrayList<>();
    // standard information
    private long productBarcode;
    private String productBrand;
    private String productType;
    private String productName;
    private String productFlavor;
    private double productVolume;
    private String productVolumeType;
    private Date useBy;

    public Product(long barcode, String type, String brand, String name, String flavor, double volume, String volumeType, Date useBy ) {
        this.productBarcode = barcode;
        this.productBrand = brand;
        this.productType = type;
        this.productName = name;
        this.productFlavor = flavor;
        this.productVolume = volume;
        this.productVolumeType = volumeType;
        this.useBy = useBy;
        products.add(this);
    }

    public String massToString() {
        if(this.productVolume % 1 == 0) {
            return (int)this.productVolume + " " + this.productVolumeType;
        } else {
            return this.productVolume + " " + this.productVolumeType;
        }

    }

}
