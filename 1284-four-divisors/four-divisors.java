class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum=0,count=0,tsum=0;
        for(int i=0;i<nums.length;i++){
                for(int j=1;j*j<=nums[i];j++){
                    if(nums[i]%j==0){
                       sum=sum+j;
                       count++;
                       if(j!=nums[i]/j){
                        sum=sum+(nums[i]/j);
                        count++;
                       }
                    }
                }
                if(count==4){
                    tsum=tsum+sum;
                }
                count=0;
                sum=0;
        }
        return tsum;
    }
}