import java.util.Scanner;

public class ExercicioFibonacci {

	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		int n;
		int anterior1, anterior2, atual;
		anterior2 = 1;
		atual = 0;
		
		System.out.println("Digite a quantidade de elentos da sequencia de Fibonacci que quer exibir:");
		n = leitor.nextInt();
		
		for (int i=0; i<n; i++) {
			anterior1 = anterior2;
			anterior2 = atual;
			atual = anterior1 + anterior2;
			System.out.println(atual);
		}
		
		leitor.close();
	}

}
