// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.HashMap;
class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> m=new HashMap<>();
        m.put('I',1);
        m.put('V',5);
        m.put('X',10);
        m.put('L',50);
        m.put('C',100);
        m.put('D',500);
        m.put('M',1000);
        int r=0;
        for(int i=0;i<s.length();){
            int x=m.get(s.charAt(i));
            int y;
            if(i+1<s.length())
             y=m.get(s.charAt(i+1));
            else
             y=0;
           
            if(x>=y){
             r=r+x;
            
             i++;
            }
            else{
                r=r+y-x;
                i=i+2;
            }
            
        }
        return r;
    }
}