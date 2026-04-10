// Dijkstra's Algorithm for Single Source Shortest Path
import java.util.*;
class pair{
    int node,dist;
    pair(int n,int d){
        node = n;
        dist = d;
    }
}

public class Dijkstra{
    public static void main(String[] args){
        int V = 4;
        List<List<pair>> graph = new ArrayList<>();

        for(int i = 0;i<V;i++){
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(new pair(1,4));
        graph.get(0).add(new pair(2,1));
        graph.get(0).add(new pair(3,2));
        graph.get(0).add(new pair(3,3));

        int[] dist = new int[V];
        Arrays.fill(dist,Integer.MAX_VALUE);

        PriorityQueue<pair> pq = new PriorityQueue<>((a,b)->a.dist-b.dist);
        dist[0]=0;
        pq.add(new pair(0,0));

        while(!pq.isEmpty()){
            pair curr = pq.poll();
            for(pair nei : graph.get(curr.node)){
                if(curr.dist + nei.dist < dist[nei.node]){
                    dist[nei.node] = curr.dist+nei.dist;
                    pq.add(new pair(nei.node,dist[nei.node]));
                }
            }
        }
        System.out.println(Arrays.toString(dist));
    }
}