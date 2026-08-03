class Solution {
    public String stoneGameIII(int[] stoneValue) {
        int n = stoneValue.length;
        int[] v = new int[n + 1];
        v[n] = 0;
        int take1=0,take2=0,take3=0;
        for(int i=n-1;i>=0;i--){
            take1 = stoneValue[i] - v[i+1];
            take2 = Integer.MIN_VALUE;
            take3 = Integer.MIN_VALUE;
            if(i<n-1)
                 take2 = stoneValue[i] + stoneValue[i+1] - v[i+2];

            if(i<n-2)
                take3 = stoneValue[i] + stoneValue[i+1] + stoneValue[i+2] - v[i+3];
          

            v[i] = Math.max(Math.max(take1,take2),take3); 
        }
        
        if(v[0]<0)
          return "Bob";
        if(v[0]>0)
            return "Alice";
        return "Tie";
    }
}