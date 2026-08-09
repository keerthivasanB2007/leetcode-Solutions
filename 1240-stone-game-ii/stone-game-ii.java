class Solution {
    int[][] dp;
    int solve(int[] suffSum,int m,int x){
            if(x>=suffSum.length){
                return 0;
            }
            if(2*m+x >= suffSum.length){
                return suffSum[x];
            }
            if(dp[x][m]!=0){

                return dp[x][m];
            }
            int max=0;
            for(int i=1;i<=2*m;i++){
                int oponent = solve(suffSum,Math.max(i,m),x+i);
                max = Math.max(max,suffSum[x]-oponent);

            }
            dp[x][m]=max;
            return max;
    }
    public int stoneGameII(int[] piles) {
        int[] suffSum = new int[piles.length];
        dp = new int[piles.length][piles.length+1];
        suffSum[piles.length-1]=piles[piles.length-1];
        for( int i = piles.length - 2;i>=0;i--){
            suffSum[i]=piles[i]+suffSum[i+1];
        }
        return solve(suffSum,1,0);
    }
}