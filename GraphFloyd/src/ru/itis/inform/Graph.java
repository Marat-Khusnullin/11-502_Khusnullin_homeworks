package ru.itis.inform;

/**
 * Created by Марат on 16.02.2016.
 */
public interface Graph {
    void addVertex();
    void addEdge(int A, int B);
    void showGraph();
    int[][] runFloyd();
}

