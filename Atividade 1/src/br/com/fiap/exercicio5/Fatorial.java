package br.com.fiap.exercicio5;

import javax.swing.JOptionPane;

public class Fatorial {

	public static void main(String[] args) {
		
		int numero;
		int fatorial = 1;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para ser fatorado: "));
		
		/*
		 * Efetua calculo do fatorial
		 */
		if(numero == 0) {
			fatorial = 1;
		}
		else {
			for(int i = numero;i > 1;i--) {
				fatorial = fatorial * i;

			}
		}
		
		/*
		 * Imprime o fatorial do número digitado
		 */
		System.out.println(fatorial);
		
	}

}