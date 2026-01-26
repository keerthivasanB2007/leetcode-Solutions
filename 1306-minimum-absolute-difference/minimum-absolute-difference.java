class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int i=0;
        int j=i+1;
        int mi=Integer.MAX_VALUE;
        Map<Integer,List<List<Integer>>> m=new HashMap<>();
        while(j<arr.length){
            int d=arr[j]-arr[i];
                  List<Integer> l=new ArrayList<>();
                  l.add(arr[i]);
                  l.add(arr[j]);
                 
        if(m.containsKey(d))
                m.get(d).add(l);
        else{
                List<List<Integer>> o= new ArrayList<>();
                 o.add(l);
                 m.put(d,o);
        }
            if(d<mi)
               mi=d;
               i++;
               j++;
        }
        
        return m.get(mi);
    }
}