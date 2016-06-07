package br.com.caelum.ed.pilhas;

import java.util.Stack;

public class Cryptography {
	
	public static String encriptContent(String string){
		String[] words = string.split(" ");
		StringBuilder stringBuilder = new StringBuilder();
		for(String word : words){
			Stack<Character> stack = new Stack<>();
			for(int i = 0; i < word.length(); i++){
				stack.push(word.charAt(i));
			}
			
			while(!stack.isEmpty()){
				stringBuilder.append(stack.pop());
			}
			if(!word.equals(words[words.length - 1])){
				stringBuilder.append(" ");				
			}
			
		}
		return stringBuilder.toString();
	}
	
	public static String decriptContent(String string){
		return Cryptography.encriptContent(string);
	}
}
