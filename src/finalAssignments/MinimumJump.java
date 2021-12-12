package finalAssignments;

public class MinimumJump {

    public static void main(String[] args) {

        int[] arr1=new int[]{1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        int minAns1= jump(arr1);
        System.out.println(minAns1);

        int[] arr2=new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int minAns2= jump(arr2);
        System.out.println(minAns2);


        int[] arr3=new int[]{0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int minAns3= jump(arr3);
        System.out.println(minAns3);
    }

    /**
     * Time : O (n)
     *
     * @param arr
     * @return
     */
    public static int jump(int[] arr) {
        // if the first is can not get to there
        if(arr[0]==0) return -1;

        int n = arr.length - 1, curr = -1, next = 0, ans = 0;
        for (int i = 0; next < n; i++) {
            if (i > curr) {
                ans++;
                curr = next;
            };
            next = Math.max(next, arr[i] + i);
        };
        return ans;
    };

}
