package org.launchcode;

import java.util.List;
import java.util.Scanner;

public class ArrayList {
    //Write a static method to find the sum of all the even nums in an ArrayList found in main class
    public static int sumEven(Integer[] arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }

    //Write a static method to print out each word in a list that has exactly 5 letters. Then modify to
    //prompt user to enter a word length.
    public static String printFiveLetterWords(List<String> words) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word length: ");
        int numChars = input.nextInt();
        for (String word : words) {
            if (word.length() == numChars) {
                System.out.println(word);
            }
        }
        return words.toString();
    }
}
