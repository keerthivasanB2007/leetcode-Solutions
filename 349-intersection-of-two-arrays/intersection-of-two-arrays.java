class Solution {
      int binarysearch(int n[],int key,int i,int j){
    
           if(i>j)
              return -1;
            int mid=(j+i)/2;
            if(n[mid]==key)
               return key;
            else if(n[mid]>key)
               return binarysearch(n,key,i,mid-1);
            else
               return binarysearch(n,key,mid+1,j);
      }
    public int[] intersection(int[] nums1, int[] nums2) {
  
                 Arrays.sort(nums1);
                 Set<Integer> s=new HashSet<>();
                 for(int i=0;i<nums2.length;i++){
                       int m= binarysearch(nums1,nums2[i],0,nums1.length-1);
                       if(m!=-1){
                          s.add(m);
                       }
                 }
                 System.out.println(s);
                int k=0;
                 int a[]=new int[s.size()];
                 for(Integer t: s)
                   {
                     a[k]=t;
                     k++;
                   }
                 return a;
                 
    }
}