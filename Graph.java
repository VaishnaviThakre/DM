import java.util.*;

class Graph {
    private int V;
    private List<Integer>[] adj;

    Graph(int v) {
        V = v;
        adj = new List[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new ArrayList<>();
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
        adj[w].add(v);
    }

    void greedyColoring() {
        int[] result = new int[V];
        Arrays.fill(result, -1);
        result[0] = 0;

        boolean[] available = new boolean[V];
        Arrays.fill(available, true);

        for (int u = 1; u < V; u++) {
            for (int i : adj[u])
                available[result[i]] = false;

            int cr;
            for (cr = 0; cr < V; cr++) {
                if (available[cr])
                    break;
            }

            result[u] = cr;
            Arrays.fill(available, true);
        }

        for (int u = 0; u < V; u++)
            System.out.printf("Vertex %d ---> Color %d%n", u, result[u]);
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of vertices: ");
        int V = scanner.nextInt();

        Graph graph = new Graph(V);

        System.out.print("Enter the number of edges: ");
        int E = scanner.nextInt();

        System.out.println("Enter the edges (vertex1 vertex2):");
        for (int i = 0; i < E; i++) {
            int v = scanner.nextInt();
            int w = scanner.nextInt();

            if (v >= 0 && v < V && w >= 0 && w < V) {
                graph.addEdge(v, w);
            } else {
                System.out.println("Invalid edge. Please enter valid vertex values.");
                i--; // Decrement i to repeat the current iteration and ask for valid input again.
            }
        }

        System.out.println("Graph Coloring:");
        graph.greedyColoring();

        scanner.close();
    }
}
