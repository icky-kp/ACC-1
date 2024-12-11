import java.util.Scanner;

public class BinaryPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int x = sc.nextInt();
        System.out.println(Palindrome(x));
        sc.close();
    }

    private static boolean Palindrome(int x) {
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
