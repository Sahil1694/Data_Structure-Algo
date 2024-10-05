import java.util.*;
public class BellmanFord {
    static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int src , int dest , int wt){
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }
    static void createGraph(ArrayList<Edge> graph[]){

        for(int i = 0; i< graph.length; i++){
               graph[i] = new ArrayList<>();
           }
   
           //0 vertex
           graph[0].add(new Edge(0, 2 , 4));
           graph[0].add(new Edge(0, 1 , 2));
           // 1 vertex
           graph[1].add(new Edge(1, 3 ,7));
           graph[1].add(new Edge(1, 2 ,1));
           //2 vertex
           graph[2].add(new Edge(2, 4 , 3));
           // 3 vertex
           graph[3].add(new Edge(3,5 , 1));
           //4 Vertex
            graph[4].add(new Edge(4, 3 , 2));
            graph[4].add(new Edge(4, 5 , 5));
        }

        public static void BellmanFord(ArrayList<Edge> graph[] , int src){
            int dist[] = new int[graph.length];
            for(int i = 0 ; i < graph.length ; i++){
                if(i != src){
                    dist[i] = Integer.MAX_VALUE;
                }
            }
            int V = graph.length;
            for(int i = 0 ; i < V-1 ; i++){
                for(int j = 0 ; j < V ; j++){
                    for(int k = 0 ; k < graph[j].size() ; k++){
                        Edge e = graph[j].get(k);
                        int u = e.src;
                        int v = e.dest;
                        int wt = e.wt;
                        if(dist[u] != Integer.MAX_VALUE &&  dist[u] + wt < dist[v]){
                            dist[v] = dist[u] + wt;
                        }
                    }
                }
            }
            for(int i = 0 ; i < V ; i++){
                System.out.println("Distance of vertex "+i+" from source is "+dist[i]);
            }
        }

        public static void main(String[] args) {
            int V = 6;
            ArrayList<Edge>graph[] = new ArrayList[V];
            createGraph(graph);
            int src = 0;
            BellmanFord(graph , src);
        }

       
    
    
}
