import java.util.Scanner;

public class SwapNibble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int swapnum = 0;
        swapnum = ((num & 0x0F) << 4 | (num & 0xF0) >> 4);
        System.out.println(swapnum);
    }
}
