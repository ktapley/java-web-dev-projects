package org.launchcode;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius:");
        double radius = input.nextDouble();
        double circleArea = Circle.getArea(radius);
        System.out.println("The area of a circle with a radius " + radius + " is " + circleArea);

    }

}
