package org.launchcode;

import java.util.Scanner;

public class MilesPerGallon {

    public static Integer getMiles() {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles did you drive: ");
        double miles = input.nextInt();
        System.out.println("How many gallons of gas did you use: ");
        double gallons = input.nextInt();
        double mileage = miles / gallons;
        System.out.println("Your mileage was: " + mileage + " miles per gallon.");

        return (int) mileage;
    }
}

