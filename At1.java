package Exeção;

import java.util.ArrayList;

public class At1 {

	public static void main(String[] args) {
		
		try {
			ArrayList<String>nomes = new ArrayList<>();
			nomes.add("alice");
			nomes.add("Bob");
			nomes.add("Charlie");
		System.out.println("nome: " + nomes.get(5));
		
		}
		catch (Exception erro) {
			System.out.println("o nome da ultima posição é:");
			
		}
		
	}
}
