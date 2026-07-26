class Solution {
    public int maximumProduct(int[] nums) {
       Arrays.sort(nums);
        
         int l=nums.length-1;

        return  Math.max(nums[0]*nums[1]*nums[l],nums[l]*nums[l-1]*nums[l-2]);
    }
}