class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l=nums1.length + nums2.length;
          int []result=new int[nums1.length + nums2.length];
          int i=0,j=0,k=0;
          while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                result[k]=nums1[i];
                i++;
                k++;
            }
            else{
                result[k]=nums2[j];
                j++;
                k++;
            }
          }
          while(i<nums1.length){
            result[k]=nums1[i];
                i++;
                k++;
          }
          while(j<nums2.length){
            result[k]=nums2[j];
                j++;
                k++;
          }
           int f=(int)Math.ceil((double)l/2);
          if(l%2!=0){
                    return result[f-1];  
          }
          else{

            
             return (double)((result[f-1]+result[f])/2.0);
          }
       
    }
}