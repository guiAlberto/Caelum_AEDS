package br.com.caelum.ed.listasligadas.testes;

import br.com.caelum.ed.listasligadas.ListaLigada;

public class TestePegaPorPosicao {

	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		
		lista.adiciona("Rafel");
		lista.adiciona("Paulo");
		
		System.out.println(lista.pega(0));
		System.out.println(lista.pega(1));

	}

}
