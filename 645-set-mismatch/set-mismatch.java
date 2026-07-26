class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int x=0;
        int[] temp = new int[nums.length-1];
        int k =0;
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                x=nums[i];
            }
            else{
                temp[k++]=nums[i];
                set.add(nums[i]);
            }
        }
        Arrays.sort(temp);
        int count =1;
       for(int i=0;i<temp.length;i++){
            if(temp[i]==count){
                count++;
            }
            else{
                break;
            }
       }
      
       int[] result={x,count};
       return result;
    }
}