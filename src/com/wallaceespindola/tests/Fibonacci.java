package com.wallaceespindola.tests;

import java.util.Date;

public class Fibonacci {

	public static void main(String[] args) {

		long inicio = System.currentTimeMillis();

		int duracaoFibo = 10;

		System.out.println("Iniciando fibonacci de [" + duracaoFibo + "]...");

		System.out.println("Inicio fibo [" + new Date() + "]");

		// teste do programa. Imprime os X primeiros termos
		// for (int i = 1; i <= duracaoFibo; i++) {
		int i = duracaoFibo;
		System.out.println("(" + i + "):" + Fibonacci.fibo(i) + "\t");
		// }

		System.out.println("Fim fibo [" + new Date() + "]");

		long fim = System.currentTimeMillis();

		long duracaoMillis = fim - inicio;

		long duracaoSegundos = duracaoMillis / 1000;

		long duracaoMinutos = duracaoSegundos / 60;

		long resto = duracaoSegundos % 60;

		System.out.println("Duracao fibonacci de [" + duracaoFibo + "] em segundos: " + duracaoSegundos);

		System.out.println("Duracao fibonacci de [" + duracaoFibo + "] em minutos: " + duracaoMinutos + " min e "
				+ resto + " seg");

	}

	static long fibo(int n) {
		// System.out.println("FIBO: " + n);
		return (n < 2) ? n : fibo(n - 1) + fibo(n - 2);
	}

	// http://www.devmedia.com.br/sequencia-de-fibonacci-em-java/23620#ixzz3jU9QWr00
}
