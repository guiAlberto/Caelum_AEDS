package br.com.caelum.ed.filas;
import br.com.caelum.ed.*;

public class TesteFilaParametrizadaComArrayList
{
	public static void main(String[] args){
		System.out.println("Fila com LinkedList");
		Long inicio = System.currentTimeMillis();
		int qntAlunos = 100000;
		FilaParametrizada<Aluno> filaParametrizada = new FilaParametrizada<>();
		for(int i = 0; i < qntAlunos; i++){
			Aluno aluno = new Aluno();
			filaParametrizada.insere(aluno);
		}
		Long fim = System.currentTimeMillis();
		System.out.print("Tempo para adicionar " + qntAlunos + " alunos: ");
		System.out.println((fim - inicio) + "ms");
		
		inicio = System.currentTimeMillis();
		while(!filaParametrizada.vazia()){
			filaParametrizada.remove();
		}
		fim = System.currentTimeMillis();
		System.out.print("Tempo para remover todos os alunos da fila: ");
		System.out.println((fim - inicio) + "ms");
		
		System.out.println("Fila com ArrayList");
		inicio = System.currentTimeMillis();
		FilaParametrizadaComArrayList<Aluno> filaParametrizadaComArrayList = new FilaParametrizadaComArrayList<>();
		for(int i = 0; i < qntAlunos; i++){
			Aluno aluno = new Aluno();
			filaParametrizadaComArrayList.insere(aluno);
		}
		fim = System.currentTimeMillis();
		System.out.print("Tempo para adicionar " + qntAlunos + " alunos: ");
		System.out.println((fim - inicio) + "ms");

		inicio = System.currentTimeMillis();
		while(!filaParametrizadaComArrayList.vazia()){
			filaParametrizadaComArrayList.remove();
		}
		fim = System.currentTimeMillis();
		System.out.print("Tempo para remover todos os alunos da fila: ");
		System.out.println((fim - inicio) + "ms");
	}
}
