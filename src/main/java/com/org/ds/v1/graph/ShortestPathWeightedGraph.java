package com.org.ds.v1.graph;

import java.util.*;

public class ShortestPathWeightedGraph {

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
            adj.get(w).add(new Edge(v, weight)); // For undirected graph
        }

        // Function to find the shortest path from source to destination using Dijkstra's algorithm
        List<Integer> shortestPath(int source, int destination) {
            PriorityQueue<Edge> minHeap = new PriorityQueue<>(Comparator.comparingInt(e -> e.weight));
            int[] distances = new int[V];
            Arrays.fill(distances, Integer.MAX_VALUE);
            int[] parents = new int[V];
            Arrays.fill(parents, -1);

            distances[source] = 0;
            minHeap.add(new Edge(source, 0));

            while (!minHeap.isEmpty()) {
                Edge current = minHeap.poll();
                int u = current.dest;
                for (Edge neighbor : adj.get(u)) {
                    int v = neighbor.dest;
                    int weight = neighbor.weight;
                    if (distances[u] != Integer.MAX_VALUE && distances[u] + weight < distances[v]) {
                        distances[v] = distances[u] + weight;
                        parents[v] = u;
                        minHeap.add(new Edge(v, distances[v]));
                    }
                }
            }

            List<Integer> path = new ArrayList<>();
            int current = destination;
            while (current != -1) {
                path.add(current);
                current = parents[current];
            }
            Collections.reverse(path);

            return path;
        }
    }

    public static void main(String args[]) {
        // Create a graph with 5 vertices
        Graph graph = new Graph(5);

        // Add weighted edges to the graph
        graph.addEdge(0, 1, 10);
        graph.addEdge(0, 2, 15);
        graph.addEdge(1, 2, 20);
        graph.addEdge(1, 3, 25);
        graph.addEdge(2, 3, 30);
        graph.addEdge(3, 4, 5);

        // Find the shortest path from vertex 0 to vertex 4
        List<Integer> shortestPath = graph.shortestPath(0, 4);
        System.out.println("Shortest path from vertex 0 to vertex 4: " + shortestPath);
    }
}
