public class SegmentedSieve {
    static void segsieve(int l, int h) {
        boolean prime[] = new boolean[h + 1];
        for (int i = 0; i <= h; i++) {
            prime[i] = true;
        }

        for (int p = 2; p < Math.sqrt(h); p++) {
            int sm = (l / p) * p;
            if (sm < l) {
                sm = sm + p;
            }
            for (int i = sm; i <= h; i = i + p) {
                prime[i] = false;
            }
        }

        for (int i = l; i <= h; i++) {
            if (prime[i] == true) {
                System.out.println(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        segsieve(10, 30);
    }
}
