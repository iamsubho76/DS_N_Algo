package com.org.ds.v1.graph;

import java.util.*;

/**
 * https://www.youtube.com/watch?v=NWl-LtrWU-o&list=PL6Zs6LgrJj3v7n2dyV3V1bxd9ZsuBj0LB&index=13
 */
public class ConnectedComponentsUndirectedGraph {

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

        // Function to perform Depth First Search traversal of the graph
        void dfsutil(int v, boolean visited[]) {
            // Mark the current node as visited and print it
            visited[v] = true;
            System.out.print(v + " ");

            // Recur for all the vertices adjacent to this vertex
            Iterator<Integer> i = adj[v].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    dfsutil(n, visited);
                }
            }
        }

        // Function to find and print connected components in the graph
        void connectedComponents() {
            // Mark all the vertices as not visited (by default set as false)
            boolean visited[] = new boolean[V];

            for (int v = 0; v < V; ++v) {
                if (!visited[v]) {
                    // Print all reachable vertices from vertex v
                    dfsutil(v, visited);
                    System.out.println();
                }
            }
        }
    }

    public static void main(String args[]) {
        // Create a graph with 5 vertices
        Graph graph = new Graph(7);

        // Add edges to the graph
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(5, 6);

        // Find and print connected components in the graph
        System.out.println("Connected components in the graph:");
        graph.connectedComponents();
    }
}
