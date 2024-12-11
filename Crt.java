import java.util.*;

public class Crt {

    static int CRT(int a[], int m[], int size, int p) {
        int x = 0;
        for (int i = 0; i < size; i++) {
            int M = p / m[i];
            int y = 0;
            for (int j = 1; j < m[i]; j++) {
                if ((M * j) % m[i] == 1) {
                    y = j;
                    break;
                }
            }
            x = x + a[i] * M * y;
        }
        return x;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of congruence relations: ");
        int size = sc.nextInt();
        int a[] = new int[size];
        System.out.println("Enter values of a i.e. remainder: ");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        int m[] = new int[size];

        // X = a(n) (mod m(N))
        int p = 1; // M
        // now you need to multiply m1, m2, m3 to get M
        System.out.println("Enter the values of m (moduli): ");

        for (int i = 0; i < size; i++) {
            m[i] = sc.nextInt();
            p = p * m[i];
        }
        System.out.println("The solution (X) is " + CRT(a, m, size, p));
        sc.close();
    }
}
