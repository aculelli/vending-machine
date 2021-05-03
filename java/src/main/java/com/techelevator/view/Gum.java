package com.techelevator.view;

import java.math.BigDecimal;

public class Gum extends Inventory {
    public Gum(String slotNumber, String itemName, BigDecimal price) {
        super(slotNumber, itemName, price);
    }

    @Override
    public String getSound(){
        return "Chew Chew, Yum!";
    }
}
