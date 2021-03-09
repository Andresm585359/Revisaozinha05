package revisaozinha05.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main tururu = new Main();
		tururu.linkstartu();
	}

	private void linkstartu() {
		for (int i = 0; i <= 5; i++) {
			switch (i) {
			case 1:
				System.out.println("uau cagao da porra acerto mizeravi");
				break;
			case 4:
				System.out.println("uau acertou a pedra secreta no seu caminho... incredible");
				break;

			default:
				System.out.println("nope tenta denovo seu linxo.");
				break;
			}
		}
	}

}
