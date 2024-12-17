package com.mycompany.sumadiagonales;

public class RotarMatriz {

    public static void rotarMatriz(int[][] matriz) {
        int ddd = matriz.length;
        int[][] matrizRotada = new int[ddd][ddd];
        for (int i = 0; i < ddd; i++) {
            for (int j = 0; j < ddd; j++) {
                matrizRotada[j][ddd - 1 - i] = matriz[i][j];
            }
        }
        for (int i = 0; i < ddd; i++) {
            for (int j = 0; j < ddd; j++) {
                matriz[i][j] = matrizRotada[i][j];
            }
        }
    }
    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotarMatriz(matriz);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
