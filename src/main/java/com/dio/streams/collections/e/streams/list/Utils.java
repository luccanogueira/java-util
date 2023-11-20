package com.dio.streams.collections.e.streams.list;

import java.util.List;

public class Utils {
	
	public Integer namber = 0;

	/* Método para atualizar uma psição já existente na lista usando o set
	 * 
	 * Primeiro o método ira chamar a varificação de tamanho da lista e subitrair 1
	 * para obeter a quantidade de index existentes na lista, em seguida
	 * verifica se o valor da posição desejada existe, caso exisita faz a alteração, se não
	 * retorna a lista original que foi passada para o método.*/
	
	public List<String> atualizaList(List<String> novaLista, Integer posicao, String novoNome) {
		
		if(verificaSizeList(novaLista) - 1 >= posicao) {
			novaLista.set(posicao, novoNome);
		}
				
		return novaLista;
	}
	
	/* Método para remover um valor da lista usando o remove por valor de index
	 * 
	 * Primeiro o método ira chamar a varificação de tamanho da lista e subitrair 1
	 * para obeter a quantidade de index existentes na lista, em seguida
	 * verifica se o valor da posição desejada existe, caso exisita faz a remoção, se não
	 * retorna a lista original que foi passada para o método.*/
	
	public List<String> removeValorIndex(List<String> novaLista, Integer posicao) {
		
		if(verificaSizeList(novaLista) -1 >= posicao) {
			novaLista.remove(posicao);
		}
		
		return novaLista;
	}
	
	/* Método para remover um valor da lista usando o remove por valor conteudo
	 * 
	 * Primeiro o método ira verificar por meio do contains se o conteudo informado
	 * existe na lista, se exisitir removo o conteudo, se não retorna a lista
	 * original que foi passada para o método.*/
	
	public List<String> removeValorConteudo(List<String> novaLista, String conteudo) {
		
		if(novaLista.contains(conteudo)){
			novaLista.remove(conteudo);
		}
		
		return novaLista;
	}
	
	/* Método para localizar um valor da lista usando o IndexOf
	 * 
	 * Primeiro o método ira verificar por meio do contains se o conteudo informado
	 * existe na lista, se exisitir retona uma String mostranque existe e usando o IndexOf
	 * retorna sua posição, se não existir retorna uma Striong mostrando que o valor não exisite.*/
	
	public String varificaConteudo(List<String> lista, String valor) {
		if(lista.contains(valor)){
			return "O conteudo existe e está na posição " + lista.lastIndexOf(valor);
		}
		
		return "O conteudo não existe na lista informada!";
	}
	
	private Integer verificaSizeList(List<String> lista) {
		return lista.size();
	}
}
