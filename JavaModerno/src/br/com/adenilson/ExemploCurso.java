package br.com.adenilson;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

class Curso {
	private String nome;
	private int alunos;

	public Curso(String nome, int alunos) {
		this.nome = nome;
		this.alunos = alunos;
	}

	public String getNome() {
		return nome;
	}

	public int getAlunos() {
		return alunos;
	}

}

public class ExemploCurso {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));

		cursos.sort(Comparator.comparing(Curso::getAlunos));
		// cursos.forEach(c -> System.out.println(c.getNome()));
		// usando agora o stream

		// Cursos com mais de 100 alunos
		System.out.println("Cursos com mais de 100 alunos");
		cursos.stream()
		.filter(c -> c.getAlunos() >= 100)
		.forEach(c -> System.out.println(c.getNome()));

		System.out.println("Mapeando os cursos pela quantidade de alunos");
		// uso do metodo map
		cursos.stream()
		.filter(c -> c.getAlunos() >= 100)
		.map(Curso::getAlunos)
		.forEach(System.out::println);

		// Stream interias para soma todos os curos
		System.out.println("SOMA DE ALUNOS COM MAIS DE 100 ALUNOS");
		int sum = cursos.stream()
				.filter(c -> c.getAlunos() >= 100)
				.mapToInt(Curso::getAlunos).sum();
		System.out.println(sum);
		
		//uso do optional
		System.out.println("------------------------------");
		 Optional <Curso> optionalCurso = cursos.stream()
		.filter(c -> c.getAlunos() >= 100)
		.findAny();
		 
		Curso curso = optionalCurso.orElse(null);
		System.out.println(curso.getNome());
		
		System.out.println("------------------------------");
		optionalCurso.ifPresent(c -> System.out.println(c.getNome()));
		
		System.out.println("------------------------------");
		//forma concatenada
		cursos.stream()
		.filter(c -> c.getAlunos() >= 100)
		.findAny()
		.ifPresent(c -> System.out.println(c.getNome()));
		//leitura do codigo: cursos pegue seu fluxo (stream), depois filtre(filter
		// (usando um lambida), por seu curos com mais de 100 aluno
		// pegue qualque um (finAny) e depois imprima se nao tiver nenhum null
		//(ifPresent) com um lambda que imprima apenas o nome do curso
		
		System.out.println("------------------------------");
		//uso do optinal para variaveis int e double
		 OptionalDouble media =cursos.stream()
		.filter(c -> c.getAlunos() >= 100)
		.mapToInt(Curso::getAlunos)
		.average();
		 System.out.println(media);
		 
		 System.out.println("------------------------------");
		 //criando um filtro que guarda todos o cursos com collectors
		cursos = cursos.stream()
		 .filter(c -> c.getAlunos() >= 100)
		 .collect(Collectors.toList());
		
		cursos.stream()
		.forEach(c -> System.out.println(c.getNome()));
		
		 System.out.println("------------------------------");
		 //suando map
		 	cursos.stream()
				 .filter(c -> c.getAlunos() >= 100)
				 .collect(Collectors.toMap(
						 c -> c.getNome(),
						 c -> c.getAlunos()))
				 .forEach(
						 (nome, alunos) -> System.out.println("Curso "+nome+" tem "+ alunos + " alunos"));
		

	}

}
