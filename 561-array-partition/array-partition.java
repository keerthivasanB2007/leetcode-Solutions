class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int j = i+1;
        int sum = 0;

        while(j<nums.length){
            System.out.println("i= "+nums[i]+" j="+nums[j]);
            sum = sum + Math.min(nums[i],nums[j]);
            j=j+2;
            i=i+2;
        }
        return sum;
    }
}