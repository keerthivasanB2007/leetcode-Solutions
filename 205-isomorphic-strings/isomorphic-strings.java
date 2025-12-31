class Solution {
    public boolean isIsomorphic(String s, String t) {
          HashMap<Character,Character> m=new HashMap<>();
          Set<Character> n=new HashSet<>();
          int sl=s.length()-1;
          int tl=s.length()-1;
          if(sl!=tl)
               return false;
               int i=0,j=0;
         while(i<=sl && j<=tl){
            Character x=s.charAt(i);
            Character y=t.charAt(j);
        
            if(m.containsKey(x) ){
                
                if((m.get(x))!=y)
                    return false;
            }
            else{
              
                m.put(x,y);
                if(n.contains(y))
                  return false;
                n.add(y);
                System.out.println("x="+x);
                System.out.println("y="+y);
            }
              i++;
            j++;
         }
         return true;
    }
}