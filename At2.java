package Exeção;

import java.util.Scanner;

public class At2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double x;
		
		try {
		System.out.println("Digite uma nota: ");
		x= ler.nextDouble();
		
		if(x>=6) {
		System.out.println("Você está aprovado: ");
		}
		else if (x<6 && x>=4) {
			System.out.println("Exame");
		}
		else 
		System.out.println("Reprovado");
		}
		catch(Exception erro) {
			System.out.println("informe um valor do tipo inteiro");
	
	}
          ler.close();
}
}