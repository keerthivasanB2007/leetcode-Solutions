import java.util.Arrays;

class Solution {
    public int[] resultArray(int[] nums) {
        int[] arr1 = new int[nums.length];
        int[] arr2 = new int[nums.length];
        
        // 1. First element always goes to arr1
        arr1[0] = nums[0];
        int k = 1; 
        
        // 2. Second element always goes to arr2
        arr2[0] = nums[1];
        int l = 1; 
        
        // 3. Check EVERY remaining element one by one dynamically
        for (int i = 2; i < nums.length; i++) {
            if (arr1[k - 1] > arr2[l - 1]) {
                arr1[k] = nums[i];
                k++;
            } else {
                arr2[l] = nums[i];
                l++;
            }
        }
        
        // 4. Merge the arrays sequentially
        int[] result = new int[nums.length];
        int idx = 0;
        
        for (int n = 0; n < k; n++) {
            result[idx++] = arr1[n];
        }
        for (int m = 0; m < l; m++) {
            result[idx++] = arr2[m];
        }
        
        return result;
    }
}
