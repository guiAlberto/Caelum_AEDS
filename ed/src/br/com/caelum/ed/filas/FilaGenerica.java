package br.com.caelum.ed.filas;
import java.util.*;

public class FilaGenerica
{
	private List<Object> objetos = new LinkedList<>();
	
	public void insere(Object objeto){
		objetos.add(objeto);
	}
	
	public Object remove(){
		return this.objetos.remove(0);
	}
	
	public boolean vazia(){
		return this.objetos.size() == 0;
	}
}
