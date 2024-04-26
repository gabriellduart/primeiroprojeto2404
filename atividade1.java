package estruturaRepeticao;

import java.util.Scanner;

public class atividade1 {

	public static void main(String[] args) {
		int numero;

		Scanner ler = new Scanner(System.in);

		System.out.println("informe o numero:");
		numero = ler.nextInt();

		for(int i=numero; i<=numero; i++) {
			if (numero % 2 == 0) {
				System.out.println("O numero é par");
			}
			else {
				System.out.println("o numero é impar");
			}
		}
	}


}
