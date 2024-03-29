package twoDarray;

import java.util.Scanner;

public class practiceproblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[3][3];
        int[][] newarr=new int[3][3];
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[0].length ; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[0].length ; j++) {
                if(arr[i][j]==0){
                    for(int k=0; k<arr.length; k++){
                        newarr[k][j]=0;

                    }
                    for(int h=0; h<arr[0].length; h++){
                        newarr[i][h]=0;
                    }
                }
               else if  (newarr[i][j]!=0){
                    newarr[i][j]=arr[i][j];
                }

            }

        }
        //final matrix
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[0].length ; j++) {
                System.out.print(newarr[i][j]+ " ");

            }
            System.out.println();
        }
    }
}
