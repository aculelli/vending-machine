package com.techelevator.view;


import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.*;

public class FileInventory {

    public List<Inventory> readFile() {

        String filePath = "C:\\Users\\Student\\workspace\\mod1-wk4-pairs-green-t2\\java\\vendingmachine.csv";
        File inventoryFile = new File(filePath);
        List<Inventory> inventoryList = new ArrayList<>();
        Scanner inventoryInput;
        {
            try {
                inventoryInput = new Scanner(inventoryFile);
                while (inventoryInput.hasNextLine()) {
                    String line = inventoryInput.nextLine();
                    String[] inventoryString = line.split("\\|");  //splits apart a single line of words from the file
                    BigDecimal bigDecimalInventory = new BigDecimal((inventoryString[2]));
                    bigDecimalInventory = bigDecimalInventory.setScale(2);
                    if (inventoryString[3].equals("Chip")) {
                        Inventory chip = new Chip(inventoryString[0], inventoryString[1], bigDecimalInventory);
                        inventoryList.add(chip);
                    } else if (inventoryString[3].equals("Drink")) {
                        Inventory drink = new Drink(inventoryString[0], inventoryString[1], bigDecimalInventory);
                        inventoryList.add(drink);
                    } else if (inventoryString[3].equals("Candy")) {
                        Inventory candy = new Candy(inventoryString[0], inventoryString[1], bigDecimalInventory);
                        inventoryList.add(candy);
                    } else if (inventoryString[3].equals("Gum")) {
                        Inventory gum = new Gum(inventoryString[0], inventoryString[1], bigDecimalInventory);
                        inventoryList.add(gum);
                    }
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        return inventoryList;
    }
}

