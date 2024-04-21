package com.org.ds.v1.graph;

import java.util.*;

/**
 * https://www.youtube.com/watch?v=-X6ji6sjxD4&list=PL6Zs6LgrJj3v7n2dyV3V1bxd9ZsuBj0LB&index=8
 */
public class BFSUndirectedGraph {

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

        // Function to perform Breadth First Search traversal of the graph
        void bfs(int s) {
            // Mark all the vertices as not visited (by default set as false)
            boolean visited[] = new boolean[V];

            // Create a queue for BFS
            LinkedList<Integer> queue = new LinkedList<>();

            // Mark the current node as visited and enqueue it
            visited[s] = true;
            queue.add(s);

            while (queue.size() != 0) {
                // Dequeue a vertex from queue and print it
                s = queue.poll();
                System.out.print(s + " ");

                // Get all adjacent vertices of the dequeued vertex s
                // If an adjacent vertex has not been visited, then mark it visited and enqueue it
                Iterator<Integer> i = adj[s].listIterator();
                while (i.hasNext()) {
                    int n = i.next();
                    if (!visited[n]) {
                        visited[n] = true;
                        queue.add(n);
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

        // Print BFS traversal starting from vertex 2
        System.out.println("BFS traversal starting from vertex 2:");
        graph.bfs(2);
    }
}
