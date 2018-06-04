package br.com.fiap.exercicio4;

import javax.swing.JOptionPane;

public class Calculadora {

	public static void main(String[] args) {

		int opcao;
		String operador;
		double numero1, numero2, resultado;

		opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero relativo a opera��o que deseja efetuar: "
				+ "\n1 - Adi��o" + "\n2 - Subtra��o" + "\n3 - Multiplica��o" + "\n4 - Divis�o"));
		numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro n�mero: "));
		numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segunda n�mero: "));

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
				JOptionPane.showMessageDialog(null, "N�o existe divis�o por zero!");
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
	 * M�todo respons�vel por realizar a opera��o escolhida
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
	 * Verifica se o n�mero � um inteiro ou n�o e o imprime
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