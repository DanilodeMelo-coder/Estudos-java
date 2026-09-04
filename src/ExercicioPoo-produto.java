import java.util.Scanner;

public class Main {
	
	public static class Produto{
	    
	   public String nome;
	   public double preco;
	   public int quantidade;
    }
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Produto x;
		x = new Produto();
		
		
		System.out.println("Digite o nome do produto: ");
		x.nome = sc.nextLine();
		System.out.println("Digite o valor do produto: ");
		x.preco = sc.nextDouble();
		System.out.println("Digite a quantidade do produto: ");
		x.quantidade = sc.nextInt();
		
		System.out.println("Nome: " + x.nome);
		System.out.println("Preço: " + x.preco);
		System.out.println("Quantidade: " + x.quantidade);
		
		double valorEstoqueProd = valorEstoqueP(x.quantidade, x.preco);
		
		System.out.println("Valor do estoque: " + valorEstoqueProd);
	}
	
	    public static double           valorEstoqueP(int quant, double preco){
	        
	      double valorEstoque = quant * preco;
	        
	    
	    return valorEstoque;	    
	    }
	
	
	
}