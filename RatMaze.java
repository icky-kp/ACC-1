public class RatMaze {
    private static final int N = 4;

    // Utility function to print the solution matrix
    void printSolution(int[][] solution) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(" " + solution[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Utility function to check if x, y is valid index for N*N maze
    boolean isSafe(int[][] maze, int x, int y) {
        return (x >= 0 && x < N && y >= 0 && y < N && maze[x][y] == 1);
    }

    // Solves the Maze problem using backtracking
    boolean solveMaze(int[][] maze) {
        int[][] solution = new int[N][N];

        if (!solveMazeUtil(maze, 0, 0, solution)) {
            System.out.println("No solution found");
            return false;
        }

        printSolution(solution);
        return true;
    }

    // A recursive utility function to solve Maze problem
    boolean solveMazeUtil(int[][] maze, int x, int y, int[][] solution) {
        // If x, y is the goal, return true
        if (x == N - 1 && y == N - 1 && maze[x][y] == 1) {
            solution[x][y] = 1;
            return true;
        }

        // Check if maze[x][y] is valid
        if (isSafe(maze, x, y)) {
            // Mark x, y as part of the solution path
            solution[x][y] = 1;

            // Move forward in the x direction
            if (solveMazeUtil(maze, x + 1, y, solution)) {
                return true;
            }

            // If moving in x direction doesn't give solution, move down in y direction
            if (solveMazeUtil(maze, x, y + 1, solution)) {
                return true;
            }

            // If none of the above movements work, BACKTRACK: unmark x, y as part of the
            // solution path
            solution[x][y] = 0;
            return false;
        }

        return false;
    }

    public static void main(String[] args) {
        RatMaze ratMaze = new RatMaze();
        int[][] maze = {
                { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 0, 1, 0, 0 },
                { 1, 1, 1, 1 }
        };

        ratMaze.solveMaze(maze);
    }
}
