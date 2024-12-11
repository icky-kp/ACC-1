import java.util.Scanner;

public class MaxProd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        // Input the array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int prefix = 1; // To calculate product from left to right
        int suffix = 1; // To calculate product from right to left
        int ans = arr[0]; // Initialize with the first element as the initial product

        // Left to right traversal for maximum product
        for (int i = 0; i < n; i++) {
            prefix *= arr[i]; // Calculate running product from left to right
            suffix *= arr[n - i - 1]; // Calculate running product from right to left

            // Update the answer with the maximum of the current prefix, suffix, and ans
            ans = Math.max(ans, Math.max(prefix, suffix));

            // Reset prefix and suffix to 1 if they become zero, as multiplying with zero
            // will reset the product
            if (prefix == 0) {
                prefix = 1;
            }
            if (suffix == 0) {
                suffix = 1;
            }
        }

        // Output the final maximum product
        System.out.println(ans);
        sc.close();
    }
}
