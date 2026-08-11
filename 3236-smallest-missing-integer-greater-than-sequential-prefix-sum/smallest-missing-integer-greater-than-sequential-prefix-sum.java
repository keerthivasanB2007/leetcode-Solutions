class Solution {
    public int missingInteger(int[] nums) {
         if(nums.length==1)
          return nums[0]+1;
        int sum = 0;
        
        int j=1;
        int max =0;
        while(j<nums.length){
        //    System.out.println("nums[i]="+nums[i]);
       
           
          
            if((nums[j-1]+1)== nums[j]){
                sum = sum + nums[j-1];
               
            }
            else
             {
                // if((j-1)==0  || (nums[j-1] == (nums[j-2]+1)))
                //     sum = sum + nums[j-1];
             
                break;
             }
          
          j++;
        }
   
          if((j-1)==0  || (nums[j-1] == (nums[j-2]+1)))
                    sum = sum + nums[j-1];
   
      Arrays.sort(nums);
          for(int x:nums){
            if(sum==x){
                sum++;
            }
          }
        return sum;
        }
       
    
}