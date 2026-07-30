class Solution {
    public void nextPermutation(int[] nums) {
        int pivot=0;
        boolean f=false;
        for(int i=nums.length-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1]){
                    pivot=i;
                    f=true;
                    break;
            }
        }
      
        if(!f){
            int i = 0;
            int j = nums.length-1;
            while ( i < j){
              
                int t = nums[i];
                nums[i]=nums[j];
                nums[j] = t;

                i++;
                j--;
            }

           return;
        }
        int x=0;
     
        for(int i = nums.length-1; i>=0;i--){
            if(nums[pivot] < nums[i]){
      
                int t = nums[pivot];
                nums[pivot]=nums[i];
                nums[i]=t;
                x=i;
               
                break;
            }
        }
     
            int j = nums.length;
            Arrays.sort(nums,pivot+1,j);
         

        
 }
}