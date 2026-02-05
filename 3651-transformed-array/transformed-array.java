class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int i=0;
        int r[]=new int[nums.length];
        int k=0;
        while(i<nums.length){
            if(nums[i]==0){
                 r[k++]=nums[i];
               
           
            }
            else{
                int index=((nums[i]+i)%nums.length + nums.length)%nums.length;
                r[k++]=nums[index];
            }
            i++;
        }
        return  r;
    }
}