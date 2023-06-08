package org.example;

import java.util.Arrays;

public class SpiralInsertion {

    public static void main(String[] args) {
        int[][] matrix = spiralAddition(3);
        System.out.println(Arrays.deepToString(matrix));
    }

    public static int[][] spiralAddition(int n) {
        int[][] matrix = new int[n][n];
        int number = 1;
        int rowStart = 0;
        int rowEnd = n - 1;
        int colStart = 0;
        int colEnd = n - 1;

        while (number <= n * n) {
            for (int i = colStart; i <= colEnd; i++) {
                matrix[rowStart][i] = number;
                number++;
            }
            rowStart++;

            for (int i = rowStart; i <= rowEnd; i++) {
                matrix[i][colEnd] = number;
                number++;
            }
            colEnd--;

            for (int i = colEnd; i >= colStart; i--) {
                matrix[rowEnd][i] = number;
                number++;
            }
            rowEnd--;

            for (int i = rowEnd; i >= rowStart; i--) {
                matrix[i][colStart] = number;
                number++;
            }
            colStart++;

        }
        return matrix;
    }

}