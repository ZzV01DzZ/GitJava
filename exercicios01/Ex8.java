package exercicios01;

import java.util.Scanner;

/*8. O custo ao consumidor de um carro novo � a soma do custo de f�brica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao
consumidor.*/
public class Ex8 {

	public static void main(String[] args) {
		
		double fabrica, distribuidor, imposto, consumidor;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Valor de f�brica: ");
		fabrica = leia.nextInt();
		
		distribuidor = fabrica * 0.28;
		imposto = fabrica * 0.45;
		consumidor = fabrica + distribuidor + imposto;
		
		System.out.println("O custo ao consumidor � : " + consumidor);
		leia.close();
		
		
		
		
	}

}
