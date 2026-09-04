import java.util.Scanner;

public class Main {
	
	
	public static class Pessoa{
	    
	    public String nome;
	    public int idade;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Pessoa p1, p2;
		p1 = new Pessoa();
		p2 = new Pessoa();
		
		System.out.println("Digite o nome da pessoa 1: ");
		p1.nome = sc.nextLine();
		
		System.out.println("Digite a idade da pessoa 1: ");
		p1.idade = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Digite o nome da pessoa 2: ");
		p2.nome = sc.nextLine();
		
		System.out.println("Digite a idade da pessoa 2: ");
		p2.idade = sc.nextInt();
		
				
		String maisVelho = checarMaisVelho(p1 , p2);
		
		System.out.println("A pessoa mais velha é: " + maisVelho);				
										
	}
	
	
	public static String checarMaisVelho(Pessoa p1, Pessoa p2){
	    
	    if (p1.idade > p2.idade){
	     
	        return p1.nome;   
	    }
	    else{
	     
	        return p2.nome;   
	    }
	    
	}
}