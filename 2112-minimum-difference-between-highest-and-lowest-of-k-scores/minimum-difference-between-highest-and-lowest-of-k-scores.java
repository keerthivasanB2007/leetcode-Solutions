class Solution {
    public int minimumDifference(int[] nums, int k) {
      
       if(nums.length==1)
         return 0;
        int i=0;
    Arrays.sort(nums);
        int mi=Integer.MAX_VALUE;
        while((i+k-1)<nums.length){
             int j=i+k-1;
             int d=0;
             if(nums[i]>nums[j])
                d=nums[i]-nums[j];
             else
                d=nums[j]-nums[i];
            if(d<mi)
               mi=d;
               i++;
        }
        return mi;
        
    }
}