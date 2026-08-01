class Solution {
    int solve(int l, int r,int[] nums){
        if(l==r)
            return nums[l];
        
        int takeleft = nums[l]-solve(l+1,r,nums);
        int takeright = nums[r]- solve(l,r-1,nums);

        return Math.max(takeleft,takeright);
    }
    public boolean predictTheWinner(int[] nums) {
        return solve(0,nums.length-1,nums)>=0?true:false;
    }
}