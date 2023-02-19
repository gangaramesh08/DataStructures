package graph.algorithms;

public class TravellingSalesMan {
    public static void main(String args[]) {
        //WeightedGraph weightedGraph = new WeightedGraph(4);
        WeightedGraph weightedGraph = new WeightedGraph(7);
        weightedGraph.addEdgeAndCost(0,1, 12);
        weightedGraph.addEdgeAndCost(0,2, 10);
        weightedGraph.addEdgeAndCost(0,6, 12);
        weightedGraph.addEdgeAndCost(1,0, 12);
        weightedGraph.addEdgeAndCost(1,2, 8);
        weightedGraph.addEdgeAndCost(1,3, 12);
        weightedGraph.addEdgeAndCost(2,0, 10);
        weightedGraph.addEdgeAndCost(2,1, 8);
        weightedGraph.addEdgeAndCost(2,3, 11);
        weightedGraph.addEdgeAndCost(2,4, 3);
        weightedGraph.addEdgeAndCost(2,6, 9);
        weightedGraph.addEdgeAndCost(3,1, 12);
        weightedGraph.addEdgeAndCost(3,2, 11);
        weightedGraph.addEdgeAndCost(3,4, 11);
        weightedGraph.addEdgeAndCost(3,5, 10);
        weightedGraph.addEdgeAndCost(4,2, 3);
        weightedGraph.addEdgeAndCost(4,3, 11);
        weightedGraph.addEdgeAndCost(4,5, 6);
        weightedGraph.addEdgeAndCost(4,6, 7);
        weightedGraph.addEdgeAndCost(5,3, 10);
        weightedGraph.addEdgeAndCost(5,4, 6);
        weightedGraph.addEdgeAndCost(5,6, 9);
        weightedGraph.addEdgeAndCost(6,0, 12);
        weightedGraph.addEdgeAndCost(6,2, 9);
        weightedGraph.addEdgeAndCost(6,4, 7);
        weightedGraph.addEdgeAndCost(6,5, 9);

       /* weightedGraph.addEdgeAndCost(0,1,10);
        weightedGraph.addEdgeAndCost(0,2,15);
        weightedGraph.addEdgeAndCost(0,3,20);
        weightedGraph.addEdgeAndCost(1,0,10);
        weightedGraph.addEdgeAndCost(1,2,35);
        weightedGraph.addEdgeAndCost(1,3,25);
        weightedGraph.addEdgeAndCost(2,0,15);
        weightedGraph.addEdgeAndCost(2,1,35);
        weightedGraph.addEdgeAndCost(2,3,30);
        weightedGraph.addEdgeAndCost(3,0,20);
        weightedGraph.addEdgeAndCost(3,1,25);
        weightedGraph.addEdgeAndCost(3,2,30);*/
        findMinTravelCost(weightedGraph,0);
    }

    private static void findMinTravelCost(WeightedGraph weightedGraph, int start) {
        boolean visited[] = new boolean[weightedGraph.size];
        visited[start]=true;
        int shortest = Integer.MAX_VALUE;

        shortest = findShortest(weightedGraph, visited, start, shortest, 0,1, start);
        System.out.println(shortest);
    }

    private static int findShortest(WeightedGraph weightedGraph, boolean[] visited, int start, int shortest, int totalCost, int totalVisitedCount, int startIndex) {
        if(totalVisitedCount==weightedGraph.size && weightedGraph.adjacencyMatrix[start][startIndex]!=0){

            return Math.min(shortest, (totalCost + weightedGraph.adjacencyMatrix[start][startIndex]));


        }
        for( int i=0;i<weightedGraph.size;i++) {
            int cost = weightedGraph.adjacencyMatrix[start][i];
            if(!visited[i] && cost!=0) {
                visited[i]=true;
                totalCost+= cost;
                totalVisitedCount++;
                shortest = findShortest(weightedGraph, visited, i, shortest, totalCost, totalVisitedCount,startIndex);
                visited[i] = false;

                totalVisitedCount--;
                totalCost = totalCost-cost;
            }
        }
        return shortest;
    }
}
