package Modulo6_Vetores;

import java.util.Scanner;

public class Exer_Negativos {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();

        int[] vect = new int[n];

        for (int i = 0; i<n ;i++){

            System.out.print("Digite um valor: ");
            int valor= sc.nextInt();

            vect[i] = valor;
        }

        System.out.println("NUMERO NEGATIVOS: ");
        for (int i = 0; i<n; i++){

            if (vect[i] < 0 ){

                System.out.println(vect[i]);
            }
        }



    }
}
