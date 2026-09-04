package Modulo6_Vetores;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        //Declarando vetor
        double[] vect = new double[n];

        for(int i = 0; i < n; i++){

            vect[i] = sc.nextDouble();
        }

        double sum = 0.0;
        for (int i = 0; i < n; i++){

            sum+= vect[i];

        }

        double media = sum/n;

        System.out.println(media);




        sc.close();
    }
}
