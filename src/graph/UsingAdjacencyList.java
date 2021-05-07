package graph;

import java.util.LinkedList;
import java.util.List;

public class UsingAdjacencyList {
//    Array of type linkedList
    private LinkedList<Integer>[] adj;

    UsingAdjacencyList(int vertex) {
        adj = new LinkedList[vertex];
        for(int i=0; i<vertex; i++) {

//            Initializing each cell of array with a linkedList
            adj[i] = new LinkedList<>();
        }
    }

    

    public void addEdge(int source, int destination) {
        adj[source].add(destination);
        adj[destination].add(source);
    }
}
