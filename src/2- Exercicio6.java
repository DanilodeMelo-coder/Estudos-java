import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int x = sc.nextInt();
		
		int maior = x;
		int menor = x;
		
		for (int i = 1; i < n; i++){
		    
		    x = sc.nextInt();
		    
		    if(maior < x){
		        maior = x;
		    }
		    
		    if (menor > x){
		        menor = x;
		    }
		    
		}
		
		
		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);
		
	}
}