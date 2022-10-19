package dominio;

import java.time.LocalDateTime;
import java.time.Period;

public class Empresa {

	private String nomeEmpresa;

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public void tempo() {

		LocalDateTime datainicio = LocalDateTime.of(2021, 8, 4, 0, 0);
		LocalDateTime datafim = LocalDateTime.of(2022, 12, 5, 0, 0);

		Period periodo = Period.between(datainicio.toLocalDate(), datafim.toLocalDate());
		int ano = Math.abs(periodo.getYears());
		int mes = Math.abs(periodo.getMonths());
		int dia = Math.abs(periodo.getDays());
		System.out.println("Primeiro emprego:");
		System.out.println("Data de entrada:" + datainicio);
		System.out.println("Data de saida:" + datafim);
		System.out.println("Periodo de Trabalhado:" + ano + "ano" + mes + "meses" + dia + "dias");
		
		LocalDateTime datainicio1 = LocalDateTime.of(2022, 4, 4, 0, 0);
		LocalDateTime datafim1 = LocalDateTime.of(2024, 8, 5, 0, 0);

		Period periodo1 = Period.between(datainicio1.toLocalDate(), datafim1.toLocalDate());
		int ano1 = Math.abs(periodo1.getYears());
		int mes1 = Math.abs(periodo1.getMonths());
		int dia1 = Math.abs(periodo1.getDays());

		System.out.println("Segundo Emprego:");
		System.out.println("Data de entrada:" + datainicio1);
		System.out.println("Data de saida:" + datafim1);
		System.out.println("Periodo de Trabalho:" + ano1 + "ano" + mes1 + "meses" + dia1 + "dias");

		System.out.println("Tempo Total: " + (ano1 + ano) + "ano" + (mes1 + mes) + "meses" + (dia1 + dia) + "dias");

	}
	
	public void tempo1() {
		
		LocalDateTime datainicio2 = LocalDateTime.of(2021, 8, 4, 0, 0);
		LocalDateTime datafim2 = LocalDateTime.of(2021, 12, 12, 0, 0);

		Period periodo2 = Period.between(datainicio2.toLocalDate(), datafim2.toLocalDate());
		int ano2 = Math.abs(periodo2.getYears());
		int mes2 = Math.abs(periodo2.getMonths());
		int dia2 = Math.abs(periodo2.getDays());

		System.out.println("Primeiro Emprego:");
		System.out.println("Data de entrada:" + datainicio2);
		System.out.println("Data de saida:" + datafim2);
		System.out.println("Periodo de Trabalho: " + ano2 + "ano" + mes2 + "meses" + dia2 + "dias");
		System.out.println("Tempo total: " + ano2 + "ano" + mes2 + "meses" + dia2 + "dias");
		
		
	}
	
	public void tempo2() {
		
		LocalDateTime datainicio3 = LocalDateTime.of(2008, 8, 4, 0, 0);
		LocalDateTime datafim3 = LocalDateTime.of(2015, 9, 28, 0, 0);

		Period periodo3 = Period.between(datainicio3.toLocalDate(), datafim3.toLocalDate());
		int ano3 = Math.abs(periodo3.getYears());
		int mes3 = Math.abs(periodo3.getMonths());
		int dia3 = Math.abs(periodo3.getDays());

		System.out.println("Primeiro Emprego ao Quarto Emprego:");
		System.out.println("Data de entrada:" + datainicio3);
		System.out.println("Data de saida:" + datafim3);
		System.out.println("Periodo de Trabalho: " + ano3 + "ano" + mes3 + "meses" + dia3 + "dias");

		System.out.println("Tempo total:"+ ano3 + "ano" + mes3 + "meses" + dia3 + "dias" );
		
		
	}
	
	public void tempo3() {
		
		LocalDateTime datainicio4 = LocalDateTime.of(2001, 1, 1, 0, 0);
		LocalDateTime datafim4 = LocalDateTime.of(2033, 5, 30, 0, 0);

		Period periodo4 = Period.between(datainicio4.toLocalDate(), datafim4.toLocalDate());
		int ano4 = Math.abs(periodo4.getYears());
		int mes4 = Math.abs(periodo4.getMonths());
		int dia4 = Math.abs(periodo4.getDays());

		System.out.println("Primeiro Emprego ao setimo emprego:");
		System.out.println("Data de entrada:" + datainicio4);
		System.out.println("Data de saida:" + datafim4);
		System.out.println("Periodo de Trabalho: " +ano4 + "ano" + mes4 + "meses" + dia4 + "dias" );

		System.out.println("Tempo total:"+ano4 + "ano" + mes4 + "meses" + dia4 + "dias");
	}
	public void tempo4() {
		
		LocalDateTime datainicio5 = LocalDateTime.of(1997, 1, 1, 0, 0);
		LocalDateTime datafim5 = LocalDateTime.of(2017, 8, 25, 0, 0);

		Period periodo5 = Period.between(datainicio5.toLocalDate(), datafim5.toLocalDate());
		int ano5 = Math.abs(periodo5.getYears());
		int mes5 = Math.abs(periodo5.getMonths());
		int dia5 = Math.abs(periodo5.getDays());

		System.out.println("Primeiro Emprego ao quinto emprego:");
		System.out.println("Data de entrada:" + datainicio5);
		System.out.println("Data de saida:" + datafim5);
		System.out.println("Periodo de Trabalho: " + ano5 + "ano" + mes5 + "meses" + dia5 + "dias");

		System.out.println("Tempo total:" +ano5 + "ano" + mes5 + "meses" + dia5 + "dias");

	}

}
