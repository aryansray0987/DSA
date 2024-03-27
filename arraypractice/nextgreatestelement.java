package arraypractice;
import java.util.*;
public class nextgreatestelement {
    //here we are trying to find the greatest element in every subarray formed after the
    //every element of arr;

    public static void main(String[] args) {
//        int arr[]={12,8,41,37,2,14,16,28,21};
//        int arr1[]=new int[arr.length];
//        int max=Integer.MIN_VALUE;
//        for(int i=0;i<arr.length;i++){
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[j]>max){
//                    max=arr[j];
//                }
//            }
//            arr1[i]=max;
//            max=Integer.MIN_VALUE;
//        }
//        arr1[arr.length-1]=-1;
//        for(int item:arr1){
//            System.out.print(item+ " ");
//        }

        //method:2 ......  using single loop ...# best approach
        int arr[]={12,8,41,37,2,14,16,28,21};
       int arr1[]=new int[arr.length];
       int n=arr.length;
       int nge=arr[n-1];
        arr1[n-1]=-1;
        for(int i= n-2; i>=0;i--){
            arr1[i]=nge;
            nge=Math.max(nge,arr[i]);

        }

for(int item:arr1){
    System.out.print(item +" ");
}
    }
}
