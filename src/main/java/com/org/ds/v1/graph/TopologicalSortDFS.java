package com.org.ds.v1.graph;

import java.util.*;

public class TopologicalSortDFS {

    static class Graph {
        private int V; // Number of vertices
        private List<List<Integer>> adj; // Adjacency lists

        // Constructor
        Graph(int v) {
            V = v;
            adj = new ArrayList<>(v);
            for (int i = 0; i < v; ++i)
                adj.add(new ArrayList<>());
        }

        // Function to add an edge between vertices v and w
        void addEdge(int v, int w) {
            adj.get(v).add(w);
        }

        // Function to perform topological sorting using DFS
        void topologicalSortUtil(int v, boolean visited[], Stack<Integer> stack) {
            visited[v] = true;

            // Recur for all the vertices adjacent to this vertex
            for (int neighbor : adj.get(v)) {
                if (!visited[neighbor]) {
                    topologicalSortUtil(neighbor, visited, stack);
                }
            }

            // Push current vertex to stack which stores result
            stack.push(v);
        }

        // Function to perform topological sorting
        List<Integer> topologicalSort() {
            Stack<Integer> stack = new Stack<>();
            boolean visited[] = new boolean[V];

            // Call the recursive helper function to store topological sort starting from all vertices one by one
            for (int i = 0; i < V; i++) {
                if (!visited[i]) {
                    topologicalSortUtil(i, visited, stack);
                }
            }

            // Create a list to store the result
            List<Integer> result = new ArrayList<>();
            while (!stack.isEmpty()) {
                result.add(stack.pop());
            }

            return result;
        }
    }

    public static void main(String args[]) {
        // Create a graph with 6 vertices
        Graph graph = new Graph(6);

        // Add edges to the graph
        graph.addEdge(5, 2);
        graph.addEdge(5, 0);
        graph.addEdge(4, 0);
        graph.addEdge(4, 1);
        graph.addEdge(2, 3);
        graph.addEdge(3, 1);

        // Perform topological sorting
        List<Integer> sortedVertices = graph.topologicalSort();
        System.out.println("Topological sorting of the graph:");
        for (int vertex : sortedVertices) {
            System.out.print(vertex + " ");
        }
    }
}
