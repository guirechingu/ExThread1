package view;

import java.util.Random;

import controller.ThreadVetor;

public class Main {

	public static void main(String[] args) {
		Random gerador = new Random();
		int vetor[] = new int[1000];
		for (int i = 0; i<1000; i++) {
			vetor[i] = gerador.nextInt(100) + 1;
		}
		Thread tVetor = new ThreadVetor(1, vetor);
		tVetor.start();
		
		Thread tVetor2 = new ThreadVetor(2, vetor);
		tVetor2.start();
	}

}
