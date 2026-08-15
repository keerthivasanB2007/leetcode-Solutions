class Solution {
    public int longestSubsequence(int[] nums) {
        if((nums.length == 2) && (nums[0]^nums[1])==0){
                return 1;
        }
   
        int x = nums[0];
        int z=0;
        for(int i=1;i<nums.length;i++){
            x=x^nums[i];
            if(x==0)
              z++;
           
        }
      
        if(x!=0)
           return nums.length;
        if(z==(nums.length-1))
          return 0;
      
          return nums.length-1;
        
    }
}