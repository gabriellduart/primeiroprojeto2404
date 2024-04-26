package estruturaRepeticao;

import java.util.Scanner;

public class atividade2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double v,m,som=0;
		
		for (double i=0; i<=4; i++) {
			System.out.println("Informe o valor");
			v = ler.nextDouble();
			som+= v;
			
		}
		m = som/5;
		System.out.println("sua média foi: " + m);
		ler.close();

	}

}
