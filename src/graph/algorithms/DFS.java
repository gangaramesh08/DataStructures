package graph.algorithms;

import java.util.*;

public class DFS {

    public static void main(String[] args) {
        MyGraph g = new MyGraph(4);
        g.addEdge(1, 2);
        g.addEdge(1,3);
        g.addEdge(2,1);
        g.addEdge(2,4);
        g.addEdge(3,1);
        g.addEdge(4,2);

        /*g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);*/

        System.out.println("Following is Breadth First Traversal "+
                "(starting from vertex 2)");

        g.findDFS(1);
    }
}
class MyGraph{
    int graphSize;
    Map<Integer, LinkedList<Integer>> adjacencylist;

    public MyGraph() {
        this.adjacencylist = new HashMap<>();
    }

    public  MyGraph(int v1) {
        this.graphSize = v1;
        this.adjacencylist = new HashMap<>();
    }

    public void addEdge(int v1, int v2){
        LinkedList<Integer> adjList = adjacencylist.getOrDefault(v1, new LinkedList<>());
        adjList.add(v2);
        adjacencylist.put(v1, adjList);
    }


    public void findDFS(int i) {
        LinkedList<Integer> stack = new LinkedList<>();
        boolean visited[] = new boolean[4];
        stack.push(i);
        while(!stack.isEmpty()) {
            int v = stack.pop();
            if(!visited[v-1]){
                visited[v-1] = true;
                System.out.println(v);
                List<Integer> adjList = adjacencylist.get(v);
                for(Integer a : adjList) {
                    stack.push(a);
                }
            }

        }
    }
}
