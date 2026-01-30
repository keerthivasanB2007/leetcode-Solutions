class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> m=new HashMap<>();
        Set<Character> j=new HashSet<>();
        for(int i=0;i<s.length();i++){
            Character c=s.charAt(i);
            if(!j.contains(c))
               {
                m.put(c,i);
                j.add(c);
               }
            else{
                m.remove(c);
            }
            
        }
        System.out.println("j="+j);
        Set<Character> v=new HashSet<>(m.keySet());
        int mi=s.length()+1;
       for(Character g:v){
        if(m.get(g) < mi)
           mi=m.get(g);
       }
       System.out.println(m);
       if(mi==s.length()+1)
         return -1;
        return mi;
    }
}