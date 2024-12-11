
public class SimpleSieve_sum {
    public static void sieve(int n) {
        // intitially array is false, make it true.
        boolean prime[] = new boolean[n + 1];
        for (int i = 0; i <= n; i++) {
            prime[i] = true;
        }

        for (int p = 2; p * p <= n; p++) {
            if (prime[p] == true) {
                for (int i = p * p; i <= n; i = i + p) {
                    prime[i] = false;
                }
            }
        }

        int sum = 0;
        // printer block
        for (int i = 2; i <= n; i++) {
            if (prime[i] == true) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        sieve(10);
    }
}
