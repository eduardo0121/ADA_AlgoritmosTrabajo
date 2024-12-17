package com.mycompany.sumadiagonales;

public class SumaDiagonales {

    public static int[] sumaDiagonales(int[][] matriz) {
        int sumaPrincipal = 0;
        int sumaSecundaria = 0;
        int ddd = matriz.length;
        for (int i = 0; i < ddd; i++) {
            sumaPrincipal += matriz[i][i];
            sumaSecundaria += matriz[i][ddd - 1 - i];
        }
        return new int[]{sumaPrincipal, sumaSecundaria};
    }

    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] sumas = sumaDiagonales(matriz);
        System.out.println("Suma diagonal principal: " + sumas[0]);
        System.out.println("Suma diagonal secundaria: " + sumas[1]);
    }
}
