import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in );
		
		int maior = 0, x = 0;
		
		for (int i = 1; i <=5; i++){
		    
		    System.out.print("Digite um valor: ");
		     x = sc.nextInt();
		    
		    if (maior < x){
		        maior = x ;
		    }
		}
		
		System.out.println("Maior: " + maior);
		
	}
}