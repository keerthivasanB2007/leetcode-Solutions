class Solution {
    public int maxProfit(int[] prices) {
      
       int l=prices.length;
      int min=prices[0];
      int max=0;
           
            for(int i=0;i<l;i++){
                 if(prices[i]<min)
                    min=prices[i];
                else
                 max=Math.max(max,prices[i]-min);
                }
                    return max;
            }      
}
