import java.util.Scanner;

public class Main {
	
	public static class Produto{
	    
	    public String nome;
	    public double preco;
	    public int quantidade;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Produto p1, p2;
		p1 = new Produto();
		p2 = new Produto();
		
		
		/* Produto 1 */
		
		System.out.println("Digite o nome: ");
		p1.nome = sc.nextLine();
		
		System.out.println("Digite o valor: ");
		p1.preco = sc.nextDouble();
		
		System.out.println("Digite a quantidade: ");
		p1.quantidade = sc.nextInt();
		
		sc.nextLine();
		
		/*Produto 2 */
		
		System.out.println("Digite o nome: ");
		p2.nome = sc.nextLine();
		
		
		System.out.println("Digite o valor: ");
		p2.preco = sc.nextDouble();
		
		System.out.println("Digite a quantidade: ");
		p2.quantidade = sc.nextInt();
		
		
		double estoqueValorProd = calcularValorEstoqueP(p1);
		
		
		
		System.out.println("Produto: " + p1.nome);
		System.out.println("Valor: " + p1.preco);
		System.out.println("Quantidade: " + p1.quantidade);
		System.out.println("Valor de estoque: " + estoqueValorProd);
		
		
		
		double estoqueValorProd2 = calcularValorEstoqueP(p2);
		
				
		System.out.println("Produto: " + p2.nome);
		System.out.println("Valor: " + p2.preco);
		System.out.println("Quantidade: " + p2.quantidade);
		System.out.println("Valor de estoque: " + estoqueValorProd2);
		
		sc.nextLine();
		
		String produtoCMEstoque = maiorValorEstoq(p1, p2, estoqueValorProd, estoqueValorProd2 );
		
		System.out.println("Produto com maior valor de estoque: " + produtoCMEstoque);
		
	}
	
	
	public static double calcularValorEstoqueP(Produto p){
	    
	    return p.preco * p.quantidade;
	}
	
	public static String maiorValorEstoq(Produto p1, Produto p2, double x ,double y){
	    
	    if (x > y){
	        
	        return p1.nome;
	    }
	    else{
	        
	        return p2.nome;
	    }
	    
	}
	    
}