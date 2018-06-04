package br.com.fiap.exercicio4;

import javax.swing.JOptionPane;

public class Calculadora {

	public static void main(String[] args) {

		int opcao;
		String operador;
		double numero1, numero2, resultado;

		opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite o número relativo a operação que deseja efetuar: "
				+ "\n1 - Adição" + "\n2 - Subtração" + "\n3 - Multiplicação" + "\n4 - Divisão"));
		numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: "));
		numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segunda número: "));

		switch (opcao) {
		case 1:
			operador = "+";
			resultado = realizarOperacao(numero1, numero2, operador);
			imprimirResultado(resultado);
			break;
		case 2:
			operador = "-";
			resultado = realizarOperacao(numero1, numero2, operador);
			imprimirResultado(resultado);
			break;
		case 3:
			operador = "*";
			resultado = realizarOperacao(numero1, numero2, operador);
			imprimirResultado(resultado);
			break;
		case 4:
			if (numero2 == 0) {
				JOptionPane.showMessageDialog(null, "Não existe divisão por zero!");
				break;
			}
			operador = "/";
			resultado = realizarOperacao(numero1, numero2, operador);
			imprimirResultado(resultado);
			break;
		default:
			break;
		}

	}

	/*
	 * Método responsável por realizar a operação escolhida
	 */
	public static double realizarOperacao(double numero1, double numero2, String operador) {
		double resultado = 0;

		if (operador.equals("+")) {
			resultado = numero1 + numero2;
		} else if (operador.equals("-")) {
			resultado = numero1 - numero2;
		} else if (operador.equals("*")) {
			resultado = numero1 * numero2;
		} else if (operador.equals("/")) {
			resultado = numero1 / numero2;
		}

		return resultado;
	}

	/*
	 * Verifica se o número é um inteiro ou não e o imprime
	 */
	private static void imprimirResultado(double resultado) {

		if ((int) resultado == resultado) {
			int resultadoInteiro = (int) resultado;
			JOptionPane.showMessageDialog(null, "Resultado: " + resultadoInteiro);
		} else {
			JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
		}

	}

}