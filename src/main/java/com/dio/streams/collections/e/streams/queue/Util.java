package com.dio.streams.collections.e.streams.queue;

import java.util.Queue;

public class Util {

	/* Método que recebe uma fila, e verifica se ela está vazia ou não, se não estiver 
	 * usando o poll verifica o primeiro valor da fila, retorna e o remove da fila*/
	public String chamaRemoveProximoFila(Queue<String> fila) {
		
		return fila.isEmpty() ?  "A fila está vazia" : fila.poll();
	}
	
	/* Método que recebe uma fila, e verifica se ela está vazia ou não, se não estiver
	 * usando o elemente verifica o primeiro valor da fila e o retorna 
	 * 
	 * podemos usar o peek para obter o mesmo resultado*/
	public String verificaProximoFila(Queue<String> fila) {
		
		return fila.isEmpty() ?  "A fila está vazia" : fila.element();
	}
}
