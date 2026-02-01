class Solution {
    public int minimumCost(int[] nums) {
        
        int r=nums[0];
      int min1=Integer.MAX_VALUE;
      int min2=Integer.MAX_VALUE;
        int j=1;
        while(j<nums.length){
            if(nums[j]<=min1){
                min2=min1;
                min1=nums[j];
            }
            else if(nums[j]<=min2){
                min2=nums[j];
            }
          j++;
        }
        return r+min1+min2;
    }
}