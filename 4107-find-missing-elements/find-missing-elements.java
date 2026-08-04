class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
    
        List<Integer> t = new ArrayList<>();
        
        for(int i=0;i+1 <nums.length;i++){
            int dif = nums[i+1]-nums[i];
         
            if(dif>1){
           
                while(dif>1){
              
                    t.add(nums[i]+(--dif));
                    
                }
            }
        }
        Collections.sort(t);
        return t;
    }
}