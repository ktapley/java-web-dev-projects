package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FiveLetterWords {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<String> fiveLetters = new ArrayList<>();
        String[] words = new String[]{"horse", "cow", "pig", "birds", "chick", "fish", "farms", "chicken", "turkey"};
        Collections.addAll(fiveLetters, words);
        System.out.println("Enter a word length: ");
        int numChars = input.nextInt();
        ArrayList<String> fiveLetterWords = new ArrayList<>();

        for(String word : words){
            if (word.length() == numChars) {
                fiveLetterWords.add(word);
            }
        }
        input.close();
        System.out.println(fiveLetterWords);
    }

}
