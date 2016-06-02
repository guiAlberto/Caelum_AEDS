package br.com.caelum.ed;

public class Aluno {
	
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Aluno outro = (Aluno) obj;
		return this.nome.equals(outro.nome);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.nome;
	}

}
