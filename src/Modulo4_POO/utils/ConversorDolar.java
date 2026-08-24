package Modulo4_POO.utils;

public class ConversorDolar {

    public static final double IOF = 6.00;

    public static double conversor(double dolarAtual, double dolarRequirido){

        double valorComImporto = (dolarRequirido * IOF/ 100) + dolarRequirido;

        return dolarAtual * valorComImporto;
    }
}
