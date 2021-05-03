package com.techelevator.view;

import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public abstract class Inventory {
    private String slotNumber;
    private String itemName;
    private BigDecimal price;
    private int quantity;
    private String sound;

    public String getSlotNumber() {
        return slotNumber;
    }

    public String getItemName() {
        return itemName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public Inventory() {
    }

    public Inventory(String slotNumber, String itemName, BigDecimal price) {
        this.slotNumber = slotNumber;
        this.itemName = itemName;
        this.price = price;
        this.quantity = 5;
        this.sound = getSound();
    }


    public void decrementQuantity() {
        if (quantity > 0) {
            quantity--;
        }
    }

    public abstract String getSound();


    @Override
    public String toString() {  //sout(inv) in CLI
        if (quantity > 0) {
            return slotNumber + " " + itemName + "  $" + price + "    Stock (" + quantity + ")";
        } else {
            return slotNumber + " " + itemName + "  $" + price + "    Stock (Sold Out)";
        }
    }
}
