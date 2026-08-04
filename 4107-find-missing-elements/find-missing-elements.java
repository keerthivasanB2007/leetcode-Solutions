class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
       // System.out.println(Arrays.toString(nums));
        List<Integer> t = new ArrayList<>();
        
        for(int i=0;i+1 <nums.length;i++){
            int dif = nums[i+1]-nums[i];
           // System.out.println(dif);
            if(dif>1){
            //    System.out.println("in side if");
                while(dif>1){
                    System.out.println(dif);
                    t.add(nums[i]+(--dif));
                    
                }
            }
        }
        Collections.sort(t);
        return t;
    }
}