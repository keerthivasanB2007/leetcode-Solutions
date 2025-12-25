class Solution {
    public int removeElement(int[] nums, int val) {
          int k=0;
        int c=val;
        for(int i=0;i<nums.length;i++){
              if(c!=nums[i]){
                
                nums[k]=nums[i];
                k++;
              }
        }
        return k;
    }
}