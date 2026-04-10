import java.util.*;

public class AdjacentList{
    int V;
    List<List<Integer>> adj;

    AdjacentList(int V){
        this.V = V;
        adj = new ArrayList<>();
        for(int i = 0 ; i<V;i++){
            adj.add(new ArrayList<>());
        }
    }

    void addedge(int u, int v){
        //undirected graph
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    void bfs(int start){
        boolean[] visited = new boolean[V];
        Queue<Integer> q = new LinkedList<>();

        q.add(start);
        visited[start]=true;

        while(!q.isEmpty()){
            int node = q.poll();
            System.out.print(node+" ");

            for(int neig: adj.get(node)){
                if(!visited[neig]){
                    visited[neig]=true;
                    q.add(neig);
                }
            }
        }
    }

    void dfs(int node, boolean[] visit){
        visit[node] = true;
        System.out.print(node+" ");

        for(int neig:adj.get(node)){
            if(!visit[neig]){
                dfs(neig,visit);
            }
        }
    }

    void printGraph(){
        for(int i =0;i<V;i++){
            System.out.println(i+"->"+adj.get(i));
        }
    }
    public static void main(String[] args){
        AdjacentList ob = new AdjacentList(7);

        ob.addedge(0,1);
        ob.addedge(0,3);
        ob.addedge(1,2);
        ob.addedge(0,4);
        ob.addedge(3,4);

        ob.printGraph();

        ob.bfs(0);
        System.out.println(); // To separate BFS and DFS outputs
        
        boolean[] visit = new boolean[7]; // Initialize it here with the same size as your graph
        ob.dfs(0,visit);
    }
}