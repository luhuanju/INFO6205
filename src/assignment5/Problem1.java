package assignment5;

public class Problem1 {


    /**
     * Time Complexity : O(log(str.length()))
     * Space Complexity :  O(1)
     */
    public int myAtoi(String str) {
        str = str.trim();
        int sign = 1;
        int cnum = 0,num = 0;
        for(int i = 0; i < str.length();i++) {
            cnum = str.charAt(i) - 48;
            if(cnum >= 0 && cnum <= 9) {
                if (num > Integer.MAX_VALUE/10 || (num == Integer.MAX_VALUE / 10 && cnum > 7)) return Integer.MAX_VALUE;
                else if (num < Integer.MIN_VALUE/10 || (num == Integer.MIN_VALUE / 10 && cnum > 8)) return Integer.MIN_VALUE;
                else {
                    num = num *10 + sign * cnum;
                }
            }
            else if(i == 0) {
                if(str.charAt(i) == '+')
                    continue;
                else if(str.charAt(i) == '-')
                    sign  = -1;
                else break;
            }
            else break;
        }
        return num;
    }

}
