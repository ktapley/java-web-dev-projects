package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayPractice {

    public static void main(String[] args) {

        int[] nums = {1, 1, 2, 3, 5, 8};

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println(DrSeuss());
        System.out.println(ArrayList());
        System.out.println(fiveLetterWords());

    }

    public static String DrSeuss(){

        String quote = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a" +
                " house. I will not eat them with a mouse.";

        String[] splitQuote = quote.split(" ");
        String[] splitSentences = quote.split("\\.");

        return Arrays.toString(splitQuote) + "\n" + Arrays.toString(splitSentences);
    }

    public static int ArrayList() {
        ArrayList<Integer> addEvens = new ArrayList<>();
        Integer[] otherList = new Integer[]{32, 41, 6, 87, 64, 2, 45, 72, 9, 10};
        Collections.addAll(addEvens, otherList);
        int evenTotal = 0;

        for (int even : addEvens) {
            if (even % 2 == 0) {
                evenTotal += even;
            }
        }
        return evenTotal;
    }

    public static ArrayList<String> fiveLetterWords() {
        Scanner input = new Scanner(System.in);
        ArrayList<String> fiveLetters = new ArrayList<>();
        String[] words = new String[]{"horse", "cow", "pig", "birds", "chick", "fish", "farms", "chicken", "turkey"};
        Collections.addAll(fiveLetters, words);
        System.out.println("Enter a word length: ");
        int numChars = input.nextInt();
        ArrayList<String> fiveLetterArr = new ArrayList<>();

        for(String word : words){
            if (word.length() == numChars) {
                fiveLetterArr.add(word);
            }
        }
        input.close();
        return fiveLetterArr;
    }

}
