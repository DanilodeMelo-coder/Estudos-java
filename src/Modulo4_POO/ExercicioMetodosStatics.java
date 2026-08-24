package Modulo4_POO;

import Modulo4_POO.utils.ConversorDolar;

import java.util.Scanner;

public class ExercicioMetodosStatics {
    public static void main(String[] args){

        /*Faça um programa para ler a cotação do dólar e, em seguida, um valor em dólares a ser comprado por uma pessoa em reais.
         Informe quantos reais a pessoa vai pagar pelos dólares, considerando que ela terá que pagar **6% de IOF** sobre o valor em dólares.
         Crie uma classe `CurrencyConverter` para ser responsável pelos cálculos.

                ### Exemplo
                What is the dollar price? 3.10
                How many dollars will be bought? 200.00

                Amount to be paid in reais = 657.20
                */

        Scanner sc = new Scanner(System.in);

        System.out.println("----COTAÇÃO DO DOLAR----");

        System.out.println("Qual o preço do dolar atualmente: ");
        double dolarPreco = sc.nextDouble();

        System.out.println("Quantos dolares você deseja: ");
        double dolaresRequiridos = sc.nextDouble();

        double valorConvertido = ConversorDolar.conversor(dolarPreco, dolaresRequiridos);

        System.out.println("Valor a pagar em reais: $" + String.format("%.2f",valorConvertido));

    }
}
