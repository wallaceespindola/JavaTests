package com.wallaceespindola.tests;

public class TesteRaphael {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!!!");
		
		Inverte inv = new Inverte();
		
//		Cachorro an1 = new Cachorro();
//		Passaro an2 = new Passaro();
//		an1.corre();
//		an2.voa();
//		
//		Imposto double = new ICMS(); // 18%
//		Imposto i2 = new ISS(); // 5%
//		i1.calcular(); //18%
//		i2.calcular(); //5%
		
		
		// INTEIROS
		int valor = 2; // 1, 2, 3, 214256546465
		byte b = 0; // 1, 2, 3, 127
		
		// DECIMAIS (PONTO FLUTUANTE)
		double d = 2.5; // 2.5, 1333.2354
		float f = 0.0f; // 2.5
		
		char c;
				
		int soma = valor+valor;
		System.out.println("soma: " + soma);
		
		encapsulamento(valor);
		
		//database.conectar();
		
		switch (valor) {
		case 1:
		case 2:
		case 3:
			System.out.println("entrou no 3");
			break;
		case 4:
			System.out.println("entrou no 4");
			break;
		default:
			System.out.println("default, nao achei");
			break;
		}
		
		for (int i = 0; i < args.length; i++) {
			
		}
		
		metodoSemParametros();
	}

	private static void encapsulamento(int valor) {
		
		boolean bool = false; // true or false
		if( !bool ) {
			System.out.println("é verdadeiro");
		} else if (valor != 2) {
			System.out.println("a igual 2");
		} else if (valor == 3) {
			System.out.println("a igual 3");
		} else if (valor == 4) {
			System.out.println("a igual 4");
		} else if (valor == 5) {
			System.out.println("a igual 2");
		} else if (valor == 6) {
			System.out.println("a igual 2");
		} else {
			System.out.println("é falso");
		}
	}

	private static void metodoSemParametros() {
		System.out.println("sem parametros");
	}
}
