package br.com.adenilson;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class ExecicioData {
	public static void main(String[] args) {

		// 25 de janeiro de 2099
		LocalDate dataExercicio = LocalDate.of(2099, Month.JANUARY, 25);
		System.out.println(dataExercicio);
		System.out.println("------------------------------------------");
		
		//periodo da de hoje com a data do exercicio
		LocalDate hoje = LocalDate.now();
		Period periodo = Period.between(hoje, dataExercicio);
		System.out.println(periodo);
		
		System.out.println("------------------------------------------");
		
		// formata data dd/MM/yyyy
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(dataExercicio.format(formatador));
	}

}
