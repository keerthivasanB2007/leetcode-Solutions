class Solution {
    public int repeatedNTimes(int[] nums) {
         HashMap<Integer,Integer> m=new HashMap<>();
         int r=0;
        for(int n:nums){
             if(m.containsKey(n)){
                   int k=m.get(n);
                   if(2*(k+1) == nums.length)
                        {
                            r=n;
                            break;
                        }
                   else 
                       m.put(n,k+1);
             }
             else
                m.put(n,1);
        }
        return r;
    }
}