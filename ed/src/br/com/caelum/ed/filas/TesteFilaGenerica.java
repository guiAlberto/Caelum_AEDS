package br.com.caelum.ed.filas;
import br.com.caelum.ed.*;

public class TesteFilaGenerica
{
	public static void main(String[] args){
		FilaGenerica filaDeAlunos = new FilaGenerica();
		Aluno aluno = new Aluno();
		
		filaDeAlunos.insere(aluno);
		
		Object alunoRemovido = filaDeAlunos.remove();
		
		if(!aluno.equals(alunoRemovido)){
			System.out.println("Erro: o aluno inserido não é igual ao aluno removido");
		}
		
		if(!filaDeAlunos.vazia()){
			System.out.println("Erro: A fila não está vazia");
		}
	}
}
