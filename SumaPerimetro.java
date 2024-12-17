package com.mycompany.sumadiagonales;

public class SumaPerimetro {

    public static int sumaPerimetro(int[][] matriz) {
        int ddd = matriz.length;
        int suma = 0;
  
        for (int j = 0; j < ddd; j++) {
            suma += matriz[0][j] + matriz[ddd - 1][j];
        }

        for (int i = 1; i < ddd - 1; i++) {
            suma += matriz[i][0] + matriz[i][ddd - 1];
        }
        return suma;
    }

    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int suma = sumaPerimetro(matriz);
        System.out.println("Suma del perimetro: " + suma);
    }
}
