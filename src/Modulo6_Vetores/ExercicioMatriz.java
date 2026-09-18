package Modulo6_Vetores;

import java.util.Scanner;

public class ExercicioMatriz {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] matriz = new int[m][n];

        for(int i = 0; i< matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("");
        int num = sc.nextInt();

    for(int i = 0; i< matriz.length; i++){
        for(int j = 0; j<matriz[i].length; j++){

            if(matriz[i][j] == num){
                System.out.printf("Posição: %d,%d%n", i, j);

                if(j < matriz[i].length-1) {
                    System.out.println("Direita: " + matriz[i][j + 1]);
                }
                if (j > 0) {
                    System.out.println("Esquerda: " + matriz[i][j - 1]);
                }
                if(i > 0) {
                    System.out.println("Em cima: " + matriz[i - 1][j]);
                }
                if(i < matriz.length-1) {
                    System.out.println("Em baixo: " + matriz[i + 1][j]);
                }
            }
        }
    }

        sc.close();
    }
}
