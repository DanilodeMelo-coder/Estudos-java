import java.util.Scanner;

public class Entradadados {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String x;
        x= sc.next();

        System.out.println(x);


        int y;
        y = sc.nextInt();
        System.out.println(y);

        double w;
        w = sc.nextDouble();
        System.out.println(w);

        char c;
        c = sc.next().charAt(2);
        System.out.println(c);
        sc.close();
    }
}
