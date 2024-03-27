package arraypractice;

public class mergearray {
    public static void main(String[] args) {
        int[] a={2,5,45,90};
        int[] b={23,34,56,67};
        int[] c=new int[a.length+b.length];
        int i=0;int j=0; int k=0;

        while (i<a.length && j<b.length){
           if(a[i]<=b[j]){
               c[k] = a[i];
               i++;
               k++;

           }
           else{
               c[k]=b[j];
               j++;k++;
           }
        }
        if(i==a.length){
            while(j<b.length){
                c[k]=b[j];
                j++; k++;
            }
        }
        if(j==b.length){
            while(i<a.length){
                c[k]=a[i];
                k++;i++;
            }
        }
        for(int item:c){
            System.out.println(item);
        }
    }
}
