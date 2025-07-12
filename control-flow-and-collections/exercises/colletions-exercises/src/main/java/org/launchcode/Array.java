package org.launchcode;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.launchcode.ArrayList.printFiveLetterWords;

public class Array {
    public static void main(String[] args) {
        int[] intArray = {1, 1, 2, 3, 5, 8};

        //Prints only odd numbers
        for (int i : intArray) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        //Divide string using .split method to split sentence at each space and store in a new array
        String seuss = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a" +
                " house. I will not eat them with a mouse";
        String[] split = seuss.split(" ");
        System.out.println(Arrays.toString(split));

        //Repeat, but have the sentence split at each sentence
        String[] sentence = seuss.split("\\.");
        System.out.println(Arrays.toString(sentence));

        //ArrayList array to call method from ArrayList Class
        Integer[] arrayList = {45, 66, 72, 3, 12, 24, 5, 65, 10, 32};
        Integer arr = ArrayList.sumEven(arrayList);
        System.out.println(arr);

        //Write a static method to print out each word in a list that has exactly 5 letters. Called here.
        List<String> wordList = List.of("apple", "tree", "grass", "water", "stone", "cat");
        System.out.println(printFiveLetterWords(wordList));

        Map<Integer, String> classRoster;

    }

}
