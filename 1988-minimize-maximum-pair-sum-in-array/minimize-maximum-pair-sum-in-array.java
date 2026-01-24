class Solution {
    public int minPairSum(int[] nums) {
          int i=0,j=nums.length-1;
          int m=0;
          Arrays.sort(nums);
          while(i<j){
            int sum=nums[i]+nums[j];
            if(m<sum)
               m=sum;
            i++;
            j--;
          }
          return m;
    }
}