class Solution {

    public void mergeSort(int[] nums,int low,int high){
        if(low>=high)
            return ;
        int mid = (low + high)/2;
        mergeSort(nums,low,mid);
        mergeSort(nums,mid+1,high);
        merge(nums,low,mid,high);
    }
    public void merge(int[] nums,int low, int mid, int high){
        int[] arr = new int[high - low + 1];
        int k = 0;
        int i = low;
        int j = mid+1;
        while(i<=mid && j<=high){
            if(nums[i]<nums[j]){
                arr[k++]=nums[i++];
            }
            else{
                arr[k++]=nums[j++];
            }
        }
        while(i<=mid){
            arr[k++]=nums[i++];
        }
        while(j<=high){
            arr[k++]=nums[j++];
        }
        for(int m =0;m<arr.length;m++){
            nums[low + m]=arr[m];
        }
    }
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
}