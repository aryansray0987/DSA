package twoDarray;

import java.util.Scanner;

public class addtwomatrix {
    public static void main(String[] args) {


    //program to add two matrix
    Scanner sc=new Scanner(System.in);
    int[][] c=new int [3][3];
    int[][] a=new int[3][3];
    int[][] b=new int[3][3];
        System.out.println("enter the elements of matrix 1:");
    for(int i=0; i<a.length; i++){
        System.out.println("enter the elements of "+ (i+1) + " row");
        for(int j=0; j<a[0].length; j++) {
            a[i][j]=sc.nextInt();
        }
    }
        System.out.println("enter the elements of matrix 2:");
        for(int i=0; i<b.length; i++){
            System.out.println("enter the elements of "+ (i+1) + " row");
            for(int j=0; j<b[0].length; j++) {
                b[i][j]=sc.nextInt();
            }
        }
        for(int i=0; i<a.length; i++){

            for(int j=0; j<a[0].length; j++) {
             c[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("printing the matrix after addition :");
        for(int i=0; i<c.length; i++){

            for(int j=0; j<c[0].length; j++) {
                System.out.print(c[i][j] +"   ");
            }
            System.out.println();
        }

}
}
