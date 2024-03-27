package binarysearch;

import static java.lang.Math.min;

public class lowerbound {
    //lower bound is the minimum index such that arr[idx]>=target  ......
    //upper bound is the minimum index such that arr[idx]>target  .. .....
    public static void main(String[] args) {
        int[] arr={10,20,30,40,40,50,60,70};
        int target=4;
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
        System.out.println("lower index of the element is found at:"+ lb);
    }
}
