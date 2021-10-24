package mid;

import java.util.Arrays;

public class Problem1 {

    public static void main(String[] args) {
        int[] arr=new int[]{0,1,0,2,3,4,5};
        exchange(arr);

    }

    /**
     * T : O(n)
     * S : O(1)
     */
    public static void exchange( int[] arr){

        int i=0,j=0;
        int n=arr.length;

       for (;j<n;j++){
           if (arr[j]!=0){
               arr[i++]=arr[j];
           }
       }
       for(;i<n;i++){
           arr[i]=0;
        }
       System.out.println(Arrays.toString(arr));
    }
}
