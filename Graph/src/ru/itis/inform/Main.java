package ru.itis.inform;

public class Main {

    public static void main(String[] args) {
        GraphInt graph = new GraphMatrixImpl();
        graph.addVertex();
        graph.addVertex();
        graph.addVertex();
        graph.addVertex();
        graph.addVertex();

        graph.addEdge(0, 2, 7);
        graph.addEdge(0, 3, 9);
        graph.addEdge(3, 4, 10);
        graph.addEdge(2, 1, 1);
        graph.addEdge(2, 4, 3);

        graph.showGraph();

    }

}

