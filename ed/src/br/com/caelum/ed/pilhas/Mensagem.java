package br.com.caelum.ed.pilhas;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Mensagem {
	private List<String> mensagem = new LinkedList<String>();

	public void adicionarPalavras(String[] palavras) {
		for (String palavra : palavras) {
			mensagem.add(palavra);
		}
	}

	public List<String> criptografar() {
		List<String> resultado = new LinkedList<>();
		for (String palavra : this.mensagem) {
			StringBuilder stringBuilder = new StringBuilder();
			Stack<Character> stack = new Stack<>();
			for (int i = 0; i < palavra.length(); i++) {
				stack.push(palavra.charAt(i));
			}
			while (!stack.isEmpty()) {
				stringBuilder.append(stack.pop());
			}
			resultado.add(stringBuilder.toString());
		}
		return resultado;
	}
}
