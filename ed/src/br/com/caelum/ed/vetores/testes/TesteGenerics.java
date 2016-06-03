package br.com.caelum.ed.vetores.testes;

import java.util.ArrayList;

import br.com.caelum.ed.Aluno;

public class TesteGenerics {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		
		arrayList.add("bla");
		arrayList.add("ble");
		arrayList.add("bli");
		arrayList.add("blo");
		arrayList.add("blu");
		
		Aluno aluno = new Aluno();
		aluno.setNome("Zé");
		
		// O método abaixo dá pau
//		arrayList.add(new Aluno());
		
		//Porém o método .toString() da classe Aluno permite a operação
		arrayList.add(aluno.toString());
		
		arrayList.remove(5);

	}

}
