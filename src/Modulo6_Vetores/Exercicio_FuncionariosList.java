package Modulo6_Vetores;

import Modulo6_Vetores.Entities.FuncionariosArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio_FuncionariosList {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        List<FuncionariosArrayList> listaFuncionarios = new ArrayList<>();

        System.out.print("Deseja cadastrar quantos funcionarios? ");
        int n = sc.nextInt();

        for(int i = 0; i < n ; i++){
            System.out.printf("Cadastro funcionario %d%n", i + 1);

            System.out.print("Digite o id: ");
            int id = sc.nextInt();

            sc.nextLine();

            System.out.print("Digite o nome: ");
            String nome = sc.nextLine();

            System.out.print("Digite o salario: ");
            double salario = sc.nextDouble();

            listaFuncionarios.add(new FuncionariosArrayList(id, nome, salario));

            System.out.println(" ");
        }

        System.out.println(" ");
        System.out.print("Digite o Id do funcionario para aumentar o salario: ");
        int idBusca = sc.nextInt();

        FuncionariosArrayList x = listaFuncionarios.stream().filter(funcionario -> funcionario.getId() == idBusca).findFirst().orElse(null);

        sc.nextLine();

        if (x == null){

            System.out.println("Esse id não existe");

        }
        else {
            System.out.print("Entre com a porcentagem: ");
            double porcentagem = sc.nextDouble();

            x.aumentoSalario(porcentagem);
        }

        System.out.println(" ");

        System.out.println("Lista de funcionarios: ");

        for(FuncionariosArrayList funcionario: listaFuncionarios){
            System.out.println(funcionario);
        }

    }
}
