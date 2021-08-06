import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int n, dividendo, divisor;
		double elemento;
		int i = 0, iFatorial = 1;

		
		System.out.println("Por favor, informe quantos elementos da sequência deseja exibir: ");
		n = leitor.nextInt();

		
		while (i < n) {
			dividendo = 1;
			iFatorial = 1;
			while (iFatorial <= (i + 1)) {
				dividendo = dividendo * iFatorial;
				iFatorial = iFatorial + 1;
			}
			
			iFatorial = n - i;
			divisor = 1;
			while (iFatorial > 1) {
				divisor = divisor * iFatorial;
				iFatorial = iFatorial - 1;
			}
			
			elemento = dividendo / (double) divisor;
			System.out.print(elemento + ";");
			i++;
		}
		leitor.close();

	}

}
