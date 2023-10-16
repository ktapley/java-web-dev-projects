package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPractice {

    public static void main(String[] args) {

        ArrayList<Integer> addEvens = new ArrayList<>();
        Integer[] otherList = new Integer[]{32, 41, 6, 87, 64, 2, 45, 72, 9, 10};
        Collections.addAll(addEvens, otherList);
        int evenTotal = 0;

        for (int even : addEvens) {
            if (even % 2 == 0) {
                evenTotal += even;
            }
        }
        System.out.println(evenTotal);
    }
}







