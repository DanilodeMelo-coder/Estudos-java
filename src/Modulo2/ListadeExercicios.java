package Modulo2;

import java.util.Scanner;

public class ListadeExercicios {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        // Exercicio 1

        int q;

        q =sc.nextInt();

        if (q > 0){
            System.out.printf("%d é Positivo", q);
        }
        else {
            System.out.printf("%d é Negativo", q);
        }

        System.out.printf("%n");
        // exercicio 2

        int a;

        a =sc.nextInt();

        if (a%2 == 0){
            System.out.println("O valor é PAR");
        }
        else {
            System.out.println("O valor é IMPAR");
        }


        //Exercicio 3


        int l, p;

        l =sc.nextInt();
        p =sc.nextInt();

        if (l%p == 0 || p%l == 0){
            System.out.println("São Multiplos");
        }
        else{
            System.out.println("Não são Multiplos");
        }


    }
}
