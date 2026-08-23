package Modulo4_POO.entities;

public class Aluno {
    public String nome;
    public double notaT1;
    public double notaT2;
    public double notaT3;

    public double mediaFinal(){

        return notaT1 + notaT2 + notaT3;
    }

    public String passORfailed(){

        double mediaAluno = mediaFinal();

        if (mediaAluno >= 60.00){

            return "Passou de ano, Parabêns!!";
        }
        else{
            double pontosfaltantes = Math.abs(mediaAluno - 60.00);

            return "Você não Passou de ano! - Faltou: " + String.format("%.2f", pontosfaltantes) + " Pontos!";
        }

    }

    public String toString(){

        return "Media final: " + String.format("%.2f%n", mediaFinal()) + passORfailed();
    }
}
