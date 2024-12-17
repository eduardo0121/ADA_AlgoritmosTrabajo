package com.mycompany.sumadiagonales;

public class matrizTranspuesta {
    public static int[][] transponerMatriz(int[][] matriz) {
        int n = matriz.length;
        int m = matriz[0].length;
        int[][] transpuesta = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }
        return transpuesta;
    }
    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}};
        int[][] transpuesta = transponerMatriz(matriz);
        for (int i = 0; i < transpuesta.length; i++) {
            for (int j = 0; j < transpuesta[i].length; j++) {
                System.out.print(transpuesta[i][j] + " ");
            }
            System.out.println();
        }
    }
}
