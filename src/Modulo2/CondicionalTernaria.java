package Modulo2;

public class CondicionalTernaria {
    public static void main(String[] args){

      int t1=  (2 > 4) ? 50 : 80;

      // (condição) ? valor_verdadeiro : valor_falso


        System.out.println(t1);

        String t2 = (100 > 10000) ? "100 é maior do que 10000" : "100 é menor do que 10000";

        System.out.println(t2);



        // Exercicio

        double preco = 34.5;
        double desconto;

        desconto = (preco < 20) ? preco * 0.1 : preco * 0.05;
        System.out.println(desconto);
    }
}
