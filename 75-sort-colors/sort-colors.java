class Solution {
    int partition(int []n,int i,int j){
        int l=i-1;
        for(int h=i;h<j;h++){
            if(n[h]<=n[j]){
                l++;
                int t=n[h];
                n[h]=n[l];
                n[l]=t;
            }
        }
        int t=n[l+1];
        n[l+1]=n[j];
        n[j]=t;
        return l+1;
    }
    void quicksort(int []n,int low,int high){
        if(low>=high)
           return;
        int p=partition(n,low,high);
        quicksort(n,low,p-1);
        quicksort(n,p+1,high);

    }
    public void sortColors(int[] nums) {
        
        quicksort(nums,0,nums.length-1);
     
    }
}