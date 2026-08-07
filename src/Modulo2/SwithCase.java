package Modulo2;

import java.util.Scanner;

public class SwithCase {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);


        int dia_semana = sc.nextInt();
        String dia;

        switch (dia_semana) {
            case 1:
                dia = "Segunda";
                break;

            case 2:
                dia = "Terça";
                break;

            case 3:
                dia = "Quarte";
                break;

            case 4:
                dia = "Quinta";
                break;

            case 5:
                dia = "Sexta";
                break;

            case 6:
                dia = "Sabado";
                break;

            case 7:
                dia = "Domingo";
                break;

            default:
                dia = "Valor invalido";
                break;

        }

        System.out.println("Hoje é "+ dia);


    sc.close();


    }
}
