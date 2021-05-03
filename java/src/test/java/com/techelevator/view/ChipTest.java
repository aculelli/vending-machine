package com.techelevator.view;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class ChipTest {
//A1|Potato Crisps|3.05|Chip
    @Test
    public void getSoundTest_pass_in_items_return_MunchMunchYum() {
        Chip chip = new Chip("A1", "Potato Crisps", new BigDecimal(3.05));

        String actual = chip.getSound();
        String expected = "Crunch Crunch, Yum!";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getQuantityTest_pass_in_5_return_5(){
        Inventory chip = new Chip("A1", "Potato Crisps", new BigDecimal(3.05));
        int actual = chip.getQuantity();
        int expected = 5;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getPriceTest_pass_305_get_305(){
        Inventory chip = new Chip("A1", "Potato Crisps", new BigDecimal(3.05));
        BigDecimal actual = chip.getPrice();
        BigDecimal expected = new BigDecimal(3.05);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getItemNameTest_pass_PotatoCrisps_return_PotatoCrisps(){
        Inventory chip = new Chip("A1", "Potato Crisps", new BigDecimal(3.05));
        String actual = chip.getItemName();
        String expected = "Potato Crisps";
        Assert.assertEquals(expected, actual);
    }

}