package br.com.caelum.ed.pilhas;

import java.util.Scanner;

public class TesteCriptografia {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Insira sua mensagem");
		String texto = scanner.nextLine();
		String[] palavras = texto.split(" ");
		
		Mensagem mensagem = new Mensagem();
		mensagem.adicionarPalavras(palavras);
		
		System.out.println(mensagem.criptografar().toString());
		
		scanner.close();
	}

}
