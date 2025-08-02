public class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder merge = new StringBuilder();
     
        int w1 = word1.length(), w2 = word2.length();
        int l;
        if(word1.length() == word2.length())
                   l=word1.length();
        else if(word1.length()>word2.length())
                  l=word1.length();
        else
                l=word2.length();
        int n=0,m=0;
       
        for(int i=0;i<l;i++){
               if(n<w1 && m<w2){
                    merge.append(word1.charAt(n));
                    merge.append(word2.charAt(m));
                    n++;
                    m++;
               }
               else if(w1>=n && m<w2){
                merge.append(word2,m,w2);
                break;
               }
               else{
                merge.append(word1,n,w1);
                break;
               }
                   
               }

        return merge.toString();
    }
}
