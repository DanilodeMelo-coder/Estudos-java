package Modulo2;

import java.util.Scanner;

// Arquivo em branco desinado a resolver os exercicios e passar para alista ao final
public class ResoluçãoExercicios {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Double calculo_imposto = 0.00;

        Double x = sc.nextDouble();

        if ( x <= 2000.00){
            System.out.println("Isento");

        }
        else if (x >= 2000.01 && x <= 3000.00){
            calculo_imposto = (8/100) *x;

        }
        else if (x >= 3000.01 && x <= 4500.00){
            calculo_imposto = (18/100)*x;

        }
        else{
            calculo_imposto = (28/100)* x;
        }

        System.out.println(calculo_imposto);

    }
}
