class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0;
        int c=-101;
        for(int i=0;i<nums.length;i++){
              if(c!=nums[i]){
                c=nums[i];
                nums[k]=c;
                k++;
              }
        }
        return k;
    }
}