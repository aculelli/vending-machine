package com.techelevator.view;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class FileInventoryTest {
//doesn't take a parameter??
    @Test
    public void readFileTest(){
        FileInventory file = new FileInventory();
        List<Inventory> list = Arrays.asList(new Drink("A1", "Potato Crisps", new BigDecimal(3.05)));
        //assertThat(list, file); what do we put in here?
    }

   /* @Test
    public void readFileTest() {
        FileInventory file = new FileInventory();
        String testFileName = "/path/to/test/file/testFile";
        String expected = "my test";
        List<Inventory> inventoryInput = new ArrayList<>();
        String result = inventoryInput.read(testFileName);
        assertEquals(expected, result);

    }*/


}