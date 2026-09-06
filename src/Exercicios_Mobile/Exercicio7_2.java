package Exercicios_Mobile;

import java.util.Scanner;

public class Exercicio7_2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		int maior = x;
		int segundoMaior = x;
		
		for (int i = 1; i < 5; i++){
		  
		    x = sc.nextInt();
		    
		    if (x > maior){
		        segundoMaior = maior;
		        maior = x;
		    }
		    else{
		        if(x > segundoMaior){
		            segundoMaior= x;
		        }
		    }
		}
		
		System.out.println("Maior: " + maior);
		System.out.println("Segundo Maior: " + segundoMaior);
		
		
	}
}