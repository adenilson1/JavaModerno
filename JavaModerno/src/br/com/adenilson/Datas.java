package br.com.adenilson;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {
	public static void main(String[] args) {
		
		System.out.println("data de hoje");
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		//comparando a data de hoje com a data da proxima copa do mundo
		System.out.println("tempo para proxima copa do mundo e quantos dias faltam");
		LocalDate copaDoMundoQata = LocalDate.of(2022, Month.NOVEMBER, 18);
			
		int anos = copaDoMundoQata.getYear() - hoje.getYear();
		System.out.println(anos);
		
		Period perido = Period.between(hoje,copaDoMundoQata);
		System.out.println(perido.getDays());
		
		System.out.println("-------------------------");
		System.out.println("proxima copa do mundo");
		
		LocalDate proxiamaCopaDoMundo = copaDoMundoQata.plusYears(4);
		System.out.println(proxiamaCopaDoMundo);
		
		System.out.println("-------------------------");
		//formatando data
		System.out.println("datas formatadas");
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String valorFormatado = proxiamaCopaDoMundo.format(formatador);
		System.out.println(valorFormatado);
		
		System.out.println("-------------------------");
		System.out.println("data formatada com hora");
		//data com hora
		DateTimeFormatter formatadorComHras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora.format(formatadorComHras));
		
		System.out.println("-------------------------");
		// hora de intervalo
		LocalTime  intervalo = LocalTime.of(15,30);
		System.out.println(intervalo);
		
		
		
	}

}
