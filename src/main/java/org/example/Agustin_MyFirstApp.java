package org.example;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Agustin_MyFirstApp {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        LocalTime todayTime = LocalTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm:ss");

        System.out.println("My Name is Keith Ethan S. Agustin.");
        System.out.print(today + " " + todayTime.format(format));


    }
}