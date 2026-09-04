import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in
		);
		
		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		double nota3 = sc.nextDouble();
		
		double media = (nota1 + nota2 +                     nota3)/ 3;
		String situacao = " ";
		
		if (media >= 7){
		    
		    situacao = "Aprovado";
		}
		else if(media >= 5 && media < 7){
		    
		    situacao = "Recuperação";	
		}
		else{
		    
		    situacao = "Reprovado";
		}
		
		System.out.printf("media: %.2f%n situação: %s ", media , situacao);
		
	}
}