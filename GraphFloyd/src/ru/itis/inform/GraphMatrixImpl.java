package ru.itis.inform;


public class GraphMatrixImpl implements Graph, DirectedGraph {
    private static final int DEFAULT_SIZE = 50;
    private int matrix[][];
    private int floydOfSuspendedMatrix[][];
    private int verticesCount;
    private int maxSize;


    public GraphMatrixImpl() {
        initGraph(DEFAULT_SIZE);
    }

    public int[][] getMatrix() {
        return matrix;
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

    public void addEdge(int vertexA, int vertexB) {
        if (vertexA < this.verticesCount && vertexB < this.verticesCount) {
            this.matrix[vertexA][vertexB] = 1;
            this.matrix[vertexB][vertexA] = 1;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public void addOrientedEdge(int vertexA, int vertexB, int sizeC) {
        if (vertexA < this.verticesCount && vertexB < this.verticesCount) {
            this.matrix[vertexA][vertexB] = sizeC;
        } else {
            throw new IllegalArgumentException();
        }
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


    public int[][] runFloyd() {
         floydOfSuspendedMatrix =new int[this.verticesCount][this.verticesCount];
        for (int i = 0; i<this.verticesCount; i++) {
            for (int j = 0; j< this.verticesCount; j++) {
                floydOfSuspendedMatrix[i][j] = this.matrix[i][j];
            }
        }
        for (int i = 0; i < this.verticesCount; i++) {
            for (int j = 0; j < this.verticesCount; j++) {
                for (int k = 0; k < this.verticesCount; k++) {
                if (this.floydOfSuspendedMatrix[i][k]!=0 && this.floydOfSuspendedMatrix[k][j]!=0)
                    this.floydOfSuspendedMatrix[i][j] = minim(this.floydOfSuspendedMatrix[i][j], this.floydOfSuspendedMatrix[i][k] + this.floydOfSuspendedMatrix[k][j]);
                }
            }
        }
        return floydOfSuspendedMatrix;
    }

    public void  showFloyd() {
        for (int i = 0; i < this.verticesCount; i++) {
            for (int j = 0; j < this.verticesCount - 1; j++) {
                System.out.print(this.floydOfSuspendedMatrix[i][j] + ",  ");
            }
            System.out.println(this.floydOfSuspendedMatrix[i][this.verticesCount - 1]);
        }
    }
    public int getSize() {
        return verticesCount;
    }


   /* public void showFloyd() {

        for (int i = 0; i < this.verticesCount; i++) {
            for (int j = 0; j < this.verticesCount - 1; j++) {
                System.out.print(b[i][j] + ",  ");
            }
            System.out.println(b[i][this.verticesCount - 1]);
        }
    }*/

    public int minim(int a, int b) {
        if (a <= b) {
            return a;
        } else return b;
    }

}
