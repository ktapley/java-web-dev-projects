package org.launchcode;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Hello, what is your name:");
    String name = input.nextLine();
    System.out.println("Hello " + name);

//    Integer nums = NumericTypes.getNums();

//    Double mileage = Double.valueOf(MilesPerGallon.getMiles());

        String words = AliceQuote.getWord();


}
}
