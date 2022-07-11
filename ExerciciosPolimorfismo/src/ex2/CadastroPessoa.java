package ex2;

import java.util.Scanner;

public class CadastroPessoa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nome, sobrenome, cpf;
		String razaoSocial, nomeFantasia, cnpj, sigla;
		String pais, dataCadastro;
		int op;
		
		System.out.println("---CADASTRO DE PESSOA--");
		System.out.println("---1- PESSOA FISICA");
		System.out.println("---2- PESSOA JURIDICA");
		op = sc.nextInt();
		
		if (op == 1) {
			System.out.print("Pais: ");
			pais = sc.next();
			System.out.print("Data de cadastro: ");
			dataCadastro = sc.next();
			System.out.print("Nome completo: ");
			nome = sc.next();
			sobrenome = sc.next();
			System.out.print("CPF: ");
			cpf = sc.next();
			PessoaFisica pf = new PessoaFisica(pais, dataCadastro, nome, sobrenome, cpf);
			pf.Imprime();
		} else if (op == 2) {
			System.out.print("Pais: ");
			pais = sc.next();
			System.out.print("Data de cadastro: ");
			dataCadastro = sc.next();
			System.out.print("Razao Social: ");
			razaoSocial = sc.next();
			System.out.print("Nome Fantasia: ");
			nomeFantasia = sc.next();
			System.out.print("Sigla: ");
			sigla = sc.next();
			System.out.print("CNPJ: ");
			cnpj = sc.next();
			PessoaJuridica pj = new PessoaJuridica(pais, dataCadastro, razaoSocial, nomeFantasia, sigla, cnpj);
			pj.Imprime();
		}
		
		
	}

}
