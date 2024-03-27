package Sorting;

public class problem1 {
    public static void main(String[] args) {
        //question: given an array of integer and integer k<=n , return the kth smallest element
        int[] arr={2,6,45,23,56,13};
        int k=5;
        //after sorting the kth smallest element will be the k-1th element ;
        //applying bubble sort
        for(int i=0; i<arr.length-1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
        int smallest=arr[k-1];
        System.out.println("smallest kth element is :"+ smallest );

    }
}
