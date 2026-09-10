package Modulo6_Vetores;

import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args){


        //Declarando a Lista
        List<Integer> Lista = new ArrayList<>();

        //adicionando na lista: ADD
        Lista.add(1);
        Lista.add(2);
        Lista.add(3);
        Lista.add(4);
        Lista.add(5);


        //Adicionando por posição: ADD + Sobrecarga
        Lista.add(2, 10);

        //Ver o tamanho da lista
        System.out.println("Tamnho da lista: " + Lista.size());

        //Removendo da lista: REMOVE
        Lista.remove(1);



        System.out.println("");


        for(Integer num: Lista){
            System.out.println(num);
        }
        System.out.println("----------------------------");

        //Removendo por Predicado: REMOVEIF
        Lista.removeIf(num -> num % 2 != 0);

        for(Integer num: Lista){
            System.out.println(num);
        }

        System.out.println("----------------------------");

        //Procurando item na lista: Indexof
        System.out.println("Index: " + Lista.indexOf(4));


    }
}
