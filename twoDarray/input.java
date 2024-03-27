package twoDarray;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        //taking input and printing the output of the 2D-array....................
        Scanner sc=new Scanner(System.in);
        int[][] arr= new int[3][4];
        //3 rows and 4 column;
        for(int i=0; i<arr.length; i++){
            System.out.println("enter the elements of the "+(i +1) + " row");
            for(int j=0; j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("printing the elements of array");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();

        }

    }
}
