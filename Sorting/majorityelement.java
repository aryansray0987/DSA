package Sorting;

import java.util.Scanner;

public class majorityelement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //bubble sort code 1;
        //worst case
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
            //optimisation of the code
            //after each pass we will check whether the array is sorted or not
            boolean flag=true ;
            for(int k=0; k<arr.length-1-i;k++){
                if(arr[k]>arr[k=1]) {
                    flag = false;
                    break;
                }
            }
            if(flag){
                break;
            }
        }
        //majority element is given by n/2 after the sorting .

        int majority;
       if(n%2==0){
            majority=(n/2)-1;
           System.out.println("majority element is :"+ arr[majority]);
       }
       else {
           majority = (n + 1) / 2;
           System.out.println("majority element is given by: " + arr[majority]);
       }
    }

    }

