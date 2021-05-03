package com.techelevator.view;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//wallet

public class User {

    private BigDecimal balance = BigDecimal.valueOf(0.00);
    private Log logger = new Log();

    public User() {
    }

    public BigDecimal getBalance() {
        return balance;
    }

    //gives change in as few coins as possible
    public String giveChange() {
        BigDecimal quarter = BigDecimal.valueOf(0.25);
        BigDecimal dime = BigDecimal.valueOf(0.10);
        BigDecimal nickel = BigDecimal.valueOf(0.05);
        String message = "GIVE CHANGE: $" + balance.setScale(2);  //log
        BigDecimal numOfQuarters = balance.divide(quarter);
        balance = balance.subtract(quarter.multiply(BigDecimal.valueOf(numOfQuarters.intValue())));
        BigDecimal numOfDimes = balance.divide(dime);
        balance = balance.subtract(dime.multiply(BigDecimal.valueOf(numOfDimes.intValue())));
        BigDecimal numOfNickels = balance.divide(nickel);
        balance = balance.subtract(nickel.multiply(BigDecimal.valueOf(numOfNickels.intValue())));
        String takeChange = "Please take your change! " + numOfQuarters.intValue() + " Quarter(s), " + numOfDimes.intValue() + " Dime(s), " + numOfNickels.intValue() + " Nickel(s)";
        message = message + " $" + balance.setScale(2);  //log
        logger.logToFile(message);  //log
        return takeChange;
    }


    public BigDecimal addToBalance(BigDecimal addAmount) {
        String message = "FEED MONEY: $" + addAmount.setScale(2) + " $"; //log message
        balance = balance.add(addAmount);
        message = message + balance.setScale(2);  //log message
        logger.logToFile(message);  //log message
        return balance;
    }

    public boolean buyItem(Inventory buy) {  //withdraw method
        if (balance.compareTo(buy.getPrice()) >= 0) {
            String message = buy.getItemName() + " " + buy.getSlotNumber() + " $" + balance.setScale(2);  //log
            balance = balance.subtract(buy.getPrice());
            message = message + " $" + balance.setScale(2);  // log
            logger.logToFile(message); // log
            buy.decrementQuantity();
            System.out.println(buy.getItemName() + " costs $" + buy.getPrice());
            System.out.println(buy.getSound());
            return true;
        } else if (balance.equals(BigDecimal.valueOf(0.00))) {  // Alice can't figure out why this doesn't go. This is too interwoven with the CLI code. Also what exactly is 'buy"?
            System.out.println("You Have a $0.00 Balance. Please Enter Money!");
        }
        return false;
    }

}
