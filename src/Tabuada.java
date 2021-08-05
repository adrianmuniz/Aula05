import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int n; 
		int res;
		
		System.out.println("Informe o valor do qual deseja a tabuada.");
		n = leitor.nextInt();
		for (int i=0; i<=10; i++) {
			res = n * i;
			System.out.println(n + " x " + i + " = " + res);
		}

		leitor.close();
	}

}
