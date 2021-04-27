package br.com.adenilson;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class ExercicioOrdenandoString {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();
		palavras.add("Alura online");
		palavras.add("Casa do Código");
		palavras.add("Caelum");
		
		Comparator<String> comparador = new ComparaPalavraPeloTamanho(); // vai compara as string pelo tamanho
		palavras.sort(comparador);
		System.out.println(palavras);
		
		Consumer<String> consome = new ImprimiNaLinha(); // vai imprimir a lista na ordem do tamanho
		palavras.forEach(consome);
		

	}
}

	// criando uma classe consome de string, ou seja, vai imprimir
	class ImprimiNaLinha implements Consumer<String> {

		@Override
		public void accept(String s) {
			System.out.println(s);

		}

	}

	// criando a classe comprador
	class ComparaPalavraPeloTamanho implements Comparator<String> {

		@Override
		public int compare(String s1, String s2) { // cirando condicoes de comparacao pelo tamano da string
			if (s1.length() < s2.length())
				return -1;
			if (s1.length() > s2.length())
				return 1;

			return 0;
		}

	}


