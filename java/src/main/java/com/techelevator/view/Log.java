package com.techelevator.view;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Log {
   File log = new File("C:\\Users\\Student\\workspace\\mod1-wk4-pairs-green-t2\\java\\src\\main\\resources\\log.txt");
   public void logToFile(String message) {
       LocalDateTime now = LocalDateTime.now();
       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss a");
       try (PrintWriter writer = new PrintWriter(new FileWriter(log, true))) {
           writer.println(now.format(formatter) + " " + message);
       } catch (IOException e) {
           System.out.println("error");
       }
       //LocalDate.now() + " " + LocalTime.now() + " " + message

   }
}
