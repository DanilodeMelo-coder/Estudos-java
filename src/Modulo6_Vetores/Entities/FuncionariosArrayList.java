package Modulo6_Vetores.Entities;

import Modulo4_POO.entities.Funcionario;

public class FuncionariosArrayList {
    private int id;
    private String nome;
    private double salario;

    public FuncionariosArrayList(int id, String nome, double salario){
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    public void aumentoSalario(double porcentagem){

        double valorAumento = (porcentagem / 100) * salario;
        this.salario += valorAumento;
    }

    public String toString(){

        return "ID: " + id + "\n" + "NOME: " + nome + "\n" + "SALARIO: " + String.format("%.2f%n", salario);
    }
}
