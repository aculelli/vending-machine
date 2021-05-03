package com.techelevator.view;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class CandyTest {

    //why does this pass? B1|Moonpie|1.80|Candy
    @Test
    public void getSoundTest_pass_in_items_return_MunchMunchYum() {
        Inventory candy = new Candy("B1", "Moonpie", new BigDecimal(1.80));

        String actual = candy.getSound();
        String expected = "Munch Munch, Yum!";

        Assert.assertEquals(expected, actual);
    }

    //this passes with incorrect input as well
    @Test
    public void getSlotNumberTest_pass_in_B3_return_B3() {
        Inventory candy = new Candy("B3", "Wonka Bar", new BigDecimal(1.50));

        String actual = candy.getSlotNumber();
        String expected = "B3";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getQuantityTest_pass_in_5_return_5(){
        Inventory candy = new Candy("B3", "Wonka Bar", new BigDecimal(1.50));
        int actual = candy.getQuantity();
        int expected = 5;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getPriceTest_pass_150_get_150(){
        Inventory candy = new Candy("B3", "Wonka Bar", new BigDecimal(1.50));
        BigDecimal actual = candy.getPrice();
        BigDecimal expected = new BigDecimal(1.50);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getItemNameTest_pass_WonkaBar_return_WonkaBar(){
        Inventory candy = new Candy("B3", "Wonka Bar", new BigDecimal(1.50));
        String actual = candy.getItemName();
        String expected = "Wonka Bar";
        Assert.assertEquals(expected, actual);
    }

    //@Test
   // public void getItemNameTest_pass_in_
}//B3|Wonka Bar|1.50|Candy