class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
             return false;
           List<Character> s1=new ArrayList<>();
          List<Character> t1=new ArrayList<>();
          
          for(int i=0;i<s.length();i++){
                t1.add(t.charAt(i)); 
                s1.add(s.charAt(i));
          }
          Collections.sort(s1);
         /* for(int i=0;i<t.length();i++)
              t1.add(t.charAt(i)); */
             Collections.sort(t1);
        return s1.equals(t1);
    }
}