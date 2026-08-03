package Modulo2;

import java.util.Scanner;

public class aula1 {
    public static  void main(String[] args){

        // && = E
        // || = ou
        // ! = não

        Scanner sc = new Scanner(System.in);

        String dia, tarde, noite;

        int hora = sc.nextInt();

        dia = "Bom dia";
        tarde = "Boa tarde";
        noite = "Boa noite";

        if (hora < 12){
            System.out.println(dia);
        }
        else if (hora <=18) {
            System.out.println(tarde);

        }
        else if (hora > 18){
            System.out.println(noite);
        }


    }
}
