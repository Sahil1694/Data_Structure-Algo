package Graphs;
import java.util.*;

public class cycle {
    static class Edge{
        int src;
        int des;
        Edge(int src , int des){
            this.src = src;
            this.des = des;

        }
    }
    public static boolean detectCycle(ArrayList<Edge>[] graph){
        boolean vis[] = new boolean[graph.length];
        for(int i = 0 ; i < graph.length ; i++){
            if(!vis[i]){
                if( detectCycleUtil(graph , vis , i , -1)){
                    return true;
                }
               
            }
        }
      return false;
    }
    public static boolean detectCycleUtil(ArrayList<Edge>[] graph , boolean vis[] ,int curr , int parent){
            vis[curr] = true;

            for(int i = 0 ; i < graph[curr].size();i++){
                Edge e = graph[curr].get(i);
                //case 3;
                if(!vis[e.des] ){
                    if( detectCycleUtil(graph, vis, e.des, curr)){
                        return true;

                    }
                }
                else if(vis[e.des] && e.des != parent){
                    return true;
                }
            }
            return false;

    }
    static void createGraph(ArrayList<Edge> graph[]){

        for(int i = 0; i< graph.length; i++){
               graph[i] = new ArrayList<>();
           }
   
           //0 vertex
           graph[0].add(new Edge(0, 2));
           graph[0].add(new Edge(0, 3));
           graph[0].add(new Edge(0, 1));


   
   
           // 1 vertex
           graph[1].add(new Edge(1, 0));
           graph[1].add(new Edge(1, 2));
          
   
           //2 vertex
           graph[2].add(new Edge(2, 0));
           graph[2].add(new Edge(2, 1));
          
   
           // 3 vertex
   
           graph[3].add(new Edge(3,0));
           graph[3].add(new Edge(3, 4 )); 
    
           
           //4 Vertex
            graph[4].add(new Edge(4, 3));
           
   
   
       }

    @SuppressWarnings({ "unchecked", "unused" })
    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge>graph[] = new ArrayList[V];
        createGraph(graph);
        System.out.println(detectCycle(graph));
        
        
    }
    
}
