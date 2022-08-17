package somaVetor;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		double soma, media;
		
		System.out.print("Quantos números você vai digitar: ");
		n = sc.nextInt();
		
		double[] vet = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vet[i] = sc.nextDouble();
		}

		soma = 0;
		for (int i = 0; i < n; i++) {
			soma = soma + vet[i];
		}
		
		media = soma / n;
		
			System.out.print("Valores = ");
			
			for (int i = 0; i < n; i++) {
				System.out.printf("%.1f ", vet[i]);
			}
			
			System.out.printf("\nSoma = %.2f\n", soma);
			System.out.printf("Média = %.2f\n", media);
		
		sc.close();
		
	}

}
