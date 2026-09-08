package Modulo6_Vetores.Entities;

public class Estudantes {
    private String nome;
    private String email;
    private int quarto;

    public Estudantes(String nome, String email, int quarto) {
        this.nome = nome;
        this.email = email;
        this.quarto = quarto;
    }

    public String getName() {
        return nome;
    }

    public void setName(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getQuarto() {
        return quarto;
    }

    public void setQuarto(int quarto) {
        this.quarto = quarto;
    }

    public String toString(){

        return quarto + ": " + nome + ", " + email;
    }
}
