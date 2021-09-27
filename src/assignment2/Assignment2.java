package assignment2;

import java.util.*;

public class Assignment2 {


    /**
     * Problem 1
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> hash=new HashMap<>();
        for(int i=0;i<nums.length;++i){
            if(hash.containsKey(target-nums[i])){
                return new int[]{hash.get(target-nums[i]),i};
            }
            hash.put(nums[i],i);
        }
        return new int[0];
    }


    /**
     * problem 2
     * @param intervals
     * @return
     */
    public int meetingRoom(int[][] intervals) {
        int[]start = new int[intervals.length];
        int[]end = new int[intervals.length];
        for(int i = 0; i < intervals.length; ++i){
            start[i] = intervals[i][0]; end[i] = intervals[i][1];
        }
        Arrays.sort(start); Arrays.sort(end);

        int i = 0; int j = 0; int count = 0; int len = 0;
        while(i < intervals.length && j < intervals.length){
            if(start[i] < end[j]){
                count++;   i++;
                len = Math.max(len, count);
            }else{
                j++;  count--;
            }
        }
        return len;


    }


    /**
     * Problem 3
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> hash=new HashSet<>();
        for(int i:nums1){
            hash.add(i);
        }
        Set<Integer> answer=new HashSet<>();

        for(int i: nums2){
            if(hash.contains(i)){
                answer.add(i);
            }
        }
        int res[]=new int[answer.size()];
        int idx=0;
        for(int i: answer){
            res[idx++]=i;
        }
        return res;
    }


    /**
     * Problem 4
     * @param nums
     * @return
     */
    public List<Integer> majority(int[] nums) {
        int count1=0;
        int count2=0;

        List<Integer> ans=new ArrayList<>();
        Integer potional1=null;
        Integer potional2=null;

        //first pass is to find possible candidate
        for(int n:nums){

            if (potional1 != null && potional1 == n) {
                count1++;
            } else if (potional2 != null && potional2 == n) {
                count2++;
            } else if (count1 == 0) {
                potional1 = n;
                count1++;
            } else if (count2 == 0) {
                potional2 = n;
                count2++;
            } else {
                count1--;
                count2--;
            }
        }
        // the reason requiring second pass is because int first step, there are will "possible" two candidates
        // but, it not necessarily satisfaction the n/3;
        // so reset the counter, check the limit check.
        count1=0;count2=0;

        for(int n:nums){
            if(n==potional1){
                count1++;
            }else if(n==potional2){
                count2++;
            }
        }

        if(count1>nums.length/3)
            ans.add(potional1);
        if(count2>nums.length/3){
            ans.add(potional2);
        }
        return ans;
    }

    /**
     * Problem 5
     * @param nums
     * @param target
     * @return
     */

    public int[] searchRange(int[] nums, int target) {

        if(nums.length==0)
            return new int[]{-1,-1};
        int res[]= new int[2];

        int low=0,hi=nums.length-1;
        int mid;
        while(low<hi){
            mid=low+(hi-low)/2;
            if(nums[mid]>=target){
                hi=mid;
            }else{
                low=mid+1;
            }
        }
        res[0]=nums[low]==target? low:-1;

        low=0;hi=nums.length-1;

        while(low<hi){
            mid=low+(hi-low+1)/2;
            if(nums[mid]==target){
                low=mid;
            }if(nums[mid]<target){
                low=mid+1;
            }if(nums[mid]>target){
                hi=mid-1;
            }

        }

        res[1]=nums[hi]==target? hi:-1;

        return res;
    }


    /**
     * Problems 6
     *
     * @param grid
     * @return
     */
    public int countNegatives(int[][] grid)
    {
        //  binary search: check the first negative element at each row.
        int c = 0;
        for (int i = 0, end = grid[i].length - 1; i < grid.length; i++) {
            int start = 0;
            while (start <= end) {
                int mid = (start + end) / 2;
                if (grid[i][mid] < 0) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            c = c + grid[i].length - start;
            end = start - 1;
        }
        return c;

    }



    /**
     * Problems 7
     * @param nums
     * @return
     */
    public int findPeakElement(int[] nums) {

        int start=0,end=nums.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(nums[mid]>nums[mid+1]){
                end=mid;
            }else if(nums[mid]<nums[mid+1]){
                start=mid+1;
            }
        }
        return start;

    }
    /**
     *
     * Pro 8
     * @param nums
     * @return
     */
    public int findDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int index=Math.abs(nums[i]);
            if(nums[index]<0) return index;
            nums[index]=0- nums[index];
        }
        return -1;
    }

    /**
     * Problem 9
     * @param arr
     * @param k
     * @return
     */
    public int findKthPositive(int[] arr, int k) {
        int n = 1, i = 0;
        while (i < arr.length) {
            if (n != arr[i])   k--; //Missing number.
            else if (n == arr[i]) i++;
            if (k == 0) return n;
            n++;
        }
        return n+k-1;
    }

}
