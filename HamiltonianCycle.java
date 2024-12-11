public class HamiltonianCycle {
    private int V;
    private int[] path;
    private int[][] graph;

    public HamiltonianCycle(int[][] graph) {
        this.graph = graph;
        this.V = graph.length;
        this.path = new int[V];
    }

    public boolean isSafe(int v, int pos) {
        // Check if this vertex is an adjacent vertex of the previously added vertex.
        if (graph[path[pos - 1]][v] == 0) {
            return false;
        }

        // Check if the vertex has already been included.
        for (int i = 0; i < pos; i++) {
            if (path[i] == v) {
                return false;
            }
        }

        return true;
    }

    public boolean hamiltonianCycleUtil(int pos) {
        // Base case: If all vertices are included in the path
        if (pos == V) {
            // And if there is an edge from the last included vertex to the first vertex
            return graph[path[pos - 1]][path[0]] == 1;
        }

        // Try different vertices as the next candidate in the Hamiltonian Cycle.
        for (int v = 1; v < V; v++) {
            if (isSafe(v, pos)) {
                path[pos] = v;

                if (hamiltonianCycleUtil(pos + 1)) {
                    return true;
                }

                // Remove current vertex if it doesn't lead to a solution
                path[pos] = -1;
            }
        }

        return false;
    }

    public boolean hamiltonianCycle() {
        path[0] = 0; // Start at the first vertex

        if (!hamiltonianCycleUtil(1)) {
            System.out.println("No Hamiltonian Cycle found");
            return false;
        }

        System.out.println("Hamiltonian Cycle found:");
        for (int i = 0; i < V; i++) {
            System.out.print(path[i] + " ");
        }
        System.out.println(path[0]); // Print the starting vertex again to show the cycle
        return true;
    }

    public static void main(String[] args) {
        int[][] graph = {
                { 0, 1, 0, 1, 0 },
                { 1, 0, 1, 1, 1 },
                { 0, 1, 0, 0, 1 },
                { 1, 1, 0, 0, 1 },
                { 0, 1, 1, 1, 0 }
        };

        HamiltonianCycle hc = new HamiltonianCycle(graph);
        hc.hamiltonianCycle();
    }
}
