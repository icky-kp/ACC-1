import java.util.ArrayList;
import java.util.List;

public class IncrementalSieve {
    private List<Integer> primes;
    private int current;

    public IncrementalSieve() {
        primes = new ArrayList<>();
        current = 2;
    }

    public int nextPrime() {
        while (true) {
            boolean isPrime = true;
            for (int prime : primes) {
                if (current % prime == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primes.add(current);
                return current++;
            }
            current++;
        }
    }

    public static void main(String[] args) {
        IncrementalSieve sieve = new IncrementalSieve();
        for (int i = 0; i < 10; i++) {
            System.out.println(sieve.nextPrime());
        }
    }
}