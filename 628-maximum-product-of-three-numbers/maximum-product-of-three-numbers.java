class Solution {
    public int maximumProduct(int[] nums) {
       Arrays.sort(nums);
         int result=1;
         int result2=nums[0]*nums[1]*nums[nums.length-1];
         for(int i=nums.length-1;i>=nums.length-3;i--){
             result = result * nums[i];
        }

        

        return  Math.max(result,result2);
    }
}