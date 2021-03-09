package revisaozinha05.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main tururu = new Main();
		tururu.linkstartu();
	}

	private void linkstartu() {
		Scanner scan = new Scanner(System.in);
		int valor = 1;
		while (valor != 0) {
			System.out.println("chuta um numero!(0 pra sair)");
			valor = scan.nextInt();
			switch (valor) {
			case 1:
				System.out.println("uau cagao da porra acerto mizeravi");
				break;
			case 4:
				System.out.println("uau acertou a pedra secreta no seu caminho... incredible");
				break;
			case 0:
				System.out.println("flw cuzao!");
				break;

			default:
				System.out.println("nope tenta denovo seu linxo.");
				break;
			}
		}
	}

}
