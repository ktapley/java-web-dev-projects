package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class DrSeuss {

    public static void main(String[] args) {
        String quote = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a" +
                " house. I will not eat them with a mouse.";

        String[] splitQuote = quote.split(" ");
        String[] splitSentences = quote.split("\\.");

        System.out.println(Arrays.toString(splitQuote));
        System.out.println(Arrays.toString(splitSentences));
    }

}
