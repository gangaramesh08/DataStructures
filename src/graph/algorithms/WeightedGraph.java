package graph.algorithms;

import java.util.LinkedList;
import java.util.Map;
import java.util.HashMap;

public class WeightedGraph {
    int size;
    int cost;
    int [][] adjacencyMatrix;

    public WeightedGraph(int size){
        this.size = size;
        this.adjacencyMatrix = new int[size][size];
    }

    public void addEdgeAndCost(int v1, int v2, int cost){
        adjacencyMatrix[v1][v2] = cost;
    }
}
