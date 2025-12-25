class Solution {
    public int lengthOfLastWord(String s) {
        int i=s.length()-1;
        int l=0;
        while(i>=0){
            if(s.charAt(i)==' ' ){
               i--;
               if( l!=0)
                break;
            }
            else{
             l++;
            
             i--;
            }
        }
        return l;
    }
}