package br.com.adenilson;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaString {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();

		palavras.add("Alura online");
		palavras.add("Editora casa do código");
		palavras.add("Caelum");
		
		System.out.println("Sem comparador");
		Collections.sort(palavras);
		System.out.println(palavras);
		
		System.out.println("Com comparador");
		Comparator<String> comparador = new CompradorPorTamanho();
		palavras.sort(comparador);
		System.out.println(palavras);
		
		System.out.println("Iteração antiga");
		for (String p : palavras) {
			System.out.println(p);
			
		}
		
		System.out.println("Iteração nova");
		Consumer<String> consumidor = new ImprimirNaLinha();
		palavras.forEach(consumidor);

	}

}

class ImprimirNaLinha implements Consumer<String>{

	@Override
	public void accept(String s) {
		System.out.println(s);
		
	}
	
}

class CompradorPorTamanho implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		if (s1.length() < s2.length())
			return -14;
		if (s1.length() > s2.length())
			return 1;
		return 0;
	}

}
