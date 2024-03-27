package binarysearch;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class problem1 {
    public static void main(String[] args) {
        //question: finding the first and the last occurrence of  element in the given array ...
        //first occurrence=lower bound
        //last occurrence= upperbound-1.



        //firstofall also check whether the target element exist in the array or not .....
        int[] arr={10,20,30,40,40,40,40,50,60,70};
        int target=40;
        int n=arr.length;
        int lb=8;
        int l=0,r=n-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(target<=arr[mid]){
                r=mid-1;
                lb=min(lb,mid);

            }
            else{
                l=mid+1;
            }
        }


l=0;
        r=n-1;
        int ub=Integer.MIN_VALUE;

        while(l<=r){
            int mid=(l+r)/2;
            if(target<arr[mid]){
                r=mid-1;
                ub=max(ub,mid);

            }
            else{
                l=mid+1;
            }
        }
        int firstoccur=lb;
        int lastoccur=ub-1;
        System.out.println(firstoccur);
        System.out.println(lastoccur);
    }
}
//this question can also be solved without using the lower and upper bound concept .......