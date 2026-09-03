package Modulo5_POO.entities;

public class contaBancariaEntitie {

    private int numero;
    private String nomeBeneficiario;
    private double saldo;


    public static final double TAXA_SAQUE = 5.00;


    public contaBancariaEntitie(int numero, String nome, double saldo){
        this.numero = numero;
        this.nomeBeneficiario = nome;
        this.saldo = saldo;
    }

    public contaBancariaEntitie(int numero, String nome){
        this.numero = numero;
        this.nomeBeneficiario = nome;
    }

    //GET NUMERO
    public int getNumero() {
        return numero;
    }

    //GET E SET NOME


    public String getNomeBeneficiario() {
        return nomeBeneficiario;
    }

    public void setNomeBeneficiario(String nomeBeneficiario) {
        this.nomeBeneficiario = nomeBeneficiario;
    }

    //SALDO
    public double getSaldo() {
        return saldo;
    }

    public void depositarSaldo(double saldo){

        this.saldo += saldo;

    }

    public void saque(double saque){

        this.saldo -= saque + TAXA_SAQUE;
    }

    public String toString(){
        return "numero da conta: " + numero + ", Nome Beneficiario: " + nomeBeneficiario + ", Saldo: " + String.format("%.2f", saldo);
    }


}
