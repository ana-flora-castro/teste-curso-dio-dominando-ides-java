package com.dio;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		float a, b;
		System.out.println("Digite o primeiro número: ");
		a = scan.nextFloat();
		System.out.println("Digite o segundo número ");
        b = scan.nextFloat();		
        
        
         float soma = soma(a,b);
         float multiplicacao = multiplicacao(a,b);
         float subtracao = subtracao(a,b);
         float divisao = divisao(a,b);
         
         System.out.println(soma);
         System.out.println(multiplicacao);
         System.out.println(subtracao);
         System.out.println(divisao);
	}

	public static float soma(float a, float b) {
		return a+b;
	}
	public static float multiplicacao(float a, float b) {
		return a*b;
	}
	public static float subtracao(float a, float b) {
		return a-b;
	}
	public static float divisao(float a, float b) {
		return a/b;
	}
}
