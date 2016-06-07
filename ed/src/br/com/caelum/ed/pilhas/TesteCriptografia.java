package br.com.caelum.ed.pilhas;

import java.util.Scanner;

public class TesteCriptografia {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String message;
		String cryptographedMessage;
		String decryptographedMessage;
		
		System.out.print("Insira sua mensagem não criptografada: ");
		message = scanner.nextLine();
		
		cryptographedMessage = Cryptography.encriptContent(message);
		System.out.println("Mensagem criptografada: " + cryptographedMessage);
		
		decryptographedMessage = Cryptography.decriptContent(cryptographedMessage);
		System.out.println("Mensagem descriptografada: " + decryptographedMessage);

		scanner.close();
	}

}
