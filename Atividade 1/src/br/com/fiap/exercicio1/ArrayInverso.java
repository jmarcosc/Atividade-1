package br.com.fiap.exercicio1;

public class ArrayInverso {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3 };

		System.out.println("EXERCÍCIO 1\n");

		System.out.println("Array de entrada: ");
		imprimir(array);

		System.out.println("\nArray invertido: ");
		inverter(array);

	}

	/*
	 * Método responsável por imprimir um array na ordem inicial
	 */
	private static void imprimir(int[] array) {

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

	/*
	 * Método responsável por imprimir um array na ordem inversa
	 */
	private static void inverter(int[] array) {

		for (int j = array.length - 1; j >= 0; j--) {
			System.out.print(array[j] + " ");
		}

	}

}