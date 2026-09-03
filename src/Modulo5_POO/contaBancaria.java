package Modulo5_POO;

import Modulo5_POO.entities.contaBancariaEntitie;

import java.util.Scanner;

public class contaBancaria {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o numero da conta: ");
        int numero = sc.nextInt();

        sc.nextLine();
        System.out.print("Digite o nome do Beneficiario: ");
        String nome = sc.nextLine();


        contaBancariaEntitie Beneficiario1 = new contaBancariaEntitie(numero, nome);



        System.out.println("Deseja fazer um deposito inicial? (s/n)");
        String resp = sc.nextLine();

        double saldoAdicionado;

        if (resp.equals("s")){

            System.out.println("saldo à adicionar: ");
            saldoAdicionado = sc.nextDouble();
            Beneficiario1.depositarSaldo(saldoAdicionado);
        }

        System.out.println("Dados: " + Beneficiario1);


        boolean continuar = true;

        while(continuar){

            int respostaUser = menu(sc);

            switch (respostaUser){

                case 1:
                    System.out.println("---DEPÓSITO---");
                    System.out.println("Deseja depositar quando? ");
                    double deposito = sc.nextDouble();

                    Beneficiario1.depositarSaldo(deposito);
                    System.out.println("Saldo Atualizado: " + Beneficiario1.getSaldo());
                    break;


                case 2:
                    System.out.println("---SAQUE---");
                    System.out.println("Aviso: Cobramos uma taxa de R$5,00 por saque");

                    sc.nextLine();
                    System.out.println("Deseja sacar quanto? ");
                    double saque = sc.nextDouble();

                    Beneficiario1.saque(saque);
                    System.out.println("Saldo Atualizado: " + Beneficiario1.getSaldo());
                    break;


                case 3:
                    System.out.println("---ALTERAR NOME---");

                    sc.nextLine();
                    System.out.println("Digite o novo nome: ");
                    String nomeNovo = sc.nextLine();

                    Beneficiario1.setNomeBeneficiario(nomeNovo);
                    System.out.println("Dados Atualizados: Numero:" +  Beneficiario1.getNumero() + " Nome: " + Beneficiario1.getNomeBeneficiario());
                    break;


                case 4:
                    System.out.println("Dados Atuais: ");
                    System.out.println(Beneficiario1);
                    break;


                case 5:
                    System.out.println("Finalizando Programa");
                    continuar = false;
            }
        }

    sc.close();
    }

    public static int menu(Scanner sc) {

        System.out.println("-----Menu-----");
        System.out.println("1 - Deposito");
        System.out.println("2 - Saque");
        System.out.println("3 - Alterar nome beneficiario");
        System.out.println("4 - Mostrar Dados");
        System.out.println("5 - sair");

        return sc.nextInt();

    }
}
