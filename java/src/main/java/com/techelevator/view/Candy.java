package com.techelevator.view;

import java.math.BigDecimal;

public class Candy extends Inventory {
    public Candy(String slotNumber, String itemName, BigDecimal price) {
        super(slotNumber, itemName, price);
    }

    @Override
    public String getSound(){
        return "Munch Munch, Yum!";
    }
}
