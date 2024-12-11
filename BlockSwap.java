public class BlockSwap {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = { 1, 2, 3, 4, 5 };
        int k = 2;
        rotatetoleft(arr, n, k);
        System.out.println("After rotating the elements to left");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void rotatetoleft(int[] arr, int n, int k) {
        if (n == 0) {
            return;
        }
        k = k % n; // k is not 0 or n or greater than n
        if (k == 0) {
            return;
        }
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }
        for (int i = 0; i < n - k; i++) {
            arr[i] = arr[i + k];
        }
        for (int i = 0; i < k; i++) {
            arr[n - k + i] = temp[i];
        }
    }
}
