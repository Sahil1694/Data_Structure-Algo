package Graphs;
import java.util.*;

import Trie.create;

public class topoSort {
    static class Edge{
        int src;
        int des;
        Edge(int src , int des){
            this.src = src;
            this.des = des;
        }

    }
    public static void topoSort(ArrayList<Edge>g[]){
        boolean vis[] = new boolean[g.length];
        Stack<Integer> s = new Stack<>();
        for(int i = 0 ; i< g.length; i++){
            if(!vis[i]){
                topoSortUtil(g , i , vis , s);
            }
        }
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    public static void topoSortUtil(ArrayList<Edge>g[] , int curr , boolean vis[] , Stack<Integer> s){
        vis[curr]=true;
        for(int i = 0 ; i < g[curr].size() ; i++){
            Edge e = g[curr].get(i);
            if(!vis[curr]){
                topoSortUtil(g, e.des, vis, s);
            }
        }
        s.push(curr);
    }
    static void createGraph(ArrayList<Edge> graph[]){

        for(int i = 0; i< graph.length; i++){
               graph[i] = new ArrayList<>();
           }
   
           //0 vertex
           graph[0].add(new Edge(0, 0));
           
           // 1 vertex
           graph[1].add(new Edge(1, 1));
          
           //2 vertex
           graph[2].add(new Edge(2, 3));
           
           // 3 vertex
           graph[3].add(new Edge(3,1));

           //4 Vertex
            graph[4].add(new Edge(4, 1));
            graph[4].add(new Edge(4, 0));

            //5 Vertex
            graph[5].add(new Edge(5, 0));
            graph[5].add(new Edge(5, 2));
       }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge>g[] = new ArrayList[V];
        createGraph(g);
        topoSort(g);
        
    }
    
}
