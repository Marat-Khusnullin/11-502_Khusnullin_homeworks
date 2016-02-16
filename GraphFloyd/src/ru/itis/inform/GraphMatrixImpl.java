package ru.itis.inform;

/**
 * Created by Марат on 16.02.2016.
 */
public class GraphMatrixImpl implements GraphInt {
    private static final int DEFAULT_SIZE = 50;
    private int matrix[][];
    private int verticesCount;
    private int maxSize;

    public GraphMatrixImpl() {
        initGraph(DEFAULT_SIZE);
    }

    public GraphMatrixImpl(int maxSize) {
        initGraph(maxSize);
        this.verticesCount = 0;
    }

    private void initGraph(int maxSize) {
        this.maxSize = maxSize;
        this.verticesCount = 0;
        this.matrix = new int[maxSize][maxSize];
    }

    @Override
    public void addVertex() {
        if (this.verticesCount < this.maxSize) {
            this.verticesCount++;
        } else throw new IllegalArgumentException();
    }

    @Override
    public void addEdge(int vertexA, int vertexB, int sizeC) {
        if (vertexA < this.verticesCount && vertexB < this.verticesCount) {
            this.matrix[vertexA][vertexB] = sizeC;
        } else throw new IllegalArgumentException();
    }

    @Override
    public void showGraph() {
        for (int i = 0; i < this.verticesCount; i++) {
            for (int j = 0; j < this.verticesCount - 1; j++) {
                System.out.print(matrix[i][j] + ",  ");
            }
            System.out.println(matrix[i][this.verticesCount - 1]);
        }
    }

    private int[][] b;

    public void floyd() {
        int fl[][] =new int[this.verticesCount+1][this.verticesCount+1];
        for (int i = 0; i<this.verticesCount; i++) {
            for (int j = 0; j< this.verticesCount; j++) {
                fl[i][j] = matrix[i][j];
            }
        }
        for (int i = 0; i < this.verticesCount; i++) {
            for (int j = 0; j < this.verticesCount; j++) {
                for (int k = 0; k < this.verticesCount; k++) {
                if (fl[i][k]!=0 && fl[k][j]!=0)
                    fl[i][j] = minim(fl[i][j], fl[i][k] + fl[k][j]);
                }
            }
        }
        this.b = fl;
    }
    public void showFloyd() {

        for (int i = 0; i < this.verticesCount; i++) {
            for (int j = 0; j < this.verticesCount - 1; j++) {
                System.out.print(b[i][j] + ",  ");
            }
            System.out.println(b[i][this.verticesCount - 1]);
        }
    }
    public int minim(int a, int b) {
        if (a <= b) {
            return a;
        } else return b;
    }

}
