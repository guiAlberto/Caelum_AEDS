package br.com.caelum.ed.conjuntos;

import java.util.List;

public class TesteContem {

	public static void main(String[] args) {
		ConjuntoEspalhamento conjunto = new ConjuntoEspalhamento();
		conjunto.adiciona("Rafael");
		conjunto.adiciona("Ana");
		conjunto.adiciona("Paulo");
		System.out.println(conjunto.contem("Rafael"));
		System.out.println(conjunto.contem("Guilherme"));

		conjunto.remove("Rafael");
		System.out.println(conjunto.contem("Rafael"));

	}

}
