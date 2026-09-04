import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int valorEntrada =sc.nextInt();
		
		int positivo = 0, negativo = 0, zero = 0;
		
		for (int i = 1; i <= valorEntrada; i++){
		    
		    System.out.println("Digite um valor: ");
		    
		    int x = sc.nextInt();
		    
		    if (x > 0){
		            positivo ++;
		        }
		        else if (x < 0){
		            negativo ++;
		        }
		        else{
		            zero ++;
		            }
		}
		
		
		System.out.println("Positivo: " + positivo);
		System.out.println("Negativo: " + negativo);
		System.out.println("Zero: " +  zero);	
		
		
	}
}