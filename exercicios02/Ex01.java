package exercicios02;

import java.util.Scanner;

/*1- Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.*/
public class Ex01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.println("Digite o primeiro n�mero: ");
		n1 = leia.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		n2 = leia.nextInt();
		
		System.out.println("Digite o terceiro n�mero: ");
		n3 = leia.nextInt();
		
		if(n1 > n2 && n1 > n3){
			System.out.println(n1 + " � o maior");
		}
		
		else if(n2 > n3){
			System.out.println(n2 + " � o maior");	
		}
		else{
			System.out.println(n3 + " � o maior");
	    }
	}
}