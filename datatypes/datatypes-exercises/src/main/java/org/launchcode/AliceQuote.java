package org.launchcode;


import java.util.Scanner;

public class AliceQuote {
    public static String getWord() {
        String quote = "Alice was beginning to get very tired of sitting " +
                "by her sister on the bank, and of having nothing to do: " +
                "once or twice she had peeped into the book her sister was reading," +
                " but it had no pictures or conversations in it, ‘and what is the use " +
                "of a book,’ thought Alice ‘without pictures or conversation?'";

        Scanner input = new Scanner(System.in);

        System.out.println("Search for a word: ");
        String wordSearched = input.nextLine();

       boolean found = quote.toLowerCase().contains(wordSearched.toLowerCase());

        System.out.println("Found? " + found);

        Integer index = quote.indexOf(wordSearched);
        Integer length = wordSearched.length();
        System.out.println("Your search word appears at index " + index + ". Your term is " + length + " characters " +
                "long.");

        String modifiedQuote = quote.replace(wordSearched, "");
        System.out.println(modifiedQuote);

        return "Found?";


    }
}
