package br.com.caelum.ed.vetores.testes;

import java.util.ArrayList;
import java.util.Vector;

import br.com.caelum.ed.Aluno;
import br.com.caelum.ed.vetores.Vetor;

public class TesteAPIs {

	public static void main(String[] args) {
		// Teste para a classe Vetor
		Vetor vetor = new Vetor();

		System.out.println(vetor.tamanho());

		for (int i = 0; i < 1000; i++) {
			Aluno aluno = new Aluno();
			vetor.adiciona(aluno);
		}

		System.out.println(vetor.tamanho());

		// Teste para a classe Vector
		Vector<Aluno> vector = new Vector<>();

		System.out.println(vector.size());

		for (int i = 0; i < 1000; i++) {
			vector.add((Aluno) vetor.pega(i));
		}

		System.out.println(vector.size());
		
		// Teste para a classe Vector
		ArrayList<Aluno> arrayList = new ArrayList<>();
		
		System.out.println(arrayList.size());
		
		for(int i = 0; i < 1000; i++){
			arrayList.add(vector.get(i));
		}
		
		System.out.println(arrayList.size());
	}

}
