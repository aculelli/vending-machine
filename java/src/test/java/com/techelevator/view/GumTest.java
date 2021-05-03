package com.techelevator.view;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class GumTest {
//D1|U-Chews|0.85|Gum
    @Test
    public void getSoundTest_pass_in_items_return_MunchMunchYum() {
        Gum gum = new Gum("D1", "U-Chews", new BigDecimal(0.85));

        String actual = gum.getSound();
        String expected = "Chew Chew, Yum!";

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getQuantityTest_pass_in_5_return_5() {
        Inventory gum = new Gum("D1", "U-Chews", new BigDecimal(0.85));
        int actual = gum.getQuantity();
        int expected = 5;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getPriceTest_pass_085_get_085() {
        Inventory gum = new Gum("D1", "U-Chews", new BigDecimal(0.85));
        BigDecimal actual = gum.getPrice();
        BigDecimal expected = new BigDecimal(0.85);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getItemNameTest_pass_PotatoCrisps_return_PotatoCrisps() {
        Inventory gum = new Gum("D1", "U-Chews", new BigDecimal(0.85));
        String actual = gum.getItemName();
        String expected = "U-Chews";
        Assert.assertEquals(expected, actual);
    }

}