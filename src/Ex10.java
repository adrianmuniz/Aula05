import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		String nome, setor;
		int ultimoDigito = 0;
		int conducao = 0;
		
		for(int i=1; i<=150; i++) {
		System.out.print("Informe o nome do " + 1 + "º funcionário: ");
		nome = leitor.next();
		System.out.print("Agora, informe seu setor do " + i + "º funcionário: ");
		setor = leitor.next();
		System.out.print("Digite 1 se o funcionário utiliza CARRO e 2 se utiliza ONIBUS: ");
		conducao = leitor.nextInt();
		if(conducao == 1){ 
			System.out.print("Por fim, o ultimo dígito da placa: ");
			ultimoDigito = leitor.nextInt();
			switch(ultimoDigito) {
			case 1:
			case 2:
				System.out.println("Segunda-Feira");
				break;
			case 3:
			case 4:
				System.out.println("Terça-Feira");
				break;
			case 5:
			case 6:
				System.out.println("Quarta-Feira");
				break;
			case 7:
			case 8:
				System.out.println("Quinta-Feira");
				break;
			case 9:
			case 0:
				System.out.println("Sexta-Feira");
				break;
			}
		} else {
			if(conducao == 2) {
				System.out.println("Rodizio não aplicavel!");
			}else {
				System.out.println("Número inválido");
			}
		}
		}
	}
}
