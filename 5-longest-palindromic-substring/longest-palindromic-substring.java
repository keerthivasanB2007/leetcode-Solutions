class Solution {
    public String longestPalindrome(String s) {
         if (s == null || s.length() == 0)
            return "";
        int start=0,end=0;

        for(int i=0;i<s.length();i++){
            int x1=i,x2=i;
            while(x1>=0 && x2<s.length() && s.charAt(x1)== s.charAt(x2)){
            x1--;
            x2++;
        }
            int l1=x2-x1-1;
        int y1=i,y2=i+1;
            while(y1>=0 && y2<s.length() && s.charAt(y1)== s.charAt(y2)){
            y1--;
            y2++;
        }
            int l2=y2-y1-1;
            int l=l1>l2?l1:l2;
            if(l>(end-start)){
                start=i-((l-1)/2);
                end=i+(l/2);
            }
        }
        return s.substring(start,end+1);
    }
  
}