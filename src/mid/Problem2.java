package mid;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Problem2 {

    public static void main(String[] args) {

        int[] arr=new int[]{1,2,0,4};
        int ans= helper(arr);
        System.out.println(ans);

    }

    /**
     * T : O(n) : for hast
     * S : O(n) : for one loop
     */
    public static int helper(int[] arr){
        Set<Integer> hash=new HashSet<>();
        for (int i:arr) hash.add(i);
        for (int i=0;i<=arr.length;i++) {
            if (!hash.contains(i)) return i;
        }
        return -1;
    }
}
