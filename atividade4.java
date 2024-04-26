package estruturaRepeticao;

import java.util.Scanner;

public class atividade4 {

	public static void main(String[] args) {
		int fat=1,num;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe um numero: ");
		num = ler.nextInt();
		System.out.println(" ");
		
		for (int i=1; i<=num; i++) {
			fat *=i;
			System.out.println(i + "!=" + fat);
		}
ler.close();
	}

}
