package com.ritchyvdijk;

import org.junit.jupiter.api.*;

import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductTest {

    @BeforeAll
    static void addProduct() {
        Product product1 = new Product(20047559L, "Griekse Yogurt", "Milbona", "Greek Style Yogurt", "Natural 10% Fat", 1, "kg", new Date(2021, Calendar.MAY,19));
        Product product2 = new Product(8710395947225L, "Siroop", "Karvan Cévitam", "Ice Tea", "Peach", 750, "ml", new Date(2021, Calendar.JANUARY,31));
        Product product3 = new Product(4056489131304L, "Eieren", "Lidl", "Nederlandse Scharrel Eieren", "Scharrel", 12, "stuks", new Date(2021, Calendar.MAY,7));
    }

    @Test
    @DisplayName("Products added?")
    public void sizeProducts() {
        System.out.println(Product.products);
        assertEquals(3, Product.products.size());
    }

    @Test
    @DisplayName("Volume to string")
    public void massString() {
        System.out.println(Product.products.get(0).massToString());
        System.out.println(Product.products.get(1).massToString());
        System.out.println(Product.products.get(2).massToString());
        assertEquals("1 kg", Product.products.get(0).massToString());
        assertEquals("750 ml", Product.products.get(1).massToString());
        assertEquals("12 stuks", Product.products.get(2).massToString());
    }
}