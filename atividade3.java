package estruturaRepeticao;

import java.util.Scanner;

public class atividade3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int somaimpar =0, somapar =0,num =0;
		
		for (int i=1; i<=10; i++) {
         System.out.println("Informe um numero");
         num = ler.nextInt();
         
         if (num %2 == 0 ) {
        	 somapar++;
         }
         else {
        	 somaimpar++;
         }
		}
		System.out.println("A quantidade de numeross pares é: " + somapar);
        System.out.println("A quantidade de numeross impares é: " +somaimpar );
        ler.close();
	}
}