package org.launchcode;

import java.util.Scanner;

public class NumericTypes {
    public static Integer getNums() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a length: ");
        int length = input.nextInt();
        System.out.println("Enter a width: ");
        int width = input.nextInt();
        int area = length * width;
        System.out.println("The area of the rectangle is: " + area);
        return area;
    }
}
