class Solution{
    public int majorityElement(int[] nums) {
          int i=0;
          int j=nums.length-1;
          int max=0;
          HashMap<Integer,Integer> count=new HashMap<>();
          if(j==0)
             return nums[0];
          while(i<=j){
            if(count.containsKey(nums[i])){
                count.put(nums[i],count.get(nums[i])+1);
                max=count.get(nums[i])>count.getOrDefault(max,0)?nums[i]:max;
                i++;
            }
            else{
                count.put(nums[i],1);
                 max=count.get(nums[i])>count.getOrDefault(max,0)?nums[i]:max;
                i++;
            }

             if(count.containsKey(nums[j]) ){
                count.put(nums[j],count.get(nums[j])+1);
                  max=count.get(nums[j])>count.getOrDefault(max,0)?nums[j]:max;
                j--;
            }
            else{
                count.put(nums[j],1);
                max=count.get(nums[j])>count.getOrDefault(max,0)?nums[j]:max;
                j--;
            }
          }
           return max;
    }
}