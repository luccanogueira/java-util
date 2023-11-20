package com.dio.streams.collections.e.streams.list;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class ExemploVector {
	
	/* Diferenças entre Vector e ArrayList
	 * 
	 * Vector é sincronizado por padrão, o que significa que é thread-safe. As operações no Vector são sincronizadas, ´
	 * tornando-o mais seguro para acesso concorrente por várias threads;
	 * 
	 * Devido à sincronização, as operações em Vector podem ser mais lentas;
	 * 
	 * Vector é uma classe legada que existe desde as versões iniciais do Java e foi parte da primeira coleção do Java. 
	 * Devido à sua sincronização, é menos utilizado em código moderno.*/
	
	public static List<String> sports = new Vector<>();
	public static Utils util = new Utils();

	public static void main(String[] args) {
		
		sports.add("Futebol");
		sports.add("Basquete");
		sports.add("Ping Pong");
		sports.add("Volei");
		sports.add("Natação");
		
		System.out.println("Lista original:	" + sports + "\n");
		
		Collections.sort(sports);
		System.out.println("Lista Ordenada pelo Sort: " + sports + "\n");
		
		util.atualizaList(sports, 5, "Tenês");
		System.out.println("Lista Alterada: " + sports + "\n");
		
		util.removeValorIndex(sports, 1);
		util.removeValorConteudo(sports, "Basquete");
		System.out.println("Lista com nomes Removidos: " + sports + "\n");
		
		System.out.println(util.varificaConteudo(sports, "Ping Pong"));
		
	}
}