import java.util.Arrays;

class Solution {
    public long findKthSmallest(int[] coins, int k) {
        // Sort coins to find the minimum element easily and optimize PIE
        Arrays.sort(coins);
        
        // Binary search range boundaries
        long low = 1;
        long high = (long) coins[0] * k;
        long ans = high;

        while (low <= high) {
            long mid = low + (high - low) / 2;

            if (countMultiples(mid, coins) >= k) {
                ans = mid;         // mid could be our answer
                high = mid - 1;    // Try to find a smaller valid value
            } else {
                low = mid + 1;     // Increase the lower bound
            }
        }
        return ans;
    }

    // Counts how many distinct multiples of coins exist <= mid using PIE
    private long countMultiples(long mid, int[] coins) {
        long count = 0;
        int n = coins.length;
        int totalSubsets = 1 << n; // 2^n subsets

        // Iterate through all non-empty subsets
        for (int i = 1; i < totalSubsets; i++) {
            long lcmVal = 1;
            int bitsCount = 0;
            boolean overflow = false;

            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    bitsCount++;
                    lcmVal = lcm(lcmVal, coins[j]);
                    // Handle potential overflow if LCM exceeds mid
                    if (lcmVal > mid) {
                        overflow = true;
                        break;
                    }
                }
            }

            if (overflow) continue;

            // Inclusion-Exclusion logic
            if (bitsCount % 2 == 1) {
                count += mid / lcmVal;  // Add odd-sized subsets
            } else {
                count -= mid / lcmVal;  // Subtract even-sized subsets
            }
        }
        return count;
    }

    // Helper method to compute GCD
    private long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Helper method to compute LCM
    private long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
    }
}
