class Solution {
    public String longestCommonPrefix(String[] strs) {
        String r="";
        int i=0,j=1;
        boolean b=true;
        while(i<strs[0].length()){
            while(j<strs.length){
                if(i<strs[j].length() && strs[0].charAt(i)==strs[j].charAt(i)){
                     
                     j++;
                }
                else{
                    b=false;
                     break;
                  
                }
            }
            if(b){
                r=r+Character.toString(strs[0].charAt(i));
                b=true;
                 i++;j=1;
            }
            else 
            break;
           
        }
        return r;
     
    }
}