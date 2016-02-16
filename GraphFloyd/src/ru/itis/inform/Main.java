package ru.itis.inform;

public class Main {

    public static void main(String[] args) {
        GraphMatrixImpl graph = new GraphMatrixImpl();
        graph.addVertex();
        graph.addVertex();
        graph.addVertex();


        graph.addEdge(0, 1, 1);
        graph.addEdge(0, 2, 3);
        graph.addEdge(1, 2, 1);


        graph.showGraph();
        graph.floyd();
        System.out.println();
        graph.showFloyd();

    }
    }


