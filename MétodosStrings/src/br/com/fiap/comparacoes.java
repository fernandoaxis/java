package br.com.fiap;

public class comparacoes {
	public static void main(String[] args) {
		String nome = new String("maça");
		String nome2 = new String("Maçã");
		String nome3 = new String("maça");
		
		//Modo certo
		System.out.println(nome.equals(nome2));
		System.out.println(nome.equalsIgnoreCase(nome2));
		System.out.println(nome.equals(nome3));
		
		String descricao = new String("Maçã gala, a maçã mais doce do mercado");
		System.out.println(descricao.charAt(1));
		
		System.out.println(descricao.indexOf("gala"));
		
		System.out.println(descricao.lastIndexOf("a"));

		/*
		 * descricao.replace -> para substituir uma palavra ou caracter
		 * descricao.toLowercase -> para tranformar os caracteres em minusculos
		 * descricao.toUppercase -> para transforma os caracteres em maiusculos
		*/
	}
}
