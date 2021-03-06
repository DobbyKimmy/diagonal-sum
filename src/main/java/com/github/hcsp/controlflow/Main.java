package com.github.hcsp.controlflow;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(diagonalSum(matrix));
    }

    /**
     * 给定一个二维数组，返回其主对角线（从左上到右下）元素之和。你可以假设该数组是NxN的，即一维和二维长度相同，都是N。
     *
     * @param matrix 给定的二维数组
     * @return 对角线元素之和
     */
    public static int diagonalSum(int[][] matrix) {
        if (matrix == null || matrix[0] == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        /*return process(matrix, 0, 0, matrix.length - 1, matrix[0].length - 1);*/
        int res = 0;
        for (int i = 0; i < matrix.length; i++) {
            res += matrix[i][i];
        }
        return res;
    }

    /*public static int process(int[][] matrix, int leftTopRow, int leftTopColumn, int rightBottomRow, int rightBottomColumn) {
        int res = 0;
        if (leftTopRow == rightBottomRow) {
            res = matrix[leftTopRow][leftTopColumn];
        }
        if (leftTopRow < rightBottomRow) {
            res = matrix[leftTopRow][leftTopColumn] +
                    matrix[leftTopRow][rightBottomColumn] +
                    matrix[rightBottomRow][leftTopColumn] +
                    matrix[rightBottomRow][rightBottomColumn];
        }

        while (leftTopRow < rightBottomRow) {
            res += process(matrix, ++leftTopRow, ++leftTopColumn, --rightBottomRow, --rightBottomColumn);
        }
        return res;
    }*/
}
