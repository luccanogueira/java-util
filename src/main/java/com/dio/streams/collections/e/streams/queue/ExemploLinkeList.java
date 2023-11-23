package com.dio.streams.collections.e.streams.queue;

import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkeList {

	public static Util util = new Util();
	
	public static void main(String[] args) {
		
		/*A implkementação de Queue usando o LinkedList é similar a uma lista
		 * diferenciando apenas na importancia da ordenação, onde a fila vai
		 * fazer com que o primeiro elemento inserido seja o primeiro a sair
		 * não podendo alterar ou manipular os elemento no meio da fila*/
		
		Queue<String> fila = new LinkedList<>();
		
		fila.add("Claython");
		fila.add("Marcos");
		fila.add("Flávia");
		fila.add("Pamela");
		fila.add("Fernando");
		
		System.out.println("Fila original com elementos adicionados: " + fila + "\n");
		
		String proximaDaFila = util.chamaRemoveProximoFila(fila);
		
		System.out.println("Primero elemento da fila é chamado e removido: " + proximaDaFila + "\n");
		System.out.println("Fila após a chamada e remoção do primeiro elemento: " + fila + "\n");
		
		String verificaProximoFila = util.verificaProximoFila(fila);
		System.out.println("Primero elemento da fila é retornado sem o remover: " + verificaProximoFila + "\n");
		
		
	}
}
