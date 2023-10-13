package org.launchcode;

import java.util.Scanner;

public class Mileage {

  public void mileage() {

      Scanner input = new Scanner(System.in);
      System.out.println("Enter how many miles you drove:");
      int milesDriven = input.nextInt();
      System.out.println("Enter how many gallons you used:");
      int gallonsUsed = input.nextInt();
      int mileage = milesDriven / gallonsUsed;
      System.out.println("You drove: " + milesDriven + " miles, and used: " + gallonsUsed + " gallons of gas. Your " +
              "milage is: " + mileage + " mpg.");

  }

}
