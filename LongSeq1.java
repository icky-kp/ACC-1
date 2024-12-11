public class LongSeq1 {
    public static void main(String[] args) {
        int[] a = { 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 0 };
        int k = 3;
        int result = findMaxConsecutiveOnes(a, k);
        System.out.printf("length of contiguous subarray containing only 1s after replacement = %d\n", result);
    }

    private static int findMaxConsecutiveOnes(int[] a, int k) {
        int maxOnes = 0;
        int numReplacements = 0;
        int windowStart = 0;
        for (int windowEnd = 0; windowEnd < a.length; windowEnd++) {
            if (a[windowEnd] == 0) {
                numReplacements++;
            }
            while (numReplacements > k) {
                if (a[windowStart] == 0) {
                    numReplacements--;
                }
                windowStart++;
            }
            maxOnes = Math.max(maxOnes, windowEnd - windowStart + 1);
        }
        return maxOnes;
    }
}
