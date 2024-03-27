package Sorting;

import java.util.Scanner;

public class sortingstringarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Sorting the array of string using bubble sort
        String str = "aryan";
        char[] charArray = str.toCharArray();
        int n = charArray.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (charArray[j] > charArray[j + 1]) {
                    // Swap characters
                    char temp = charArray[j];
                    charArray[j] = charArray[j + 1];
                    charArray[j + 1] = temp;
                }
            }
        }

        // Convert char array back to string
        String sortedString = new String(charArray);
        System.out.println(sortedString);
    }
}