package Modulo3;

import java.util.Scanner;

public class While {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        /*
        int x = 0;

        while (x < 10){

            System.out.print("Digite um valor: ");
            x = sc.nextInt();

            System.out.println(x);
        }

        System.out.printf("%d é maior do que 10", x) */


        //Exercicio

        System.out.print("Digite um valor: ");
        int x = sc.nextInt();

        int contador = 0;

        while (x != 0){

            contador += x;

            System.out.print("Digite um valor: ");
            x = sc.nextInt();

           // System.out.println(x);
        }

        System.out.println("O valor dos numeros somados é: " + contador);

    }
}
