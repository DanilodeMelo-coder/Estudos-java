package Modulo6_Vetores;

import Modulo6_Vetores.Entities.Produtoarrays;

import java.util.Scanner;

public class Vetores_Pt2 {
    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Produtoarrays[] vect = new Produtoarrays[n];

        for (int i =0; i < vect.length; i++){

            sc.nextLine();
            String nome = sc.nextLine();
            double preco = sc.nextDouble();

            vect[i] = new Produtoarrays(nome, preco);

        }

        double sum = 0.0;
        for (int i = 0; i<vect.length; i++){

            sum += vect[i].getPreco();
        }

        double media = sum/vect.length;

        System.out.printf("Media: %.2f%n", media);

    }
}
