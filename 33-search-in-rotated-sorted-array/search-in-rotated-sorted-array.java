class Solution {
    public int search(int[] nums, int target) {
       
         int low=0;
        int l=nums.length-1;
        int high=l;
        System.out.println(high);
        int x=0,y=0;
        int result=0;
        while(low<high)
        {
            int mid=(int)Math.ceil((low+high)/2.0);
               if(mid-1 < 0)
                 {
                    x=l;
                if(mid+1 == l+1)
                     y=l;
                 }
                 else if(mid+1 == l+1){
                    y=0;
                    if(mid-1 < 0 ){
                        x=0;
                    }
                 }
                 else{
                    x=mid-1;
                    y=mid+1;
                 }

                 if(nums[mid]==target){
                     System.out.println("yes="+mid);
                    result=mid;
                    break;
                 }
          
                  int dl=0,dr=0;
            if(Math.abs(nums[x]-target) < Math.abs(nums[low]-target))
                   dl=Math.abs(nums[x]-target);
            else
               dl=Math.abs(nums[low]-target);

      if(Math.abs(nums[y]-target) < Math.abs(nums[high]-target))
                   dr=Math.abs(nums[y]-target);
            else
               dr=Math.abs(nums[high]-target);
                   
            int m=dl<dr?0:1;
             
            if(m==0){
                System.out.println("left");
           
                high=mid-1;
            }
            else{
                System.out.println("right");
                      low=mid+1;  
            }
        
           System.out.println("low="+low);
                System.out.println("high="+high);
                if(high==low)
                {
                    if(nums[low]==target){
                    result=low;
                    break;
                    }
                    else{
                        result=-1;
                        break;
                    }
                }
                
        }

    if(result!=-1 && nums[result]==target)
        return result;
        return -1;
    
    }
}