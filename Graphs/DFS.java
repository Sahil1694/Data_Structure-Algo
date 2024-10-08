package Graphs;

import java.util.ArrayList;

public class DFS {
    static class Edge {
        int src;
        int dest;
        int weight;

        public Edge(int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }

    private ArrayList<Edge>[] graph;

    @SuppressWarnings("unchecked")
    public DFS(int V) {
        graph = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }
    }

    public void createGraph() {
        // Your graph initialization code here
    }

    public void dfs() {
        boolean[] visited = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!visited[i]) {
                dfsUtil(i, visited);
            }
        }
    }
    private void dfsUtil(int curr, boolean[] visited) {
        visited[curr] = true;
        System.out.println(curr);

        if (graph[curr] != null) {
            for (Edge e : graph[curr]) {
                if (!visited[e.dest]) {
                    dfsUtil(e.dest, visited);
                }
            }
        }
    }
    public static void main(String[] args) {
        int V = 7;
        DFS dfsGraph = new DFS(V);
        dfsGraph.createGraph();
        dfsGraph.dfs();
    }
}
