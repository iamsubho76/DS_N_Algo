package com.org.ds.v1.graph;

import java.util.*;

public class UndirectedGraph {

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
            adj[w].add(v); // Add v to w's list
        }

        // Function to print the adjacency list representation of the graph
        void printGraph() {
            for (int v = 0; v < V; ++v) {
                System.out.println("Adjacency list of vertex " + v);
                System.out.print("head");
                for (Integer neighbor : adj[v]) {
                    System.out.print(" -> " + neighbor);
                }
                System.out.println("\n");
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
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        // Print the adjacency list representation of the graph
        graph.printGraph();
    }
}
