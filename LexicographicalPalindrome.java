import java.util.Arrays;

public class LexicographicalPalindrome {
    public static String lexicographicalPalindrome(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars); // Sort the characters lexicographically
        int n = chars.length;
        char[] result = new char[n];

        int left = 0, right = n - 1;
        for (int i = 0; i < n; i += 2) {
            // If two consecutive characters are the same, place them as a pair in
            // palindrome
            if (i + 1 < n && chars[i] == chars[i + 1]) {
                result[left++] = chars[i];
                result[right--] = chars[i + 1];
            } else { // If a character has no pair, it goes to the middle if possible
                result[n / 2] = chars[i];
            }
        }

        return new String(result);
    }

    public static void main(String[] args) {
        String input = "malayalam";
        String output = lexicographicalPalindrome(input);
        System.out.println(output);
    }
}