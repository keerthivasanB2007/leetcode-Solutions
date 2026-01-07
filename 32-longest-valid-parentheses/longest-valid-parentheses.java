class Solution {
    public int longestValidParentheses(String s1) {
        Stack<Integer> s=new Stack<>();
        s.push(-1);
        int m=0;
            for(int j=0;j<s1.length();j++){
                 char c=s1.charAt(j);
                
                 if(c=='('){
                    s.push(j);
                
                 }
                 else{
                    s.pop();
                    if(s.isEmpty()){
                        s.push(j);
                    }
                    else{
                       m=Math.max(m,j-s.peek());
                    }                     
                 }
            }    

        return m;
    }
}