package com.dio;

import com.dio.model.gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello Mundo");
	
	gato gato = new gato();
	System.out.println(gato);
	Livros livros = new Livros();
	System.out.println(livros);
	}
}
class Livros {
	private String nome;   
	private String npag;
}