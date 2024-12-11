import java.util.Scanner;

public class BinaryPalindromeNext {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Integer : ");
        int a = sc.nextInt();
        boolean found = false;
        while (found == false) {
            if (isPalindrome(a + 1)) {
                found = true;
                System.out.println((a + 1) + " is the next binary palindrome");
            }
            a++;
        }
    }

    private static boolean isPalindrome(int x) {
        // TODO Auto-generated method stub
        String s = Integer.toBinaryString(x);
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
