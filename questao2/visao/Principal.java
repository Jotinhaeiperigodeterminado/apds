package visao;

import java.util.Scanner;

import dominio.Empresa;

public class Principal {

	public static void main(String[] args) {
		Scanner dados = new Scanner(System.in);
		
		Empresa empresa1 = new Empresa();
		Empresa empresa2 = new Empresa();
		Empresa empresa3 = new Empresa();
		Empresa empresa4 = new Empresa();
		Empresa empresa5 = new Empresa();
		
		System.out.println("Nome do primeiro titular:");
		empresa1.setNome(dados.next());
		System.out.println("nome:" +empresa1.getNome());
		System.out.println("Trabalha em 2 empresas");
		empresa1.tempoDetrabalho();
		
		System.out.println("Nome do segundo titular:");
		empresa2.setNome(dados.next());
		System.out.println("nome:" + empresa2.getNome());
		System.out.println("Trabalha em 1 empresa");
		empresa2.tempoDetrabalho1();
		
		System.out.println("Nome do terceiro titular:");
		empresa2.setNome(dados.next());
		System.out.println("nome:" + empresa2.getNome());
		System.out.println("Trablha em 4 empresas");
		empresa2.tempoDetrabalho2();
		
		System.out.println("Nome do quarto titular:");
		empresa4.setNome(dados.next());
		System.out.println("nome:" + empresa4.getNome());
		System.out.println("Trabalha em 7 empresas");
		empresa4.tempoDetrabalho3();
		
		System.out.println("Nome do Quinto titular:");
		empresa5.setNome(dados.next());
		System.out.println("nome:" + empresa5.getNome());
		System.out.println("Trabalha em 5 empresas");
		empresa5.tempoDetrabalho4();
	}

}
