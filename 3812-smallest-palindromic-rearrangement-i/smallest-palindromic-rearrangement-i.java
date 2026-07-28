class Solution {
    public String smallestPalindrome(String s) {
        if (s.length() == 1)
            return s;

        int[] fre = new int[26];

        for (int i = 0; i < s.length(); i++) {
            fre[s.charAt(i) - 'a']++;
        }

        StringBuilder result = new StringBuilder();
        char[] x = new char[1];

        for (int i = 0; i < 26; i++) {

            int v = fre[i] / 2;
            while (v-- > 0) {
                result.append((char) (i + 'a'));
            }

            if (fre[i] % 2 == 1) {
                x[0] = (char) (i + 'a');
            }
        }

        String r = result.toString();
        String r1 = new StringBuilder(r).reverse().toString();

        if (x[0] != '\0')
            return r + x[0] + r1;

        return r + r1;
    }
}