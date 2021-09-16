package assignment1;

public class Assignment1 {

    public class Problem1{


    }


    public class Problem2{


    }

    public class Problem3{


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



