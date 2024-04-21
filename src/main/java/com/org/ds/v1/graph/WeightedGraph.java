package com.org.ds.v1.graph;

import java.util.*;

public class WeightedGraph {

    static class Graph {
        private int V; // Number of vertices
        private LinkedList<Edge>[] adj; // Adjacency lists

        // Edge class to represent weighted edges
        class Edge {
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
            adj = new LinkedList[v];
            for (int i = 0; i < v; ++i)
                adj[i] = new LinkedList();
        }

        // Function to add a weighted edge between vertices v and w
        void addEdge(int v, int w, int weight) {
            adj[v].add(new Edge(w, weight));
        }

        // Function to print the adjacency list representation of the graph
        void printGraph() {
            for (int v = 0; v < V; ++v) {
                System.out.println("Adjacency list of vertex " + v);
                for (Edge edge : adj[v]) {
                    System.out.println("-> " + edge.dest + " (weight: " + edge.weight + ")");
                }
                System.out.println();
            }
        }
    }

    public static void main(String args[]) {
        // Create a graph with 4 vertices
        Graph graph = new Graph(4);

        // Add weighted edges to the graph
        graph.addEdge(0, 1, 10);
        graph.addEdge(0, 2, 15);
        graph.addEdge(1, 2, 20);
        graph.addEdge(1, 3, 25);
        graph.addEdge(2, 3, 30);

        // Print the adjacency list representation of the graph
        graph.printGraph();
    }
}
