class Solution {
    public String customSortString(String order, String s) {
        Map<Character,Integer> m=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char b=s.charAt(i);
            if(m.containsKey(b)){
                m.put(b,m.get(b)+1);
            }
            else{
                m.put(b,1);
            }
        }
      String r="";
      for(int i=0;i<order.length();i++){
      char o=order.charAt(i);
        while(m.containsKey(o) && m.get(o)>0){
            r=r+o;
            m.put(o,m.get(o)-1);
        }
        m.remove(o);
      }
      System.out.println(m);
      Set<Character> a=m.keySet();
      for(Character l:a)
      {
        int p=m.get(l);
        while(p>0){
              r=r+l;
              p--;
        }
      
      //  m.remove(l);
      }
     
        return r;
    }
}