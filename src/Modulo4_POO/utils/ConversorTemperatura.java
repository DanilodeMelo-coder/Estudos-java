package Modulo4_POO.utils;

public class ConversorTemperatura {


    public static final double  FATOR_CONVERSAO = 1.8;


    public static double Conversao(double celsius){

        return  (celsius * FATOR_CONVERSAO) + 32;

    }
}
