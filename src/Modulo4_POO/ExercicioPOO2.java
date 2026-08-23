package Modulo4_POO;

import Modulo2.SwithCase;
import Modulo3.While;
import Modulo4_POO.entities.Produto;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ExercicioPOO2 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Produto p1;
        p1 = new Produto();


        System.out.println("Digite o nome do produto: ");
        p1.nome = sc.nextLine();

        System.out.println("Digite o valor do produto: ");
        p1.preco = sc.nextDouble();

        System.out.println("Digite a quantidade em estoque: ");
        p1.quantidade = sc.nextInt();


        System.out.println();
        System.out.println("Dados do produtor: " + p1);


        boolean continuar = true;

        while (continuar == true) {


            int respostaUser = menu(sc);

            switch (respostaUser) {

                case 1:
                    System.out.println();
                    System.out.println("Adicione entrada no estoque: ");
                    int addProd= sc.nextInt();
                    p1.addEstoque(addProd);

                    System.out.println();
                    System.out.println("Dados do produto: " + p1);
                    break;

                case 2:
                    System.out.println();
                    System.out.println("Remova uma quantidade no estoque: ");
                    int removeProd = sc.nextInt();
                    p1.removeEstoque(removeProd);

                    System.out.println();
                    System.out.println("Dados do produto: " + p1);
                    break;


                case 3:
                    continuar = false;
                    break;


                default:
                    System.out.println("Entrada invalida!");
            }
        }


    }

    public static int menu(Scanner sc){

        System.out.println("-----Menu-----");
        System.out.println("1 - Adicionar Produto ao estoque");
        System.out.println("2 - Remover Produto do estoque");
        System.out.println("3 - Sair");

        return sc.nextInt();
    }
}
