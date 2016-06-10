package br.com.caelum.ed.filas;
import java.util.*;

public class FilaParametrizadaComArrayList<T>
{
	private ArrayList<T> objetos = new ArrayList<T>();

	public void insere(T t){
		objetos.add(t);
	}

	public T remove(){
		return this.objetos.remove(0);
	}

	public boolean vazia(){
		return this.objetos.size() == 0;
	}
}
