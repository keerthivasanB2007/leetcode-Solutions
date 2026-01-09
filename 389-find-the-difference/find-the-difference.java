class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> m=new HashMap<>();

        int i=0;
        while(i<s.length()){
            char c=s.charAt(i);
            if(m.containsKey(c)){
                m.put(c,m.get(c)+1);
            }
            else{
                m.put(c,1);
            }
            i++;
        }
        int j=0;
        char r='r';
        while(j<t.length()){
            char c=t.charAt(j);
            if(m.containsKey(c) && m.get(c)>0){
               m.put(c,m.get(c)-1);
            }
            else{
               r=c;
               break;
            }
            j++;
        }
        return r;
    }
}