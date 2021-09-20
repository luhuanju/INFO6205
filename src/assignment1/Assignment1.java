package assignment1;

import java.util.Arrays;

public class Assignment1 {

    public class Problem1{


        private int[] sortColors(int nums[]){

            int left=0;

            for(int i=0;i<nums.length;i++){
                if(nums[i]==0){
                    nums[i]=nums[left];
                    nums[left]=0;
                    left++;
                }
            }

            for(int i=left;i<nums.length;i++){
                if(nums[i]==1){
                    nums[i]=nums[left];
                    nums[left]=1;
                    left++;
                }
            }

            return nums;
        }






    }


    public class Problem2{

        /**
         * Pro 2
         *Given an array of meeting timeintervalswhereintervals[i] = [starti, endi],
         * determine if a person could attend all meetings.
         *
         * @param inteverl
         * @return
         */
        private boolean attendanceHelper (int inteverl[][]){
            Arrays.sort(inteverl,(int a[],int b[])->a[0]-b[0]);
            System.out.println(Arrays.asList(inteverl).toString());
            for (int i=1;i< inteverl.length;++i){
                if (inteverl[i-1] [1]>inteverl[i][0])
                    return false;
            }
            return true;
        };

    }

    public class Problem3{

        /**
         *
         * @param nums
         * @return
         */
        public int arrayPair(int[] nums) {
            int n=nums.length;
            // [1,3,2,4]
            int i =0;
            int min=0;
            Arrays.sort(nums);
            // [1,2,3,4]
            while(i<n-1){
                min+= nums[i];
                i+=2;
            }
            return min;
        }
    }

    public class Problem4{

        /**
         * Given an integer arraynumssorted innon-decreasingorder,
         * returnan array ofthe squares of each numbersorted in non-decreasing order.
         *
         * @param nums
         * @return
         */
        public int[] sortedSquares(int[] nums) {

            int ans[]=new int[nums.length];
            int idx=nums.length-1;

            int i=0,j=nums.length-1;
            while(i<=j){
                if(nums[i]* nums[i]<nums[j]* nums[j]){
                    ans[idx]=nums[j]* nums[j];
                    j--;
                }else{
                    ans[idx]=nums[i]* nums[i];
                    i++;
                }
                idx--;
            }
            return ans;
        }

    }

    public class Problem5{
        /**
         *
         * Pri.5
         * Given two stringssandt, returntrueiftis an anagram ofs, andfalseotherwise.
         *
         */
        private boolean anagramCheck(String s, String t){
            int[] hash =new int[26];

            for(char c: s.toCharArray())
                hash[c-'a']++;

            for(char c: t.toCharArray())
                hash[c-'a']--;

            for(int i=0;i<26;++i)
                if(hash[i]!=0)
                    return false;
            return true;
        }
    }


    public class Problem6{

        /**
         * Pro.6
         * Given an integer arraynums,
         * move all the even integers at the beginning of the array followed by all the odd integers
         * Example 1:Input:nums = [3,1,2,4]
         * Output:[2,4,3,1]
         */
        private int [] sortByParity(int arr[]){

            //fast-slow two pointers

            int n=arr.length;
            for(int i=0,j=0;j<n;++j){
                if(arr[j]%2==0){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    i++;
                }
            }
            return arr;
        }

    }

}



