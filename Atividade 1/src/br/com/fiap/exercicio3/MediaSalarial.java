package br.com.fiap.exercicio3;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class MediaSalarial {

	public static void main(String[] args) {

		double total = 0;
		double media = 0;
		int qtdFuncionarios;
		DecimalFormat decimal = new DecimalFormat("0.00");

		qtdFuncionarios = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de funcionários: "));

		double[] funcionarios = new double[qtdFuncionarios];

		/*
		 * Popula o array com os salários dos funcionários
		 */
		for (int i = 0; i < funcionarios.length; i++) {
			funcionarios[i] = Double
					.parseDouble(JOptionPane.showInputDialog(null, "Digite o salário do funcionário: " + (i + 1)));
		}

		for (int j = 0; j < funcionarios.length; j++) {
			total = total + funcionarios[j];
		}

		media = total / qtdFuncionarios;

		/*
		 * Imprime a média salarial com precisão de 2 casas decimais
		 */
		System.out.println("A média salarial da empresa é: " + decimal.format(media));

	}

}