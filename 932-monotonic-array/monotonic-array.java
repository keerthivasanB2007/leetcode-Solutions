class Solution {
    public boolean isMonotonic(int[] nums) {
        int i=0;
        int j=i+1;
        boolean f = true;
        while(j<=nums.length-1){
           
            if((nums[i]<=nums[j])){
                f = true;
              
                 i++;
                j++;
            }
             else{
                f = false;
                break;
             }
        }
        i=0;
        j=i+1;
        boolean t = true;
         while(j<=nums.length-1){
            
            if((nums[i]>=nums[j])){
                t = true;
                i++;
                j++;
            }
            else{
                t=false;
                break;
            }
        }
       
        return f || t;
        
    }
}