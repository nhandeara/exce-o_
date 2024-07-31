package Exeção;

import java.util.Scanner;

public class At3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
				double v1= 0, v2=0, v3=0;
				
				System.out.print("informe o valor 1: ");
				v1 = ler.nextDouble();
				
				System.out.print("informe o valor 2: ");
				v2 = ler.nextDouble();
				
				System.out.print("informe o valor 3: ");
				v3 = ler.nextDouble();
				
				if(v1==v2 && v1==v3)
					System.out.print("Todos iguais");
				else if (v1 > v2 && v1>v3)
					System.out.print("O primeiro valor é maior" + v1);
				
				else if (v2 > v3)
					System.out.print("O segundo valor é maior" + v2);
				else
					System.out.print("O terceiro valor é maior" + v3);
				
				ler.close();

	}

}
