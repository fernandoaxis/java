package br.com.javafudamentos.fiap;

public class Teste{
	public static void main(String[] args) {
		
		Animal animal = new Animal();
		
		animal.setAlimenta("Todo animal se alimenta");
		animal.setLocomove("Todo animal se locomove");
	
		Cachorro cachorro = new Cachorro();
		cachorro.setAlimenta("Cachorro come ração");
		cachorro.setLatino("Cachorro faz au au");
		cachorro.setLocomove("Cachorro anda de 4 patas");
		
	}

	
}
