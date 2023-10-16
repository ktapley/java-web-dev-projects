package org.example;

public class ArrayPractice {

    public static void main(String[] args) {

        int[] nums = {1, 1, 2, 3, 5, 8};

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }

}
