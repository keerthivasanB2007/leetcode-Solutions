class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
      //  long mat[][] = new long[n][10];
        HashMap<Integer,Set<Integer>> map = new HashMap<>();

        for(int i=0;i<reservedSeats.length;i++){
                int row = reservedSeats[i][0] - 1;
                int col = reservedSeats[i][1] - 1;
                // mat[row][col] = 1;
                if(map.containsKey(row)){
                    map.get(row).add(col);
                }
                else{
                    Set<Integer> s = new HashSet<>();
                    s.add(col);
                    map.put(row,s);
                }
              
        }
      //  System.out.println(map);
         int count = 0;
         boolean flag = true;
        
         for(int i:map.keySet()){
          
            Set<Integer> d = map.get(i);
          //  System.out.println("d="+d);
           
               // (mat[i][1]!=1 && mat[i][2]!=1 && mat[i][3]!=1 && mat[i][4]!=1)
                if(!(d.contains(1) || d.contains(2) || d.contains(3) || d.contains(4)) ){
                    count++;
                         //  System.out.println("2 3 4 5 : ");
                           flag = false;
                }
                if(!(d.contains(5) || d.contains(6) || d.contains(7) || d.contains(8))){
                    count++;
              //  System.out.println("6 7 8 9 : ");
                    flag = false;
                }
            
             if (!(d.contains(3) || d.contains(4) || d.contains(5) || d.contains(6)) && flag){
                    count++;
                   // System.out.println("4 5 6 7 : ");
            }
            flag = true;

         }
         count = count + (n - map.keySet().size())*2;
         //System.out.println(count);
         return count;


    }
}