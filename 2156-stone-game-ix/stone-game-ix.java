class Solution {
    public boolean stoneGameIX(int[] stones) {
        int[] counts = new int[3];
        for (int stone : stones) {
            counts[stone % 3]++;
        }
        
        int count0 = counts[0];
        int count1 = counts[1];
        int count2 = counts[2];
        
        if (count0 % 2 == 0) {
            
            return count1 > 0 && count2 > 0;
        } else {
          
            return Math.abs(count1 - count2) > 2;
        }
    }
}
