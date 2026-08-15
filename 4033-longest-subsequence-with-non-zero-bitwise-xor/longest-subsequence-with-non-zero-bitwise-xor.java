class Solution {
    public int longestSubsequence(int[] nums) {
        if((nums.length == 2) && (nums[0]^nums[1])==0){
                return 1;
        }
                System.out.println(nums.length);
        int x = nums[0];
        int z=0;
        for(int i=1;i<nums.length;i++){
            x=x^nums[i];
            if(x==0)
              z++;
           
        }
        System.out.println("z="+z);
        if(x!=0)
           return nums.length;
        if(z==(nums.length-1))
          return 0;
        if(x==0)
          return nums.length-1;
          System.out.println(nums.length);
        List<Integer> s = new ArrayList<>();
        int i=1;
        int xor = nums[0];
        s.add(xor);
        int max=0;
        while(i<nums.length){
        
                int temp = (xor ^ nums[i]);
             
                if((temp)!=0){
                    s.add(nums[i]);
               
                    xor=temp;
                    
                    i++;
                }
                else{
                    s.clear();
               
                    s.add(nums[i]);
                    xor=nums[i];
                    i++;
              
                }
                max= Math.max(s.size(),max);
            
         }

           return max;
    }
}