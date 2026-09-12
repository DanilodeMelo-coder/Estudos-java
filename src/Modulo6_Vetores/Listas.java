package Modulo6_Vetores;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

        System.out.println("----------------------------");
        Lista.add(1);
        Lista.add(20);
        Lista.add(40);
        Lista.add(15);
        Lista.add(8);

        //Filtrar apenas os numeros divisiveis por 2
        List<Integer> resul = Lista.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
                //conerto para stream^     faço a expressao lambda^         e converto para lista novamente


        for (Integer x: resul){
            System.out.println(x);
        }

        System.out.println("----------------------------");
        List<String> nomes = new ArrayList<>();

        nomes.add("João");
        nomes.add("Maria");
        nomes.add("marcelo");
        nomes.add("danilo");
        nomes.add("lali");

        String nome = nomes.stream().filter(x-> x.charAt(0) == 'M').findFirst().orElse(null);
        //Procure na lista e me retorne o primeiro nome que encontrar com a letra M e se não encontra retorne null

        System.out.println(nome);
    }
}
