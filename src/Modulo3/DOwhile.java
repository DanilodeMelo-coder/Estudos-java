package Modulo3;

import java.util.Scanner;

public class DOwhile {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        char resposta ;
        do{
            System.out.print("Digite a temperatura em Celsius: ");
            double c = sc.nextDouble();

            double f = ((9 * c)/5) + 32;
            System.out.printf("A temperatura em Fahrenheit: %.1f%n", f);


            System.out.print("Deseja continuar (s/n)? ");
             resposta = sc.next().charAt(0);

        }while( resposta != 'n');
    }
}
