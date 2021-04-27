package br.com.adenilson;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenarStringComMethodsReferences {
	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		palavras.add("Alura online");
		palavras.add("Casa do Código");
		palavras.add("Caelum");

		palavras.sort(Comparator.comparing(String::length));
		palavras.forEach(System.out::println);

	}

}
