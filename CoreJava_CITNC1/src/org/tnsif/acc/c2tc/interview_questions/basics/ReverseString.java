package org.tnsif.acc.c2tc.interview_questions.basics;
public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello World";

        char[] chars = str.toCharArray();

        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            // Swap characters
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }

        String reversed = new String(chars);
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversed);
    }
}