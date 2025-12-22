class Solution {
    public int lengthOfLongestSubstring(String s) {
      int []index=new int[256];
      Arrays.fill(index,0);
      int l=0;
      int max=0;
      int i=0;
      while(i<s.length()){
          if(index[s.charAt(i)]==0){
              l++;
           index[s.charAt(i)]=i+1;
           i++;
          }
          else{
              max=max>l?max:l;
              l=0;
              i=index[s.charAt(i)];
              Arrays.fill(index,0);
              
          }
      }
       max=max>l?max:l;
      return max;
     
    }
}
