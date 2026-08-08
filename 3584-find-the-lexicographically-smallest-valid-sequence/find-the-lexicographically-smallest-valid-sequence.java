class Solution {
    public int[] validSequence(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        
        // suf[j] stores the largest index i in word1 such that
        // word1[i...] contains word2[j...] as a subsequence.
        int[] suf = new int[m];
        java.util.Arrays.fill(suf, -1);
        
        // Step 1: Precompute suffixes from right to left
        int j = m - 1;
        for (int i = n - 1; i >= 0; i--) {
            if (j >= 0 && word1.charAt(i) == word2.charAt(j)) {
                suf[j] = i;
                j--;
            }
        }
        
        int[] ans = new int[m];
        boolean usedMismatch = false;
        j = 0; // Pointer for word2
        
        // Step 2: Greedily build the smallest sequence from left to right
        for (int i = 0; i < n && j < m; i++) {
            if (word1.charAt(i) == word2.charAt(j)) {
                // Scenario A: Exact match found
                ans[j] = i;
                j++;
            } else if (!usedMismatch && (j == m - 1 || i < suf[j + 1])) {
                // Scenario B: Wildcard mismatch used early to minimize indices
                ans[j] = i;
                usedMismatch = true;
                j++;
            }
        }
        
        // If we matched all characters of word2, return the sequence
        return j == m ? ans : new int[0];
    }
}
