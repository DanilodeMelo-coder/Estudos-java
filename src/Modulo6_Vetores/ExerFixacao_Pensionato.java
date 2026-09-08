package Modulo6_Vetores;

import Modulo6_Vetores.Entities.Estudantes;

import java.util.Scanner;

public class ExerFixacao_Pensionato {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos estudantes alugaram quarto? ");
        int n = sc.nextInt();

        Estudantes[] vect = new Estudantes[10];

        for(int i = 0; i < n; i++){

            System.out.printf("ALUGUEL #%d%n", i + 1);

            sc.nextLine();
            System.out.print("NOME: ");
            String nome = sc.nextLine();

            System.out.print("EMAIL: ");
            String email = sc.nextLine();

            System.out.print("QUARTO: ");
            int quarto = sc.nextInt();

            vect[quarto] = new Estudantes(nome, email, quarto);
        }

        sc.nextLine();
        System.out.println("Quartos alugados: "); //Busy rooms
        for(int i = 0; i < vect.length; i++){

            if (vect[i] != null){
                System.out.println(vect[i]);
            }
        }

    }
}
