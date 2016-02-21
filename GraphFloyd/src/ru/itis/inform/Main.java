package ru.itis.inform;

public class Main {

    public static void main(String[] args) throws Exception {
        GraphMatrixImpl graph = new GraphMatrixImpl();
        graph.addVertex();
        graph.addVertex();
        graph.addVertex();


        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.showGraph();
        System.out.println();

        GraphMatrixImpl graph1 = new GraphMatrixImpl();
        graph1.addVertex();
        graph1.addVertex();
        graph1.addVertex();

        graph1.addOrientedEdge(1,2,1);
        graph1.addOrientedEdge(0,1,7);
        graph1.addOrientedEdge(0,2,10);

        graph1.showGraph();
        graph1.runFloyd();
        graph1.showFloyd();
        GraphTestModule z = new GraphTestModule();
        z.testFloyd();



    }
    }


