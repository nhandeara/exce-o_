package Exeção;

import java.util.Scanner;
public class Ex1 {

	public static void main(String[] args) {
	     int a,b, c;
	     Scanner leia= new Scanner (System.in);
	     a=10;
	     System.out.println("digite um número:");
	     b=leia.nextInt();
	     try {
	    	 c=a/b;
	    	 System.out.println("valo de C:" + c);
	     }catch (Exception erro) {
	    	 System.out.println("não existe divisão por zero.");
	    	 
	     }
	
	}

}
