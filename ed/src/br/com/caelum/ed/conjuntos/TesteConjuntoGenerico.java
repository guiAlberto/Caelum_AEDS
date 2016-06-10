package br.com.caelum.ed.conjuntos;

public class TesteConjuntoGenerico
{
	public static void main(String[] args){
		ConjuntoEspalhamento conjunto = new ConjuntoEspalhamento();
		conjunto.adiciona("Rafael");
		conjunto.adiciona("Rafael");
		conjunto.adiciona("Ana");
		conjunto.adiciona("Paulo");
		System.out.println(conjunto.pegaTodas());
	}
}
