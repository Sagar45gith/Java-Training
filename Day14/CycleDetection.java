import java.util.*;

public class CycleDetection{
    int V;
    List<List<Integer>> adj;

    CycleDetection(int V){
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

    boolean dfs(int node,int parent, boolean[] visit){
        visit[node] = true;

        for(int neig:adj.get(node)){
            if(!visit[neig]){
                if(dfs(neig,node,visit))
                    return true;
            }
            else if(neig!=parent){
                return true;
            }
        }
        return false;
    }

    boolean hasCycle(){
        boolean[] visited = new boolean[V];

        for(int i = 0; i<V;i++){
            if(!visited[i]){
                if(dfs(i,-1,visited)) return true;
            }
        }
        return false;

    }

    void printGraph(){
        for(int i =0;i<V;i++){
            System.out.println(i+"->"+adj.get(i));
        }
    }
    
    public static void main(String[] args){
        CycleDetection ob = new CycleDetection(7);

        ob.addedge(0,1);
        ob.addedge(1,2);
        ob.addedge(2,0);
        ob.addedge(3,4);
        ob.addedge(4,5);
        ob.addedge(5,6);

        System.out.println(ob.hasCycle()); 
    }
    
}