package Sorting;

public class selectionsort {
    public static void main(String[] args) {
//selection sort is unstable sort
        //worst case : O(n*2)
        //best case: O(n*2)
        //here we find the minimum element and push them to their respective position :
        int[] arr={5,4,3,2,1};
        int min=Integer.MAX_VALUE;
        int n=arr.length;
        int minindex=-1;
        for(int i=0; i<n-1;i++){
            for(int j=i; j<n;j++){
                if(arr[j]<min){
                    min=arr[j];
                    minindex=j;
                }
            }
            //swapping arr[i] with arr[index].....
            int temp=arr[i];
            arr[i]=arr[minindex];
            arr[minindex]=temp;
        }
        //after sorting
        for(int i: arr) {
            System.out.println(i);
        }
        }

}
