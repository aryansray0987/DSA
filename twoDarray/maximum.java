package twoDarray;
import java.util.*;
public class maximum {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{23,1,56},{2,54,21}};
        int max=arr[0][0];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }
        System.out.println("maximum element in the given array is: "+ max);
    }
}
