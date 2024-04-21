package com.org.ds.v1.graph;

import java.util.*;

/**
 * https://www.youtube.com/watch?v=WxM-EENBY-w&list=PL6Zs6LgrJj3v7n2dyV3V1bxd9ZsuBj0LB&index=10
 */
public class IterativeDFSUndirectedGraph {

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
            adj[v].add(w); // Add w to v's list
            adj[w].add(v); // Add v to w's list (for undirected graph)
        }

        // Function to perform Iterative Depth First Search traversal of the graph
        void dfs(int s) {
            // Mark all the vertices as not visited (by default set as false)
            boolean visited[] = new boolean[V];

            // Create a stack for DFS
            Stack<Integer> stack = new Stack<>();

            // Mark the current node as visited and push it to the stack
            visited[s] = true;
            stack.push(s);

            while (!stack.empty()) {
                // Pop a vertex from stack and print it
                s = stack.pop();
                System.out.print(s + " ");

                // Get all adjacent vertices of the popped vertex s
                // If an adjacent vertex has not been visited, then mark it visited and push it to the stack
                Iterator<Integer> i = adj[s].listIterator();
                while (i.hasNext()) {
                    int n = i.next();
                    if (!visited[n]) {
                        visited[n] = true;
                        stack.push(n);
                    }
                }
            }
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

        // Print DFS traversal starting from vertex 2
        System.out.println("DFS traversal starting from vertex 2:");
        graph.dfs(2);
    }
}
