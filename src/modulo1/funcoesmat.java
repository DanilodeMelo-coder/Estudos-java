package modulo1;

public class funcoesmat {
    public static void main(String[] args){

        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double a, b ,c;

        //Raiz quadrada

        a= Math.sqrt(x);
        b= Math.sqrt(y);
        c= Math.sqrt(25.0);

        System.out.println("Raiz quadrada de " + x + " = " + a);
        System.out.println("Raiz quadrada de " + y + " = " + a);
        System.out.println("Raiz quadrada de 25 = " + c);

        //Potencialização

        a= Math.pow(x,y);
        b= Math.pow(x, 2.0);
        c= Math.pow(5.0,2.0);

        System.out.println(x + " elevado a " + y + " = " + a );
        System.out.println(x + " elevado 2.0  = " + b);
        System.out.println( "5.0 elevado 2.0 = " + c );

        //valor absoluto

        a= Math.abs(y);
        b= Math.abs(z);

        System.out.println("Valor absoluto de "+ y + " = " + a);
        System.out.println("Valor absoluto de "+ z + " = " + b);
    }
}
