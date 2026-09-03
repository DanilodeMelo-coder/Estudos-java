package Modulo5_POO.entities;

public class Produto {

    public String nome;
    public double preco;
    public int quantidade;

    /*Construtor - Obrigar o user a digitar nome e preço*/
    public Produto(String nome, double preco, int quantidade){

        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    /*Construtor com sobrecarga - */
    public Produto(String nome, double preco){

        this.nome = nome;
        this.preco = preco;
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
