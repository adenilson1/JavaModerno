package br.com.adenilson;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStringUsoDoLambda {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();

		palavras.add("Alura online");
		palavras.add("Editora casa do código");
		palavras.add("Caelum");

		// uso do lampda com 2 variaveis
		//palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length())); // compracao
		//ou
		//palavras.sort((s1, s2) -> s1.length() - s2.length()); // forma de comparacao mais inxuta
		
		//methods references
		palavras.sort(Comparator.comparing(s -> s.length()));
		palavras.sort(Comparator.comparing(String :: length));// mais enxuto, nova sintaxe, mais tipada.


		// esse o lampda com uma variavel
		palavras.forEach(s -> System.out.println(s)); // impresao
		Consumer<String> impressor = System.out::println;
		System.out.println(impressor);
		//ou
		palavras.forEach(System.out::println);
	}

}
