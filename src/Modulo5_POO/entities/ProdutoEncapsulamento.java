package Modulo5_POO.entities;

public class ProdutoEncapsulamento {

    private String nome;
    private double preco;
    private int quantidade;

    /*Construtor - Obrigar o user a digitar nome e preço*/

    public ProdutoEncapsulamento(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    /*Construtor com sobrecarga - */
    public ProdutoEncapsulamento(String nome, double preco){

        this.nome = nome;
        this.preco = preco;
    }


    /*Get e Set*/

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double valorEmEstoque(){

        return preco * quantidade;
    }

    public void addEstoque(int quandidade){
        this.quantidade += quandidade;
    }

    public void removeEstoque(int quantidade){
        this.quantidade -= quantidade;
    }

    public String toString(){
        return "nome: " + nome + ", preço: " + String.format("%.2f" , preco)+ ", quantidade: " + quantidade + ", Valor em estoque: " + String.format("%.2f" , valorEmEstoque());
    }
}
