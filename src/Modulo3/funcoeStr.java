package Modulo3;

import javax.print.DocFlavor;

public class funcoeStr {
    public static void main(String[] args){

        String original = "  abcd FGHI jklm NOPQ  ";

        String s1 = original.toLowerCase();
        String s2 = original.toUpperCase();
        String s3 = original.trim();
        String s4 = original.substring(8);
        String s5 = original.substring(5,9);
        String s6 = original.replace('a', '?' );
        String s7 = original.replace("abcd", "????");
        int i = original.indexOf("jk");
        int j = original.lastIndexOf("jk");

        System.out.println("Original: -" + original + "-");
        System.out.println("ToLowercase: -" + s1 + "-"); //Tudo minusculo
        System.out.println("toUppercase: -" + s2 + "-"); //Tudo maisculo
        System.out.println("trim: -" + s3 + "-"); //Remover espaços das pontas
        System.out.println("substring(2): -" + s4 + "-"); //montar uma nova string a partir de um indice
        System.out.println("substring(5,9): -" + s5 + "-"); //montar uma nova string a partir de um indice inicio e final
        System.out.println("replace('a','?'): -" + s7 + "-"); //Fazer trocas entre dois caracteres
        System.out.println("replace('abcd','?'): -" + s7 + "-");
        System.out.println("IndexOf: "+ i);
        System.out.println("LastIndexOf: "+i);

        System.out.println();
        //FUNÇÃO SPLIT

        String s = "batata, cenoura, macarrão, bolo";

        String[] vect = s.split(",");

        String w1 = vect[0];
        String w2 = vect[1];
        String w3 = vect[2];
        String w4 = vect[3];

        System.out.println("Listas: "+ s);
        System.out.println(w1);
        System.out.println(w2);
        System.out.println(w3);
        System.out.println(w4);
    }
}
