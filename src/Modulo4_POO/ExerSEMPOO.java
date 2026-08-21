package Modulo4_POO;

import java.util.Scanner;

public class ExerSEMPOO {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os lados do triangulo X: ");
        double ladoAX = sc.nextDouble();
        double ladoBX = sc.nextDouble();
        double ladoCX = sc.nextDouble();

        double px = calcularP(ladoAX,ladoBX,ladoCX);

        double areaX = calcularArea(ladoAX,ladoBX,ladoCX, px);


        System.out.println("Digite os lados do triangulo Y: ");
        double ladoAY = sc.nextDouble();
        double ladoBY = sc.nextDouble();
        double ladoCY = sc.nextDouble();

        double py = calcularP(ladoAY, ladoBY, ladoCY);

        double areaY = calcularArea(ladoAY, ladoBY, ladoCY, py);

        System.out.printf("Area de X: %.4f%n", areaX);
        System.out.printf("Area de Y: %.4f%n",areaY);

        String maior = checarmaiorArea(areaX, areaY);

        System.out.println("A maior area é de: " + maior);

    }



    public static Double calcularP(double a, double b,double c){

        double p = (a + b + c)/2;

        return p;
    }

    public static Double calcularArea(double a, double b, double c,double p){

        double area = Math.sqrt(p*(p-a) * (p-b) * (p-c));

        return area;

    }

    public static String checarmaiorArea(double x, double y){

        String maior = "";

        if (x > y){

           return maior = "X";
        }
        else{

           return maior = "Y";
        }
    }
}
