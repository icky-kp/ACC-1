import java.util.*;

public class Strobborno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String num = sc.nextLine();
        if (isStrobogrammatic(num)) {
            System.out.println(num + " is a strobogrammatic number");
        } else {
            System.out.println(num + " is not a strobogrammatic number");
        }
        sc.close();
    }

    public static boolean isStrobogrammatic(String num) {
        Map<Character, Character> strobogrammaticDictonary = new HashMap<>();
        strobogrammaticDictonary.put('0', '0');
        strobogrammaticDictonary.put('1', '1');
        strobogrammaticDictonary.put('6', '9');
        strobogrammaticDictonary.put('8', '8');
        strobogrammaticDictonary.put('9', '6');
        int n = num.length();
        for (int i = 0, j = (n - 1); i <= j; i++, j--) {
            char digit_left = num.charAt(i);
            char digit_right = num.charAt(j);
            char mapping = strobogrammaticDictonary.getOrDefault(digit_left, '-');
            if (mapping == '-') {
                return false;
            }
            if (mapping != digit_right) {
                return false;
            }
        }
        return true;
    }
}
