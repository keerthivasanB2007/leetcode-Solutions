class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        // Arrays.sort(nums);
    
        // List<Integer> t = new ArrayList<>();
        
        // for(int i=0;i+1 <nums.length;i++){
        //     int dif = nums[i+1]-nums[i];
         
        //     if(dif>1){
           
        //         while(dif>1){
              
        //             t.add(nums[i]+(--dif));
                    
        //         }
        //     }
        // }
        // Collections.sort(t);
        // return t;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        Set<Integer> s = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            if(min>nums[i])
              min=nums[i];
            if(max<nums[i])
                max=nums[i];
            s.add(nums[i]);
        }
   
        List<Integer> t = new ArrayList<>();
        for(int i=min+1;i<max;i++){
            if(!s.contains(i)){
                t.add(i);
            }
        }
        return t;

    }
}