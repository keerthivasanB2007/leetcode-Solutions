class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        List<Integer> l=new ArrayList<>();
        int m=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                 m++;
            }
           else{
            
            l.add(m);
            m=0;
           }
        }
        l.add(m);
        Collections.sort(l,Collections.reverseOrder());
     
        return l.get(0);
    }
}