package Sorting;

import java.util.*;

public class InsertionSort {
    // It is also a sorting algorithm
    //worst case time complexity O(n*2);
    // insertion sort is a stable sort (since the relative order of same elements does not change)

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            for (int j = i; j >= 1; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
//        System.out.print(Arrays.toString(arr)); // Print the sorted array
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
//insertion sort best case time complexity = optimised bubble sort best case time complexity = O(n)