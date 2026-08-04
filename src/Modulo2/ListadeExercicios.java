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


        //exercicio 5

        int codigo, quant;
        double resultado;

        codigo = sc.nextInt();
        quant = sc.nextInt();

        if (codigo == 1){
            resultado = (double) 4.00 * quant;
        }
        else if (codigo == 2){
            resultado = (double) 4.50 * quant;
        }
        else if (codigo == 3) {
            resultado = (double) 5.00 * quant;
        }
        else if (codigo == 4) {
            resultado = (double) 2.00 * quant;
        }
        else {
            resultado = (double) 1.50 * quant;
        }

        System.out.println("Total: R$ " + resultado);


        //Exercicio 6

        double valor = sc.nextDouble();

        if (valor >= 0 && valor <= 25){
            System.out.println("INTERVALO (0,25)");
        }
        else if(valor > 25 && valor <50){
            System.out.println("INTERVALO (25,50)");
        }
        else if(valor >= 50 && valor <75){
            System.out.println("INTERVALO (50,75)");
        }
        else if(valor > 75 && valor <100){
            System.out.println("INTERVALO (75,100)");
        }
        else{
            System.out.println("Valor fora do intervalo");
        }

    }
}
