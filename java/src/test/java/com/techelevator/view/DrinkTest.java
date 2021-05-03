package com.techelevator.view;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class DrinkTest {
    //C1|Cola|1.25|Drink
    @Test
    public void getSoundTest_pass_in_items_return_GlugGlugYum() {
        Drink drink = new Drink("C1", "Cola", new BigDecimal(1.25));

        String actual = drink.getSound();
        String expected = "Glug Glug, Yum!";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getQuantityTest_pass_in_5_return_5() {
        Inventory drink = new Drink("C1", "Cola", new BigDecimal(1.25));
        int actual = drink.getQuantity();
        int expected = 5;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getPriceTest_pass_125_get_125() {
        Inventory drink = new Drink("C1", "Cola", new BigDecimal(1.25));
        BigDecimal actual = drink.getPrice();
        BigDecimal expected = new BigDecimal(1.25);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getItemNameTest_pass_Cola_return_Cola() {
        Inventory drink = new Drink("C1", "Cola", new BigDecimal(1.25));
        String actual = drink.getItemName();
        String expected = "Cola";
        Assert.assertEquals(expected, actual);
    }
}
