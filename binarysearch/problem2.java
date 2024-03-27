package binarysearch;

public class problem2 {
    //Question: find the peak index in mountain array
    public static void main(String[] args) {
        int[] arr={1,4,5,10,3,2,1};
        int n=arr.length;
        boolean result=false;
        int idx=0;
        for(int i=1; i<n-1;i++){ //takes O(n) time ....
            if(arr[i]>arr[i+1] && arr[i]>arr[i-1]){
                result=true;
                idx=i;
                break;
            }


        }
        if(result){
            System.out.println("peak is found at index:"+idx);
        }
        else{
            System.out.println("peak is not found in the given array");
        }
        //another method to solve it in O(logN) time complexity using binary search(efficient method )

        //while(l<r){
        //if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) return mid;
        //else if(arr[mid]>arr[m-1] && arr[mid]<arr[mid+1]) l=mid+1;
        //else if(arr[mid]<arr[m-1] && arr[mid]>arr[mid+1]) r=mid-1;

        //this method is more appropriate ...



    }
}
