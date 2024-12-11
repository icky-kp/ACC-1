import java.util.Arrays;

public class SelectionSortSteps {
    public static void main(String[] args) {
        int arr[] = { 64, 25, 12, 22, 11 };
        sort(arr);
        System.out.println("Sorted array : ");
        printArray(arr);
    }

    private static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;

            // Print the array after each iteration
            System.out.println("Step " + (i + 1) + ": " + Arrays.toString(arr));
        }
    }

    private static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
