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

minuteMap.put(0, Arrays.asList("00"));

minuteMap.put(1, Arrays.asList(
        "01", "02", "04", "08", "16", "32"
));

minuteMap.put(2, Arrays.asList(
        "03", "05", "06", "09", "10", "12",
        "17", "18", "20", "24",
        "33", "34", "36", "40", "48"
));

minuteMap.put(3, Arrays.asList(
        "07", "11", "13", "14", "19", "21", "22", "25", "26", "28",
        "35", "37", "38", "41", "42", "44",
        "49", "50", "52", "56"
));

minuteMap.put(4, Arrays.asList(
        "15", "23", "27", "29", "30", "39",
        "43", "45", "46", "51", "53", "54",
        "57", "58"
));

minuteMap.put(5, Arrays.asList(
        "31", "47", "55", "59"
));
Map<Integer, List<Integer>> hourMap = new HashMap<>();

hourMap.put(0, Arrays.asList(
        0
));

hourMap.put(1, Arrays.asList(
        1, 2, 4, 8
));

hourMap.put(2, Arrays.asList(
        3, 5, 6, 9, 10
));

hourMap.put(3, Arrays.asList(
        7, 11
));
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
