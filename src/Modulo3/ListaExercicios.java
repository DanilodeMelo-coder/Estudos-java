package Modulo3;

import java.util.Scanner;

public class ListaExercicios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //exercicio 1

        int x = sc.nextInt();

        for(int i = 1; i <= x; i++){

            if (i % 2 != 0){
                System.out.println(i);
            }
        }

        //execicio 2

        int n = sc.nextInt();

        int in = 0;
        int  out = 0;

        for (int i = 1; i <= n; i++){

            int y = sc.nextInt();

            if (y >= 10 && y <= 20){
                in ++;
            }
            else{
                out ++;
            }
        }

        System.out.println("In: " + in);
        System.out.println("Out: " + out);

        //Exercicio 3

        int p = sc.nextInt();
        double  mediaP = 0;

        for (int i = 1; i <= p; i++){

            double y = sc.nextDouble(),k = sc.nextDouble(),z = sc.nextDouble();

            mediaP = ((y * 2) + (k * 3) + (z * 5)) / (2 + 3 + 5);

            System.out.printf("%.2f%n", mediaP);

        }

        // Exercicio 4

        int t = sc.nextInt();
        double  divisaoP = 0;

        for (int i = 1; i <= t; i++){

            double f = sc.nextDouble(),g = sc.nextDouble();

            divisaoP = f / g;

            if ( f == 0 || g == 0){
                System.out.println("Divisão impossivel");
            }
            else{
                System.out.println(divisaoP);
            }
        }

        //Exercicio 5

        int valorFat = sc.nextInt();
        long fat = 1;

        for (int i = 1; i <= valorFat; i ++){

            fat *= i;

        }

        System.out.println(fat);


        //Exercicio 6

        int valorDiv = sc.nextInt();

        for (int i = 1; i <= valorDiv; i++){

            if (valorDiv % i == 0){

                System.out.println(i);
            }
        }

        //Exercicio 7

        int varE7 = sc.nextInt();


        for (int i = 1; i <= varE7; i++ ){


            int primeiro = i;
            int segundo = i * i;
            int terceiro = i * i * i;

            System.out.printf("%d %d %d%n",primeiro, segundo, terceiro);

        }




        sc.close();
    }
}
