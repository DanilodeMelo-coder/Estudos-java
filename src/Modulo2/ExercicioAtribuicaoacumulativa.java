package Modulo2;

import java.util.Scanner;

public class ExercicioAtribuicaoacumulativa {
    public static void main(String[] args){


    Scanner sc = new Scanner(System.in);

    Double valor_plano;
    int minutos_gastos = 0;

    valor_plano = 50.0;

    minutos_gastos = sc.nextInt();

    if (minutos_gastos > 100){
        valor_plano += (minutos_gastos - 100)* 2.0;
    }

    if (valor_plano == 50.0) {
        System.out.println("Valor a pagar: R$ " + valor_plano);
    }
    else{
        System.out.printf("Valor a pagar: R$ %.2f%n",valor_plano);
    }

    sc.close();
    }
}
