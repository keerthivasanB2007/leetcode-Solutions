class Solution {
    public int singleNumber(int[] nums) {
      Set<Integer> m=new HashSet<>();
       for(int i:nums){
             if(m.contains(i)){
                m.remove(i);
             }
             else{
                m.add(i);
             }
        }
        int r=0;
        for(int x:m)
           r=x;
        return r;

    }
}