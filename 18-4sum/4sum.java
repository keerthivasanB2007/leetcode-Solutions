class Solution {
     int binarysearch(int []nums,long key,int left,int right){
      
        while(left<=right){
         int mid=(left+right)/2;
         if(nums[mid]==key){
            
                return mid;
            
         }
         else if(key>nums[mid])
             left=mid+1;
          else
              right=mid-1;
        }
        return -1;
    }
    public List<List<Integer>> fourSum(int[] nums, int target) {
         
         long sum=0;
         Arrays.sort(nums);
      
            Set<List<Integer>> c=new HashSet<>();
    
    
        for(int i=0;i<nums.length -3;i++)
        {
            if(i>0 && nums[i]==nums[i-1])
                  continue;
        
        for(int j=i+1;j<nums.length-2;j++)
            {
                   if(j>i+1 && nums[j]==nums[j-1])
                     continue;
             for(int k=j+1;k<nums.length-1;k++){
                  if(k>j+1 && nums[k]==nums[k-1])
                  continue;
                    sum=(long)target-nums[i]-nums[j]-nums[k];
                    
                     int d=binarysearch(nums,sum,k+1,nums.length-1);
                     if(d!=-1){
                    c.add(Arrays.asList(nums[i],nums[j],nums[k],nums[d]));
                     }
             }
            
               }
               
               }
        
     List<List<Integer>> r=new ArrayList<>(c);
   r.sort((a, b) -> {
    for (int i = 0; i < 4; i++) {
        int cmp = Integer.compare(a.get(i), b.get(i));
        if (cmp != 0)
            return cmp;
    }
    return 0;
});

return r;
   
    }
}