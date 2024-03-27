package twoDarray;

import java.util.Scanner;

public class transpose {
    public static void main(String[] args) {
        //transpose of a matrix....

        Scanner sc=new Scanner(System.in);
        int[][] a=new int [3][2];
        int[][] b=new int[2][3];
        System.out.println("enter the elements of matrix:");
         for(int i=0; i<a.length; i++){
             System.out.println("enter  the elements of "+(i+1)+ " row");
             for(int j=0; j<a[0].length; j++){
                 a[i][j]=sc.nextInt();
             }
         }

        for (int j = 0; j <a[0].length ; j++) {
            for (int i = 0; i <a.length ; i++) {
           b[j][i]=a[i][j];

            }
            System.out.println();
        }
        for (int i = 0; i <b[0].length ; i++) {
            for (int j = 0; j <b.length ; j++) {
                System.out.print(b[i][j]);
            }
            System.out.println();
        }
    }
}
