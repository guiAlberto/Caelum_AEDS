package br.com.caelum.ed.vetores.testes;

import br.com.caelum.ed.Aluno;
import br.com.caelum.ed.vetores.Vetor;

public class TesteLimpaVetor {
	
	public static void main(String[] args) {
		Vetor vetor = new Vetor();
				
		for(int i = 0; i < 1000; i++){
			vetor.adiciona(new Aluno());
		}
		
		System.out.println(vetor.tamanho());
		
		vetor.clear();
		
		System.out.println(vetor.tamanho());
	}
	
}
