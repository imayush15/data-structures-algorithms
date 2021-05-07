package graph;

public class Main {
    public static void main(String[] args) {
        UsingAdjacencyList g = new UsingAdjacencyList(5);

        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);

        g.addEdge(2, 1);
        g.addEdge(2, 3);

        g.addEdge(3, 1);
        g.addEdge(3, 2);
        g.addEdge(3, 4);
        g.addEdge(3, 5);

        g.addEdge(4, 1);
        g.addEdge(4, 3);
        g.addEdge(4, 5);

        g.addEdge(5, 3);
        g.addEdge(5, 4);


    }
}
