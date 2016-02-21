package ru.itis.inform;

/**
 * Created by Марат on 18.02.2016.
 */
public interface DirectedGraph {
     void  addVertex();
     void  addOrientedEdge(int a, int b, int c);
     int[][]  runFloyd();

}
