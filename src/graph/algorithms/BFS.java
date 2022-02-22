package graph.algorithms;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

class Graph{
    int value;
    Map<Integer,LinkedList<Integer>> adjacentList;

    public Graph(int value) {
        this.value = value;
        adjacentList = new HashMap<>();
    }

    public void addEdge(Integer i, Integer i1) {
        LinkedList<Integer> list = adjacentList.getOrDefault(i,new LinkedList<>());
        list.add(i1);
        adjacentList.put(i,list);
    }

    public void findBFS(int value) {
        LinkedList<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[4];
        visited[value] = true;
        queue.add(value);
        while (!queue.isEmpty()){
            int a = queue.poll();
            System.out.print(a+" ");
            LinkedList<Integer> list = adjacentList.get(a);
            for(Integer val: list){
                if(!visited[val]){
                    queue.add(val);
                    visited[val]=true;
                }
            }
        }
    }
}

public class BFS {
    public static void main(String[] args) {
        Graph g = new Graph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Breadth First Traversal "+
                "(starting from vertex 2)");

        g.findBFS(2);
    }

}
