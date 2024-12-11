class Maneuver {
    static int numberOfPaths(int m, int n) {
        // Base case: only one path if either dimension is 1
        if (m == 1 || n == 1) {
            return 1;
        }
        // Recursive case: sum paths by moving down and moving right
        return numberOfPaths(m - 1, n) + numberOfPaths(m, n - 1);
    }

    public static void main(String args[]) {
        System.out.println(numberOfPaths(3, 3)); // Test case
    }
}
