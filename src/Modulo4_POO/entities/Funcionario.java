package Modulo4_POO.entities;

public class Funcionario {
    public String nome;
    public double salarioBruto;
    public double taxa;


    public void incrementarSalario(double porcentagem){

        double porcentagemTratada = porcentagem/100;
       double porcentagemSalario = this.salarioBruto * porcentagemTratada;
       this.salarioBruto += porcentagemSalario;
    }

    public double salarioLiquido(){

        return salarioBruto - taxa;
    }

    public String toString(){

        return nome + ", $" + String.format("%.2f%n", salarioLiquido());
    }
}
