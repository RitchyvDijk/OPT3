package com.ritchyvdijk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactuurTest {

    @Test
    void getFactuurPrijs() {
        assertEquals(0.0, new Factuur(0).getFactuurPrijs());
        assertEquals(80.0, new Factuur(1).getFactuurPrijs());
        assertEquals(160.0, new Factuur(2).getFactuurPrijs());
        assertEquals(225.0, new Factuur(3).getFactuurPrijs());
        assertEquals(375.0, new Factuur(5).getFactuurPrijs());
        assertEquals(450.0, new Factuur(6).getFactuurPrijs());
        assertEquals(490.0, new Factuur(7).getFactuurPrijs());
        assertEquals(700.0, new Factuur(10).getFactuurPrijs());
    }

}