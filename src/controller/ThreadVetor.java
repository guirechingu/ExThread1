package controller;

public class ThreadVetor extends Thread{
	private int valor, vetor[];
	public ThreadVetor(int valor, int vetor[]) {
		this.valor = valor;
		this.vetor = vetor;
	}
	
	@Override
	public void run() {
		percorreVetor(valor, vetor);
	}
	
	private void percorreVetor(int valor, int vetor[]) {
		if (valor == 1) {
			double tempoInicial = System.nanoTime();
			for(int m: vetor) {
				System.out.print(vetor[m] + " ");
			}
			System.out.println("");
			double tempoFinal = System.nanoTime();
			double tempoTotal = tempoFinal - tempoInicial;
			tempoTotal = tempoTotal / Math.pow(10, 9);
			System.out.println("\nforeach ==> "+tempoTotal+" nano segundos.\n");
		}
		if (valor == 2) {
			double tempoInicial = System.nanoTime();
			for(int i = 0; i<vetor.length; i++) {
				System.out.print(vetor[i] + " ");
			}
			System.out.println("");
			double tempoFinal = System.nanoTime();
			double tempoTotal = tempoFinal - tempoInicial;
			tempoTotal = tempoTotal / Math.pow(10, 9);
			System.out.println("\nfor normal ==> "+tempoTotal+" nano segundos.\n");
		}
	}
}
