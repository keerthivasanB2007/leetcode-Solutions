class Solution {
    public boolean isPalindrome(String s) {
      /*  String r="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(((c>='a' && c<='z') || (c<='Z' && c>='A')) || (c>='0' && c<='9')){
                
                c=Character.toLowerCase(c);
               
                r=r+c;
            }
        }
      
       int i=0,j=r.length()-1;
       while(i<j){
        if(r.charAt(i)!=r.charAt(j))
            return false;
         i++;
         j--;
       }
        return true;*/
         int i=0;
         int j=s.length()-1;
        
       while(i<j){
         boolean notchange=true;
         char c=s.charAt(i);
         char x=s.charAt(j);
        if(!(((c>='a' && c<='z') || (c<='Z' && c>='A')) || (c>='0' && c<='9'))){
               i++;
               notchange=false;
        }
        if(!(((x>='a' && x<='z') || (x<='Z' && x>='A')) || (x>='0' && x<='9'))){
            j--;
            notchange=false;
        }

        if( notchange && !(Character.toString(x).equalsIgnoreCase(Character.toString(c)))){
            return false;
        }
        if(notchange){
            i++;
            j--;
        }
       }
       return true;
        }
    }
