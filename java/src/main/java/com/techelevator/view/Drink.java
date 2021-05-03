package com.techelevator.view;

import java.math.BigDecimal;

public class Drink extends Inventory {
    public Drink(String slotNumber, String itemName, BigDecimal price) {
        super(slotNumber, itemName, price);
    }

    @Override
    public String getSound(){
        return "Glug Glug, Yum!";
    }
}
