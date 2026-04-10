import java.util.*;
class Graph{
    public static void main(String[] args){
        int v = 3;
        List<List<Integer>> graph = new ArrayList<>();

        for(int i =0;i<v;i++){
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(1);
        graph.get(1).add(0);
        graph.get(0).add(2);
        graph.get(2).add(0);

        System.out.println(graph);
    }

}