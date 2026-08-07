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

        //Exercicio 4

        int hi, hf, horas = 0;

        hi =sc.nextInt();
        hf = sc.nextInt();

        if (hi == hf){
            horas = 24;
        }
        else if (hi < hf){
            horas = Math.abs(hi - hf);
        }
        else if (hi > hf){
            horas = (24 - hi) + hf;
        }

        System.out.printf("O jogo durou %d hora(s)", horas);


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

        //Exercicio 7


        double x, y;
        String quadrante = "";

        x = sc.nextDouble();
        y = sc.nextDouble();

        if (x < 0 && y > 0){
            quadrante = "Q2";
        }
        else if (x > 0 && y > 0){
            quadrante = "Q1";
        }
        else if (x < 0 && y < 0) {
            quadrante = "Q3";

        }
        else if (x > 0 && y < 0) {
            quadrante = "Q4";

        }

        System.out.println(quadrante);


        // Exercicio 8

        Double calculo_imposto;

        Double sl = sc.nextDouble();

        if ( sl <= 2000.00){
            calculo_imposto = 0.0;

        }
        else if (sl <= 3000.00){
            calculo_imposto = (sl - 2000.0) * 0.08;

        }
        else if (sl <= 4500.00){
            calculo_imposto = (sl - 3000.0) * 0.18 + 1000.0 * 0.08;

        }
        else{
            calculo_imposto = (sl - 4500) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }

        if (calculo_imposto == 0.0) {
            System.out.println("Isento");
        }
        else {
            System.out.printf("R$ %.2f%n", calculo_imposto);
        }






    }
}
