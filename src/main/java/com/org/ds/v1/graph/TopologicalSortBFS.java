package com.org.ds.v1.graph;

import java.util.*;

public class TopologicalSortBFS {

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

        // Function to perform topological sorting using Kahn's algorithm
        List<Integer> topologicalSort() {
            int[] inDegree = new int[V];
            for (List<Integer> neighbors : adj) {
                for (int neighbor : neighbors) {
                    inDegree[neighbor]++;
                }
            }

            Queue<Integer> queue = new LinkedList<>();
            for (int i = 0; i < V; i++) {
                if (inDegree[i] == 0) {
                    queue.add(i);
                }
            }

            List<Integer> result = new ArrayList<>();
            while (!queue.isEmpty()) {
                int u = queue.poll();
                result.add(u);
                for (int neighbor : adj.get(u)) {
                    if (--inDegree[neighbor] == 0) {
                        queue.add(neighbor);
                    }
                }
            }

            if (result.size() != V) {
                System.out.println("Graph has a cycle!");
                return new ArrayList<>();
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
