public class Combination {
    public static void main(String[] args) {
        int[] numbers = { 9, 12, 19, 61 }; // Input array
        int r = 2; // Size of each combination

        int[] combination = new int[r]; // Temporary array to store current combination
        generateCombinations(numbers, combination, 0, 0, r);
    }

    // Recursive function to generate combinations
    static void generateCombinations(int[] arr, int[] combination, int start, int index, int r) {
        // Base case: if the current combination is of size r, print it
        if (index == r) {
            printCombination(combination);
            return;
        }

        // Iterate through the array and build combinations
        for (int i = start; i < arr.length; i++) {
            combination[index] = arr[i]; // Include current element in the combination
            generateCombinations(arr, combination, i + 1, index + 1, r); // Recur with remaining elements
        }
    }

    // Utility function to print the current combination
    static void printCombination(int[] combination) {
        System.out.print("[");
        for (int i = 0; i < combination.length; i++) {
            System.out.print(combination[i] + (i < combination.length - 1 ? ", " : ""));
        }
        System.out.println("]");
    }
}
