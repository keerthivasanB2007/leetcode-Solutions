import java.util.Arrays;
import java.math.BigInteger;

class Solution {

    public String smallestPalindrome(String s, int k) {
        int[] freq = new int[26];
        for (char c : s.toCharArray())
            freq[c - 'a']++;

        int[] half = new int[26];
        char middle = 0;
        int len = 0;
        int oddCount = 0;

        for (int i = 0; i < 26; i++) {
            half[i] = freq[i] / 2;
            len += half[i];

            if (freq[i] % 2 == 1) {
                oddCount++;
                middle = (char) ('a' + i);
            }
        }

        // A valid palindrome can have at most one odd-frequency character
        if (oddCount > 1) {
            return "";
        }

        // 1. Precompute small factorials dynamically for the denominator
        BigInteger[] fact = new BigInteger[len + 1];
        fact[0] = BigInteger.ONE;
        for (int i = 1; i <= len; i++) {
            fact[i] = fact[i - 1].multiply(BigInteger.valueOf(i));
        }

        // 2. Compute the INITIAL total ways for the full half-string
        BigInteger totalWays = fact[len];
        for (int x : half) {
            if (x > 1) {
                totalWays = totalWays.divide(fact[x]);
            }
        }

        // Quick check: If total combinations are fewer than k, it's impossible
        BigInteger currentK = BigInteger.valueOf(k);
        if (totalWays.compareTo(currentK) < 0) {
            return "";
        }

        StringBuilder left = new StringBuilder();
        int remainingLen = len;

        // 3. Build the string step-by-step using O(1) state transitions
        for (int pos = 0; pos < len; pos++) {
            boolean found = false;

            for (int ch = 0; ch < 26; ch++) {
                if (half[ch] == 0)
                    continue;

                // Mathematical shortcut: Ways if we choose 'ch' at the current position
                // Formula: current_total_ways * half[ch] / remainingLen
                BigInteger cnt = totalWays
                        .multiply(BigInteger.valueOf(half[ch]))
                        .divide(BigInteger.valueOf(remainingLen));

                if (cnt.compareTo(currentK) >= 0) {
                    left.append((char) ('a' + ch));
                    
                    // Permutation state rolls over to the chosen branch configuration
                    totalWays = cnt; 
                    half[ch]--;
                    found = true;
                    break;
                }

                currentK = currentK.subtract(cnt);
            }

            if (!found)
                return "";

            remainingLen--;
        }

        // 4. Assemble the final mirrored palindrome string
        StringBuilder ans = new StringBuilder();
        ans.append(left);

        if (middle != 0)
            ans.append(middle);

        ans.append(new StringBuilder(left).reverse());

        return ans.toString();
    }
}
