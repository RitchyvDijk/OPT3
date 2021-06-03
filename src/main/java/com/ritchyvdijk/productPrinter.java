package com.ritchyvdijk;

public class productPrinter {

    public void printMeatConsole(Meat meat) {
        System.out.println("Product{" +
                "productBarcode=" + meat.getProductBarcode() +
                ", productBrand='" + meat.getProductBrand() + '\'' +
                ", productName='" + meat.getProductName() + '\'' +
                ", useBy=" + meat.getUseBy() + '\'' +
                ", animal=" + meat.getAnimal() + '\'' +
                ", type=" + meat.getType() + '\'' +
                ", weight=" + meat.getWeigth() +
                '}');
    }

    public void printDrinksConsole(Drinks drinks) {
        System.out.println("Product{" +
                "productBarcode=" + drinks.getProductBarcode() +
                ", productBrand='" + drinks.getProductBrand() + '\'' +
                ", productName='" + drinks.getProductName() + '\'' +
                ", useBy=" + drinks.getUseBy() + '\'' +
                ", flavor=" + drinks.getFlavor() + '\'' +
                ", getVolumeInL=" + drinks.getVolumeInL() +
                '}');
    }
}
