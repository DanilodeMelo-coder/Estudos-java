import java.util.Locale;

public class Main{
    public static void main(String[] args){

        int y = 19;
        System.out.println(19);



        double x = 10.2324;
        System.out.println(x);
        System.out.printf("%.2f%n", x); //"%.2f "-> casas decimais  "%n -> quebra de linha
        System.out.printf("%.4f%n", x);

        Locale.setDefault(Locale.US); //configurar loc do programa
        System.out.printf("%.4f%n", x);


        //CONCATENAÇÃO

        double w = 20.131;

        System.out.println("Resultado= " + w + " Metros");
        System.out.printf("Resultado=  %.2f metros%n", w);


        String nome = "Danilo";
        int idade = 19;
        double saldo = 1.02;

        System.out.printf("%s tem %d anos e tem um saldo de %.2f reais%n",nome,idade,saldo);

        //%f ponto flutuante
        //%d inteiro
        //%s texto
        //%n quebra de linha



        //EXERCICIO

        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.printf("Products:%n %s, which price de $ %.2f%n %s, which price is $ %.2f%n",product1, price1, product2, price2);
        System.out.printf("Record: %d years old, code %d and gender: %s%n", age, code, gender);
        System.out.printf("Measue witch eight decimal places: %.8f%n Rouded (three decimal places): %.3f%n", measure, measure);

        Locale.setDefault(Locale.US);
        System.out.printf("us decimal point: %.3f%n",measure);







        //PROCESSAMENTO DE DADOS

        int  p, o;

        p= 5;
        o = 4;

        System.out.println(p);
        System.out.println(o);

        //EXERCICIO

        int h = 5;
        int b = 6;
        int a = 8;

        int area = (a + b)/2 * h;

        System.out.printf("resultado da area: %d", area);

        //CASTING -> conversão de valores
        int c, v;
        double resultado;

        c= 5;
        v= 2;

        resultado = (double) c / v;

        System.out.println(resultado);

    }
}