package twoDarray;

public class spiral {
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
int m=arr.length; int n=arr[0].length;
int minr=0; int maxr=m-1;
int minc=0;
int maxc=n-1;
while(minr<=maxr && minc<=maxc){
    //left to right... row is const
    for(int j=minc; j<=maxc; j++){
        System.out.print(arr[minr][j]+" ");

    }
    minr++;
    //top to bottom
    if(minr>maxr || minc>maxc)break;
    for(int i=minr; i<=maxr; i++){
        System.out.print(arr[i][maxc] + " ");
    }
    maxc--;
    //right to left
    if(minr>maxr || minc>maxc)break;
    for(int j=maxc; j>=minc; j--){
        System.out.print(arr[maxr][j]+ " ");
    }
    maxr--;
    //bottom to top...
    if(minr>maxr || minc>maxc)break;
    for(int i=maxr; i>=minr; i--){
        System.out.print(arr[i][minc] +" ");
    }
    minc++;


}

    }
}
