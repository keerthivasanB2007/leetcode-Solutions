class Solution {
    public int maximumProduct(int[] nums) {
       Arrays.sort(nums);
        
         int l=nums.length-1;
         int result2=nums[0]*nums[1]*nums[l];
          int result=nums[l]*nums[l-1]*nums[l-2];
        //  for(int i=nums.length-1;i>=nums.length-3;i--){
        //      result = result * nums[i];
        // }
        
        

        return  Math.max(result,result2);
    }
}