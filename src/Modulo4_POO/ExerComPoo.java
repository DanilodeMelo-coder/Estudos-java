package Modulo4_POO;

import Modulo4_POO.entities.triangulo;

import java.util.Scanner;


public class ExerComPoo {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        triangulo x,y;
        x = new triangulo();
        y = new triangulo();

        System.out.println("Digite os lados do triangulo X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        double px = calcularP(x.a,x.b,x.c);

        double areaX = calcularArea(x.a,x.b,x.c, px);


        System.out.println("Digite os lados do triangulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double py = calcularP(y.a,y.b,y.c);

        double areaY = calcularArea(y.a,y.b,y.c, py);

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
