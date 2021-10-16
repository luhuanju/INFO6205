package assignment5;

public class Problem5 {


    /**
     * Time Complexity : O(n)
     * Space Complexity : O(1)
     */
    public int maxProfit(int[] prices) {

        int valley=prices[0];
        int n=prices.length;
        int profit= 0;
        for(int i=1;i<n;i++){
            if(prices[i]< valley){
                valley=prices[i];
            }else if(prices[i]-valley>profit){
                profit=prices[i]-valley;
            }
        }
        return profit;
    }
}
