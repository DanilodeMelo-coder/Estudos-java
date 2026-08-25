package Modulo4_POO;

import Modulo4_POO.utils.ConversorTemperatura;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class ExercicioConversorTempe {
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

        System.out.println("=====CONVERSOR DE TEMPERATURA=====");
        System.out.println();

        System.out.println("Digite a temperatura em Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheitConvertido = ConversorTemperatura.Conversao(celsius);

        System.out.println("Fahrenheit: " + fahrenheitConvertido);
    }
}
