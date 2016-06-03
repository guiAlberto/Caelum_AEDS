package br.com.caelum.ed.vetores.testes;

import br.com.caelum.ed.Aluno;
import br.com.caelum.ed.vetores.Vetor;

public class TesteRemovePorObjeto {

	public static void main(String[] args) {
		Vetor vetor = new Vetor();
		
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno();
		Aluno a4 = new Aluno();
		Aluno a5 = new Aluno();
		Aluno a6 = new Aluno();
		
		a1.setNome("bla");
		a2.setNome("ble");
		a3.setNome("bli");
		a4.setNome("bli");
		a5.setNome("blo");
		a6.setNome("blu");
		
		vetor.adiciona(a1);
		vetor.adiciona(a2);
		vetor.adiciona(a3);
		vetor.adiciona(a4);
		vetor.adiciona(a5);
		vetor.adiciona(a6);
		
		System.out.println(vetor.toString());
		
		vetor.remove(a3);
		
		//Aparece todos os elementos, menos o "bli"
		System.out.println(vetor.toString());

	}

}
