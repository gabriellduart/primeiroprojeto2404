package estruturaRepeticao;

import java.util.Scanner;

public class atividade5 {

	public static void main(String[] args) {
		int funcionarios, salariofun=0,s,media=1;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de funcionarios q atuam na empresa: ");
		funcionarios = ler.nextInt();
		
		for (int i=1; i<=funcionarios; i++) {
			System.out.println("Informe o salario do funcionario: ");
			s = ler.nextInt();
		    salariofun+= s;	
		
		}
       
		media = salariofun/funcionarios;
		System.out.println("A media salarial da empresa é de: "+ media);
	    ler.close();
	
	} 

}
