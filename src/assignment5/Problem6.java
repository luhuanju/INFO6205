package assignment5;

public class Problem6 {

    /**
     * Time Complexity : O(n)
     * Space Complexity : O(1)
     */
    public int pivotIndex(int[] nums) {

        int allSum=0;

        for(int i: nums){
            allSum+=i;
        }

        int left=0;

        for(int i=0;i<nums.length;i++){

            if(left==allSum-left-nums[i]){
                return i;
            }
            left+=nums[i];

        }


        return -1;

    }
}
