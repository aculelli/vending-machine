package com.techelevator.view;

import java.math.BigDecimal;

public class Chip extends Inventory {
    //private String sound = "Crunch Crunch, Yum!";
    public Chip(String slotNumber, String itemName, BigDecimal price) {
        super(slotNumber, itemName, price);
    }

    @Override
    public String getSound(){
        return "Crunch Crunch, Yum!";
    }
}
