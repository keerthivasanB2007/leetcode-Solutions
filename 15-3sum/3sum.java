class Solution {
    int binarysearch(int []nums,int key,int i,int j){
        int left=j+1;
        int right=nums.length-1;

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
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> r=new ArrayList<>();
         int sum=0;
         Arrays.sort(nums);
           for(int i=0;i<nums.length;i++)
          System.out.print(nums[i]+",");
     List<String> c=new ArrayList<>();
    
    
        for(int i=0;i<nums.length -1;i++)
        {
            if (i > 0 && nums[i] == nums[i - 1]) 
            continue;

        for(int j=i+1;j<nums.length;j++){
           if (j > i + 1 && nums[j] == nums[j - 1]) 
           continue;
               sum=nums[i]+nums[j];
               sum=-sum;
              
               int k=binarysearch(nums,sum,i,j);
            
               if(k!=-1 && i!=j && i!=k && j!=k && (nums[i]+nums[j]+nums[k])==0){
                       String t="";
                      
                      int []x={nums[i],nums[j],nums[k]};
                      Arrays.sort(x);
                      t=t+x[0]+x[1]+x[2];
                   
                  
               if(!c.contains(t)){
                r.add(Arrays.asList(nums[i],nums[j],nums[k]));
            
                 c.add(t);
                 t="";
               }
               
               }
        }
            
        }
        return r;
    }
}