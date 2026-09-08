package Modulo6_Vetores;

import Modulo6_Vetores.Entities.PessoaAltura;

import java.util.Scanner;

public class Exer_alturas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas voce quer digitar?");
        int n = sc.nextInt();

        double sum = 0.0;
        double pessoas16m = 0;

        PessoaAltura[] vect = new PessoaAltura[n];

        for(int i = 0; i<n; i++){

            sc.nextLine();
            System.out.printf("DADOS DA %da PESSOA: %n", i + 1);
            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();

            if (idade < 16){
                pessoas16m += 1;
            }

            System.out.print("Altura: ");
            double altura = sc.nextDouble();

            sum += altura;

            vect[i] = new PessoaAltura(nome, idade, altura);
        }

        double media = sum/vect.length;
        System.out.printf("Media: %.2f%n", media);

        double porcentagem = (pessoas16m/ vect.length) * 100;
        System.out.printf("Pessoas menores de 16 anos: %.2f%n", porcentagem);

        for (int i =  0; i < vect.length; i++){

            if(vect[i].getIdade() < 16){
                System.out.println(vect[i].getNome());
            }
        }

    }
}
