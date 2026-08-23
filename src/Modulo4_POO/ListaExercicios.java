package Modulo4_POO;

import Modulo4_POO.entities.Aluno;
import Modulo4_POO.entities.Funcionario;
import Modulo4_POO.entities.Retangulo;

import java.util.Scanner;

public class ListaExercicios {

    public static void main(String[] args){

    }
        public static void Exercicio1() {

            Scanner sc = new Scanner(System.in);

            Retangulo r1 = new Retangulo();

            System.out.println("Digite a altura e largura do retangulo: ");

            System.out.print("Altura: ");
            r1.altura = sc.nextDouble();

            System.out.print("Largura: ");
            r1.largura = sc.nextDouble();

            System.out.println(r1);


            sc.close();

        }

        public static void Exercicio2(){

            Scanner sc = new Scanner(System.in);

            Funcionario f1 = new Funcionario();

            System.out.print("Digite o nome: ");
            f1.nome = sc.nextLine();

            System.out.print("Digite o salario bruto: ");
            f1.salarioBruto = sc.nextDouble();

            System.out.print("Digite a taxa: ");
            f1.taxa = sc.nextDouble();

            System.out.println("Dados: " + f1);

            System.out.println();
            System.out.println("Digite a porcentagem para aumentar o salario: ");
            double porcentagem = sc.nextDouble();
            f1.incrementarSalario(porcentagem);

            System.out.println();
            System.out.println("Dados Atualizados: " + f1);



            sc.close();
        }

        public static void Exercicio3() {

            Scanner sc = new Scanner(System.in);

            Aluno a1 = new Aluno();

            System.out.print("Digite o nome do aluno: ");
            a1.nome = sc.nextLine();

            System.out.println("Digite a nota do 1° Trimestre: ");
            a1.notaT1 = sc.nextDouble();

            System.out.println("Digite a nota do 2° Trimestre: ");
            a1.notaT2 = sc.nextDouble();

            System.out.println("Digite a nota do 3° Trimestre: ");
            a1.notaT3 = sc.nextDouble();

            System.out.println(a1);


            sc.close();
        }
}
