package org.launchcode;

import java.util.Scanner;

public class Alice {

    public void alice() {

        String quote = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, ‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?";
        String lowerCaseQuote = quote.toLowerCase();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word to search for:");
        String searchTerm = input.nextLine();
        String lowerCaseSearchTerm = searchTerm.toLowerCase();

        if (lowerCaseQuote.contains(lowerCaseSearchTerm)) {
            System.out.println("Your word: " + searchTerm + ", was found in the text, and is first found at index: " + lowerCaseQuote.indexOf(lowerCaseSearchTerm) + ", and is " + searchTerm.length() + " characters long.");
        } else {
            System.out.println("Your word was not found ");
        }

    }

}
