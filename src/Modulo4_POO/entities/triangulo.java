package Modulo4_POO.entities;

public class triangulo {

    public double a;
    public double b;
    public double c;

    public Double calcularArea(){

        double p = (a + b + c)/2;
        return Math.sqrt(p*(p-a) * (p-b) * (p-c));

    }
}
