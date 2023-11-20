package com.dio.streams.collections.e.streams.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploArrayList {
	
	public static List<String> nomes = new ArrayList<>();
	public static Utils util = new Utils();

	public static void main(String[] args) {
		
		nomes.add("Lucca");
		nomes.add("Carlos");
		nomes.add("João");
		nomes.add("Anderson");
		nomes.add("Mario");
		
		System.out.println("Lista original:	" + nomes + "\n");
		
		Collections.sort(nomes);
		System.out.println("Lista Ordenada pelo Sort: " + nomes + "\n");
		
		util.atualizaList(nomes, 5, "Samuel");
		System.out.println("Lista Alterada: " + nomes + "\n");
		
		util.removeValorIndex(nomes, 1);
		util.removeValorConteudo(nomes, "Mario");
		System.out.println("Lista com nomes Removidos: " + nomes + "\n");
		
		System.out.println(util.varificaConteudo(nomes, "Lucca"));
		
	}
}