package modulo1;

import java.util.Scanner;

public class Entradadados2 {
    public static void main(String[] args){

        //ler um texto ate a quebra de linha
        Scanner sc = new Scanner(System.in);

        int x;
        String s1, s2, s3;

        x = sc.nextInt();
        sc.nextLine(); //consumir a linha que o nextint da antes do nextline
        s1 = sc.nextLine(); //NEXTLINE para ler uma linha intereira
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("Dados Digitados: ");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }

}
