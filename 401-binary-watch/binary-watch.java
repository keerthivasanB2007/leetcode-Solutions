class Solution {
    public List<String> readBinaryWatch(int n) {
        List<String> r=new ArrayList<>();
            if(n==0){
                 r.add("0:00");
        return r;
           }
    if(n>8)
        return r;
    Map<Integer, List<String>> minuteMap = new HashMap<>();

for (int m = 0; m <= 59; m++) {

    int bits = Integer.bitCount(m);

    minuteMap.putIfAbsent(bits, new ArrayList<>());

    // format minute to 2 digits
    String minute = String.format("%02d", m);

    minuteMap.get(bits).add(minute);
}
Map<Integer, List<Integer>> hourMap = new HashMap<>();

for (int h = 0; h <= 11; h++) {

    int bits = Integer.bitCount(h);

    hourMap.putIfAbsent(bits, new ArrayList<>());
    hourMap.get(bits).add(h);
}
      for(int i=0;i<=n;i++){
        if(i>=4 )
           break;
        if((n-i)>=6)
          continue;
        
        List<Integer> x=hourMap.get(i);
         List<String> y=minuteMap.get(n-i);
        
         for(int k=0;k<x.size();k++){
            for(int h=0;h<y.size();h++){
                r.add(x.get(k) +":"+y.get(h) );
            }
         }

            
        }
         return r;
      }
     
    }
