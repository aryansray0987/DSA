package twoDarray;

import java.util.Scanner;

public class rotatematrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[3][3];
        int[][] transpose=new int[3][3];
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length ; j++) {
                arr[i][j]= sc.nextInt();

            }

        }
        System.out.println("printing the elements of array:");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                System.out.print(arr[i][j]+ " ");

            }
            System.out.println();
        }
        //after rotate 90 .... transpose +  swapping of elements of each row ...
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length ; j++) {
                transpose[j][i]=arr[i][j];
            }
        }
        //swapping
       int start =0;
        int end=arr.length-1;
            int k=0;
          while(k<arr.length){
              while(start<=end){
                  int temp=transpose[k][start];
                  transpose[k][start]=transpose[k][end];
                  transpose[k][end]=temp;


                  start++;
                  end--;
              }
              k++;
              start=0;
              end=arr.length-1;
          }
            //printing the rotated matrix
           // using for each loop.....
        System.out.println("after rotation the matrix will be :");
               for(int[] i:transpose){
                   for(int j:i){
                       System.out.print(j + " "); 
                   }
                   System.out.println();
               }


            }

        }

