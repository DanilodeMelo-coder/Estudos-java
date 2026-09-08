package Modulo6_Vetores;

import java.util.Scanner;

public class Exer_soma_vetor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numero voce quer digitar?");
        int n = sc.nextInt();

        double[] vect = new double[n];


        for(int i = 0; i<vect.length; i++){

            System.out.print("Digite um numero: ");
            vect[i]= sc.nextDouble();
        }

        System.out.print("VALORES: ");
        for(int i = 0; i<vect.length; i++){

            System.out.printf("%.1f  ", vect[i]);
        }

        double sum = 0.0;
        double media = 0.0;
        for(int i = 0; i<vect.length; i++){

            sum += vect[i];
        }

        media = sum/vect.length;

        System.out.printf("\nSOMA: %.2f%n ", sum);
        System.out.printf("MEDIA: %.2f%n", media);


        sc.close();
    }
}
