package Modulo4_POO.entities;

public class Retangulo {
    public double altura;
    public double largura;

    public double area(){

        return altura * largura;
    }

    public double perimetro(){

        return (2 * altura) + (2 * largura);
    }

    public double diagonal(){

        return Math.sqrt(Math.pow(altura, 2.00) + Math.pow(largura, 2.00));
    }

    public String toString(){

        return "Area: " + String.format("%.2f%n", area()) + "Perimetro: " + String.format("%.2f%n", perimetro()) + "Diagonal: " + String.format("%.2f%n", diagonal());
    }
}
