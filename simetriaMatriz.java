package com.mycompany.sumadiagonales;

import java.util.ArrayList;
import java.util.List;

public class simetriaMatriz {

    public static List<Integer> recorrerEspiral(int[][] matriz) {
        List<Integer> resultado = new ArrayList<>();
        int filaInicio = 0, filaFin = matriz.length - 1;
        int colInicio = 0, colFin = matriz[0].length - 1;
        while (filaInicio <= filaFin && colInicio <= colFin) {
            for (int j = colInicio; j <= colFin; j++) {
                resultado.add(matriz[filaInicio][j]);
            }

            filaInicio++;
            for (int i = filaInicio; i <= filaFin; i++) {
                resultado.add(matriz[i][colFin]);
            }
            colFin--;
            if (filaInicio <= filaFin) {
                for (int j = colFin; j >= colInicio; j--) {
                    resultado.add(matriz[filaFin][j]);
                }
                filaFin--;
            }
            if (colInicio <= colFin) {
                for (int i = filaFin; i >= filaInicio; i--) {
                    resultado.add(matriz[i][colInicio]);
                }
                colInicio++;
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        List<Integer> recorridoEspiral = recorrerEspiral(matriz);
        System.out.println("Recorrido en espiral: " + recorridoEspiral);
    }
}
