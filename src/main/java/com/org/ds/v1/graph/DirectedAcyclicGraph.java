package com.org.ds.v1.graph;

import java.util.*;

public class DirectedAcyclicGraph {

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

        // Function to add an edge from vertex v to vertex w
        void addEdge(int v, int w) {
            adj[v].add(w);
        }

        // Function to perform Depth First Search traversal of the graph
        void DFS(int v, boolean visited[]) {
            // Mark the current node as visited
            visited[v] = true;

            // Recur for all the vertices adjacent to this vertex
            Iterator<Integer> i = adj[v].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    DFS(n, visited);
                }
            }
        }

        // Function to check if the graph has cycles (uses DFS)
        boolean hasCycle() {
            boolean visited[] = new boolean[V];
            boolean recursionStack[] = new boolean[V];

            // Call the recursive helper function to detect cycles
            for (int i = 0; i < V; i++) {
                if (DFSUtil(i, visited, recursionStack)) {
                    return true;
                }
            }

            return false;
        }

        boolean DFSUtil(int v, boolean visited[], boolean recursionStack[]) {
            if (!visited[v]) {
                visited[v] = true;
                recursionStack[v] = true;

                // Recur for all the vertices adjacent to this vertex
                Iterator<Integer> i = adj[v].listIterator();
                while (i.hasNext()) {
                    int n = i.next();
                    if (!visited[n] && DFSUtil(n, visited, recursionStack)) {
                        return true;
                    } else if (recursionStack[n]) {
                        return true;
                    }
                }
            }

            recursionStack[v] = false; // Remove the vertex from recursion stack
            return false;
        }
    }

    public static void main(String args[]) {
        // Create a graph with 6 vertices
        Graph graph = new Graph(6);

        // Add edges to the graph
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(4, 5);
        graph.addEdge(5, 3); // introducing a cycle

        // Check if the graph has cycles
        boolean hasCycle = graph.hasCycle();
        System.out.println("Graph has cycle: " + hasCycle);
    }
}
