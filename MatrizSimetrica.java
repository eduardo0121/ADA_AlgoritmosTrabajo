package com.mycompany.sumadiagonales;
public class MatrizSimetrica {

    public static boolean esSimetrica(int[][] matriz) {
        int n = matriz.length; 
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    return false; 
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3},
        {2, 4, 5},
        {3, 5, 6}};

        if (esSimetrica(matriz)) {
            System.out.println("La matriz es simetrica.");
        } else {
            System.out.println("La matriz no es simetrica.");
        }
    }
}

