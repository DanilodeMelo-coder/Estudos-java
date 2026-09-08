package Modulo6_Vetores;

import org.w3c.dom.ls.LSOutput;

public class Boxing_Unboxing_Wrapper {
    public static void main(String[] args) {

        //Sem Wrapper
        /*
        int x = 20;

        Object obj = x;


        System.out.println(obj);

        int y = (int) obj;

        System.out.println(y);

         */


        //Com Wrapper

        int x = 20;

        Integer obj = x;


        System.out.println(obj);

        int y = obj;

        System.out.println(y);
    }
}
