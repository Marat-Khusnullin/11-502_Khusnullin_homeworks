package ru.itis.inform;

import static org.junit.Assert.*;

public class GraphTestModule {
    private GraphMatrixImpl test = new GraphMatrixImpl();

    @org.junit.Before
    public void setUp() throws Exception {
        this.test = new GraphMatrixImpl();
    }

    @org.junit.Test
    public void testFloyd () throws Exception {
        int actual [][] = new int[50][50];
        int expected [][];
        /*test.addVertex();
        test.addVertex();
        test.addVertex();
        test.addOrientedEdge(1,2,1);
        test.addOrientedEdge(0,1,7);
        test.addOrientedEdge(0,2,10);*/
        actual = test.runFloyd();
        expected = new int[][]{{0, 7, 8},{0,0,1},{0,0,0}
        };
       
System.out.println(equals1(expected, actual));


    }
    private boolean equals1(int [][]a, int [][]b) {
        for (int i = 0; i<test.getSize(); i++ ){
            for (int j= 0;j<test.getSize();j++) {
                if (a[i][j]!=b[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

}
