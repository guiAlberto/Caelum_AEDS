package br.com.caelum.ed.filas;
import br.com.caelum.ed.*;

public class TesteFilaGenericaParametrizada
{
	public static void main(String[] args){
		FilaParametrizada<Aluno> filaDeAlunos = new FilaParametrizada<>();
		Aluno aluno = new Aluno();

		filaDeAlunos.insere(aluno);

		Aluno alunoRemovido = filaDeAlunos.remove();

		if(!aluno.equals(alunoRemovido)){
			System.out.println("Erro: o aluno inserido não é igual ao aluno removido");
		}

		if(!filaDeAlunos.vazia()){
			System.out.println("Erro: A fila não está vazia");
		}
		
		FilaParametrizada<String> filaDeStrings = new FilaParametrizada<>();

		filaDeStrings.insere("Diana");
		filaDeStrings.insere("Joaquim");
		
		filaDeStrings.remove();
		filaDeStrings.remove();
	}
}
