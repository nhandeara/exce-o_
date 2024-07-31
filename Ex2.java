package Exeção;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
				int a=0,b=0;
		
		try {
		System.out.println("informe o primeiro valor: ");
		a=ler.nextInt();
		
		System.out.println("informe o segundo valor: ");
		b=ler.nextInt();
		System.out.println("Resultados ");
		System.out.println("soma: "+(a+b));
		System.out.println("subtração "+(a-b));
		System.out.println("multiplicação "+(a*b));
		System.out.println("divisão inteira"+(a%b));
		System.out.println("divisão exata" +((double) a/b));
				}
		catch(Exception erro) {
			System.out.println("informe um valor do tipo inteiro");
			System.exit(0);
		}
		
      
		ler.close();
		
	}

}
