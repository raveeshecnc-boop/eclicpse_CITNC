package org.tnsif.acc.c2tc.interview_questions.basics;

public class LargestSmallest {
    public static void main(String[] args) {
        int[] arr = {12, 45, 2, 67, 34, 89, 5};

        int largest = arr[0];
        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }

            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("Largest Element: " + largest);
        System.out.println("Smallest Element: " + smallest);
    }
}