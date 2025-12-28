class Solution {
    public int findPeakElement(int[] nums) {
      if(nums.length==1)
         return 0;
        int i=0;
        int j=i+2;
        if(nums[i]>nums[i+1])
         return i;
        while(j<nums.length){
            if(nums[i+1]>nums[i] && nums[i+1]>nums[j]){
                break;
            }
            i++;
            j++;
        }
      //   if(nums[i]>nums[i+1])
        //  return i;
        return i+1;
    }
}