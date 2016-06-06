package br.com.caelum.ed.pilhas;

import br.com.caelum.ed.Peca;

//Nome inserido não condiz com o da apostila pelo fato da classe
// PilhaGenerica já existir
public class TestePilhaGenericaParametrizada {

	public static void main(String[] args) {
		PilhaParametrizada<Peca> pilhaDePecas = new PilhaParametrizada<Peca>();

		Peca peca = new Peca();
		pilhaDePecas.insere(peca);

		Peca pecaRemovida = pilhaDePecas.remove();

		if (peca != pecaRemovida) {
			System.out.println("Erro: a peça removida não é igual a que foi inserida");
		}

		if (!pilhaDePecas.vazia()) {
			System.out.println("Erro: a pilha não está vazia");
		}

		PilhaParametrizada<String> pilhaDeString = new PilhaParametrizada<>();
		
		pilhaDeString.insere("Manoel");
		pilhaDeString.insere("Zuleide");
		
		System.out.println(pilhaDeString.remove());
		System.out.println(pilhaDeString.remove());
	}

}
