package br.com.caelum.ed.vetores.testes;

import br.com.caelum.ed.Aluno;
import br.com.caelum.ed.vetores.Vetor;

public class TesteLastIndexOf {

	public static void main(String[] args) {
		Vetor vetor = new Vetor();

		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno();
		Aluno a4 = new Aluno();
		Aluno a5 = new Aluno();

		a1.setNome("bla");
		a2.setNome("ble");
		a3.setNome("bli");
		a4.setNome("blo");
		a5.setNome("blu");

		vetor.adiciona(a1);
		vetor.adiciona(a2);
		vetor.adiciona(a2);
		vetor.adiciona(a3);

		System.out.println(vetor.lastIndexOf(a2));
		System.out.println(vetor.lastIndexOf(a4));

	}

}
