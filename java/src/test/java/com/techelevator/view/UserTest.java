package com.techelevator.view;

import com.sun.source.tree.IfTree;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void addToBalance_Test_pass_in_2_return_2() {
        User user = new User();

        BigDecimal actual = user.addToBalance(BigDecimal.valueOf(2.00));
        BigDecimal expected = BigDecimal.valueOf(2.00);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addToBalanceTest_balance_2_pass_in_2_return_4() {
        User user = new User();
        BigDecimal balance = BigDecimal.valueOf(2.00);
        BigDecimal actual = balance.add(user.addToBalance((BigDecimal.valueOf(2.00))));
        BigDecimal expected = BigDecimal.valueOf(4.00);

        Assert.assertEquals(expected, actual);

    }

    //how do we set this up?? B1|Moonpie|1.80|Candy
    /*@Test
    public void buyItemTest_pass_in_price_return_true() {
        User user = new User();
        user.buyItem("B1", "Moonpie", new BigDecimal(1.80));
        boolean actual = user.buyItem()
        Assert.assertEquals();*/

   // }
//This doesn't work because we can't set a value to balance
    @Test
    public void giveChangeTest_pass_300_return_300() {
        User user = new User();
        user.addToBalance(BigDecimal.valueOf(0.40));
        String actual = user.giveChange();
        String expected = "Please take your change! 1 Quarter(s), 1 Dime(s), 1 Nickel(s)";
        Assert.assertEquals(expected, actual);

    }
}