class Manacher {
    static String longestPalindromicSubstring(String s) {
        int n = s.length();
        if (n == 0)
            return "";

        int start = 0, maxLength = 1;

        for (int i = 0; i < n; i++) {
            // Expand around center for odd-length palindrome
            int len1 = expandAroundCenter(s, i, i);
            // Expand around center for even-length palindrome
            int len2 = expandAroundCenter(s, i, i + 1);

            int len = Math.max(len1, len2);

            if (len > maxLength) {
                maxLength = len;
                start = i - (len - 1) / 2; // Calculate start index of the palindrome
            }
        }
        return s.substring(start, start + maxLength);
    }

    static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1; // Return the length of the palindrome
    }

    public static void main(String[] args) {
        String s = "babad";
        System.out.println("Longest Palindromic Substring: " + longestPalindromicSubstring(s));
    }
}
