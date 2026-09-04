import java.util.Scanner;

public class Main {
	
	
	public static class Pessoa{
		   public String nome;
		   public int idade;
		   public int cpf;
    	}	   
		   
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		Pessoa a;
		a = new Pessoa();
		    
		System.out.println("Digite o nome da pessoa: ");
		a.nome = sc.nextLine();
		System.out.println("Digite a idade da pessoa: ");
		a.idade = sc.nextInt();
		System.out.println("Digite o cpf da pessoa: ");
		a.cpf = sc.nextInt();
		
		System.out.println(a.nome);
	}
}