class Solution {
  
    public int minimumTotal(List<List<Integer>> triangle) {
       int n=triangle.size();
       if(n==1){
        return triangle.get(0).get(0);
    
       }
       int cost=0;
       int[][] dp=new int[n][n];
       for(int i=n-1;i>=0;i--){
        for(int j=0;j<triangle.get(i).size();j++){
            if(i==n-1){
               
                dp[i][j]=triangle.get(i).get(j);
            
            }
            else{
                dp[i][j]=triangle.get(i).get(j) + Math.min(dp[i+1][j],dp[i+1][j+1]);
                cost=dp[i][j];
   
            }
        }

       }
       return cost;
        
    }
}