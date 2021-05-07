package graph;

public class GraphUsingAdjacencyMatrix {
    int[][] adjMatrix;
    int vertex;

    GraphUsingAdjacencyMatrix(int vertex) {
        this.vertex = vertex;
        adjMatrix = new int[vertex+1][vertex+1];
    }

    void addEdge(int i, int j) {
        adjMatrix[i][j] = 1;
        adjMatrix[j][i] = 1;
    }

    void removeEdge(int i, int j) {
        adjMatrix[i][j] = -1;
        adjMatrix[j][i] = -1;
    }

    void printGraph() {
        for(int i=0; i<vertex; i++) {
            for(int j=0; j<vertex; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
