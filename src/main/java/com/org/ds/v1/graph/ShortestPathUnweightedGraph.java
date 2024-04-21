import java.util.*;

public class ShortestPathUnweightedGraph {

    static class Graph {
        private int V; // Number of vertices
        private LinkedList<Integer>[] adj; // Adjacency lists

        // Constructor
        Graph(int v) {
            V = v;
            adj = new LinkedList[v];
            for (int i = 0; i < v; ++i)
                adj[i] = new LinkedList();
        }

        // Function to add an edge between vertices v and w
        void addEdge(int v, int w) {
            adj[v].add(w);
            adj[w].add(v); // For undirected graph
        }

        // Function to find the shortest path from source to destination using BFS
        List<Integer> shortestPath(int source, int destination) {
            boolean[] visited = new boolean[V];
            int[] parent = new int[V];

            Queue<Integer> queue = new LinkedList<>();
            queue.add(source);
            visited[source] = true;
            parent[source] = -1;

            while (!queue.isEmpty()) {
                int current = queue.poll();
                if (current == destination) {
                    break;
                }
                for (int neighbor : adj[current]) {
                    if (!visited[neighbor]) {
                        visited[neighbor] = true;
                        queue.add(neighbor);
                        parent[neighbor] = current;
                    }
                }
            }

            List<Integer> path = new ArrayList<>();
            int current = destination;
            while (current != -1) {
                path.add(current);
                current = parent[current];
            }
            Collections.reverse(path);

            return path;
        }
    }

    public static void main(String args[]) {
        // Create a graph with 5 vertices
        Graph graph = new Graph(5);

        // Add edges to the graph
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        // Find the shortest path from vertex 0 to vertex 3
        List<Integer> shortestPath = graph.shortestPath(0, 3);
        System.out.println("Shortest path from vertex 0 to vertex 3: " + shortestPath);
    }
}
