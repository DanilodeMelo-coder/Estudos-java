import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in
		);
		
		int x = sc.nextInt();
		
		int soma = 0;
		
		for(int i = 1; i <= x; i ++){
		    
		    int y = sc.nextInt();
		    
		    if(y % 2 == 0){
		        
		        soma += y;
		        
		    }
		    
		}
		
		System.out.println("soma: "+ soma);
	}
}