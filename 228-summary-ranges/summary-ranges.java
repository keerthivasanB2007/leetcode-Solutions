class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if(nums.length==1){
            result.add(nums[0]+"");
            return result;
        }
        if(nums.length==0)
          return result;

        int i=0,j=1;
        int start = nums[0];
        while(j<nums.length){
            if(nums[j]-nums[i] != 1){
                   int end = nums[i];
                   if(start== end){
                    result.add(""+start);
                   }
                   else{
                    result.add(""+start+"->"+end);
                   }
                   start = nums[i+1];
            }
            i++;
            j++;
           
        }
        if(nums[i]==start)
            result.add(""+start);
        else
             result.add(""+start+"->"+nums[i]);
       
        return result;
    }
}