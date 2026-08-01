class Solution {
    public int countSegments(String s) {
        if(s.length()==0)
         return 0;
        int i=0;
        int j=i+1;
        int count =0;
        while(j<s.length()){
            if(s.charAt(i)!=' ' && s.charAt(j)==' '){
                    count++;
            }
            i++;
            j++;
        }
        if(s.charAt(i)!=' ')
            count++;
        return count;
        
    }
}