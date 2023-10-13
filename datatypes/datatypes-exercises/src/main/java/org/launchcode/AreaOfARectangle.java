package org.launchcode;

import java.util.Scanner;

public class AreaOfARectangle {

    public void Area(){

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a length:");
        int length = input.nextInt();
        System.out.println("Please enter a width:");
        int width = input.nextInt();
        int area = length * width;
        System.out.println("A rectangle that is " + length + " in length, and " + width + " in width has an area of: " + area);

    }

}
