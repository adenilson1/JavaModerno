package br.com.adenilson;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class ExercicioPrimeiroElementoDoSteam {

	public static void main(String[] args) {

		List<Curso> cursos = new ArrayList<Curso>();

		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		//pega o primeiro noem de um curso com mais de 50 alunos
		cursos.stream()
		.filter(c -> c.getAlunos() > 50)
		.findFirst()
		.ifPresent(c -> System.out.println(c.getNome()));
		System.out.println("------------------------------");
		// calculo da media dos alunos
		OptionalDouble media = cursos.stream()
		.mapToInt(c -> c.getAlunos())
		.average();
		
		System.out.println(media);
		System.out.println("------------------------------");
		//collect
		cursos.stream()
		.filter(c -> c.getAlunos() > 50)
		.collect(Collectors.toList())
		.forEach(c -> System.out.println(c.getNome()));
		
	}

}
