package Modulo3;

import java.util.Scanner;

public class ListaExercicio {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //Exercicio 1
        System.out.print("Digite sua senha: ");
        int senha_correta = 2002, senha_digitada = sc.nextInt();


        while(senha_digitada != senha_correta){

            System.out.println("Senha incorreta");

            System.out.print("Digite sua senha: ");
            senha_digitada = sc.nextInt();
        }

        System.out.println("Acesso permitido");


        //Exercicio 2

        int x = sc.nextInt(), y = sc.nextInt();
        String quadrante = "";

        while (x != 0 || y != 0){

            if (x > 0 && y > 0){
                quadrante = "Primeiro";
            }
            else if (x < 0 && y > 0) {
                quadrante = "Segundo";
            }
            else if (x < 0 && y < 0) {
                quadrante = "Terceiro";
            }
            else{
                quadrante = "Quarto";
            }

            System.out.println(quadrante);

            x = sc.nextInt();
            y = sc.nextInt();
        }


        //Exercicio 3


        int op= 0;

        int alcool = 0, gasolina= 0, diesel= 0;


        while(op != 4){

            op= sc.nextInt();

            if (op == 1 ){
                alcool ++;
            }
            else if (op == 2){
                gasolina ++;
            }
            else if (op == 3){
                diesel ++;
            }
            else if (op == 4) {
                System.out.println("Muito Obrigado!");
                System.out.println("Alcool: " + alcool);
                System.out.println("Gasolina: " + gasolina);
                System.out.println("Diesel: " + diesel);

                break;
            }
            else {
                System.out.println("Tente outra opção");

            }
        }




        sc.close();
    }
}
