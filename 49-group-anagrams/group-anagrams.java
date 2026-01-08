class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> r=new ArrayList<>();
    
       HashMap<String,List<String>> s=new HashMap<>();
       for(int i=0;i<strs.length;i++){
        char arr[]=strs[i].toCharArray();
        Arrays.sort(arr);
        String t=new String(arr);
       if(!s.containsKey(t))
                s.put(t,new ArrayList<>());
        s.get(t).add(strs[i]);
        
       }
      Set<String> k=s.keySet();
      for(String l:k){
        r.add(s.get(l));
      }
   
        return r;
    }
}