import java.util.Locale;
import java.util.Scanner;

public class ListaExercicios {
    public static void main(String[] args){

    //Exercicio 1

        int x = 10;
        int y = 30;

        int soma = x + y;

        System.out.println("SOMA = " + soma);


    //Exercicio 2

        double a = 100.64;
        double pi = 3.14159;

        double b = Math.pow(a, 2)*pi;

        System.out.printf("A area do raio "+ a +" é = %.4f", b);
        System.out.println("");


    //Exercicio 3

        int p,l,o,k;
        p = 5;
        l = 6;
        o = 7;
        k = 8;

        int diferenca = (p*l) - (o*k);
        System.out.println("Diferença do produto PL e OK é: "+ diferenca);

    //exercicio 4

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        double h, vh;
        n = sc.nextInt();
        h = sc.nextDouble();
        vh = sc.nextDouble();

        double salario = h * vh;

        System.out.printf("Numero funcionario: %d %n Salario: US %.2f%n", n, salario);


    //exercicio 5


        int cp1, np1, cp2, np2;
        double vp1, vp2;

        cp1 = sc.nextInt();
        np1 = sc.nextInt();
        vp1 = sc.nextDouble();

        cp2 = sc.nextInt();
        np2 = sc.nextInt();
        vp2 = sc.nextDouble();

        double total = np1*vp1 + np2*vp2;
        System.out.printf("O valor a pagar é: RS%.2f%n",total );


    //Exercicio 6

        double m,s,d, triangulo, circulo,trapezio,quadrado, retangulo;

        m = sc.nextDouble();
        s = sc.nextDouble();
        d = sc.nextDouble();

        triangulo = (m * d)/2;
        circulo = Math.pow(d, 2)* 3.14159;
        trapezio = (m + s)*d /2;
        quadrado = Math.pow(m, 2);
        retangulo = m*s;

        System.out.printf("TRIANGULO: %.2f%n CIRCULO: %.2f%n TRAPEZIO: %.2f%n QUADRADO: %.2f%n RETANGULO: %.2f%n",triangulo, circulo,trapezio,quadrado, retangulo );
    }
}
