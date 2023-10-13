package org.launchcode;

import java.awt.geom.Area;
import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Hello, what is your name:");
        String name = input.nextLine();
        System.out.println("Hello " + name);

        AreaOfARectangle area = new AreaOfARectangle();
        area.Area();

        Mileage mileage = new Mileage();
        mileage.mileage();

        Alice alice = new Alice();
        alice.alice();

        input.close();

    }

}
