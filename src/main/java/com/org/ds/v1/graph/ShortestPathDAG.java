package com.org.ds.v1.graph;

import java.util.*;

public class ShortestPathDAG {

    static class Graph {
        private int V; // Number of vertices
        private List<List<Edge>> adj; // Adjacency lists

        // Edge class to represent weighted edges
        static class Edge {
            int dest;
            int weight;

            Edge(int d, int w) {
                dest = d;
                weight = w;
            }
        }

        // Constructor
        Graph(int v) {
            V = v;
            adj = new ArrayList<>(v);
            for (int i = 0; i < v; ++i)
                adj.add(new ArrayList<>());
        }

        // Function to add a weighted edge between vertices v and w
        void addEdge(int v, int w, int weight) {
            adj.get(v).add(new Edge(w, weight));
        }

        // Function to perform Topological Sort using DFS
        void topologicalSortUtil(int v, boolean visited[], Stack<Integer> stack) {
            visited[v] = true;
            for (Edge neighbor : adj.get(v)) {
                if (!visited[neighbor.dest]) {
                    topologicalSortUtil(neighbor.dest, visited, stack);
                }
            }
            stack.push(v);
        }

        // Function to find shortest paths from source vertex to all other vertices in a DAG
        List<Integer> shortestPath(int source) {
            Stack<Integer> stack = new Stack<>();
            int[] dist = new int[V];
            Arrays.fill(dist, Integer.MAX_VALUE);
            dist[source] = 0;

            boolean[] visited = new boolean[V];
            for (int i = 0; i < V; i++) {
                if (!visited[i]) {
                    topologicalSortUtil(i, visited, stack);
                }
            }

            while (!stack.isEmpty()) {
                int u = stack.pop();
                if (dist[u] != Integer.MAX_VALUE) {
                    for (Edge neighbor : adj.get(u)) {
                        if (dist[u] + neighbor.weight < dist[neighbor.dest]) {
                            dist[neighbor.dest] = dist[u] + neighbor.weight;
                        }
                    }
                }
            }

            List<Integer> shortestPaths = new ArrayList<>();
            for (int d : dist) {
                shortestPaths.add(d);
            }
            return shortestPaths;
        }
    }

    public static void main(String args[]) {
        // Create a graph with 6 vertices
        Graph graph = new Graph(6);

        // Add weighted edges to the graph
        graph.addEdge(0, 1, 5);
        graph.addEdge(0, 2, 3);
        graph.addEdge(1, 3, 6);
        graph.addEdge(1, 2, 2);
        graph.addEdge(2, 4, 4);
        graph.addEdge(2, 5, 2);
        graph.addEdge(2, 3, 7);
        graph.addEdge(3, 4, -1);
        graph.addEdge(4, 5, -2);

        // Find the shortest paths from vertex 0 to all other vertices
        List<Integer> shortestPaths = graph.shortestPath(0);
        System.out.println("Shortest paths from vertex 0 to all other vertices: " + shortestPaths);
    }
}
