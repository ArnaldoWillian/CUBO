package Projeto;

import java.util.Scanner;

public class Fornecedores extends Vendedores {
	Scanner sc = new Scanner(System.in);

	private int cnpj, cadastroFornecedor, recebeCNPJ, cnpjCadastrado = 2024;
	public int getCnpjCadastrado() {
		return cnpjCadastrado;
	}

	public void setCnpjCadastrado(int cnpjCadastrado) {
		this.cnpjCadastrado = cnpjCadastrado;
	}

	private String nome;

	public int getRecebeCNPJ() {
		return recebeCNPJ;
	}

	public void setRecebeCNPJ(int recebeCNPJ) {
		this.recebeCNPJ = recebeCNPJ;
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	public int getCadastroFornecedor() {
		return cadastroFornecedor;
	}

	public void setCadastroFornecedor(int cadastroFornecedor) {
		this.cadastroFornecedor = cadastroFornecedor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public void vendedoresCadastrados() {
		

		String[] vendedoresCadastrados = new String[5];
		vendedoresCadastrados[0] = "Rosana Costa";
		vendedoresCadastrados[1] = "Fausto Silva";
		vendedoresCadastrados[2] = "Caio Ribeiro";
		vendedoresCadastrados[3] = "Vinicius Oliveira";
		vendedoresCadastrados[4] = "Lucas Lira";

		System.out.println("\nCaro fornecedor, entre em contato com um dos nossos vendedores listados abaixo.\n");
		System.out.println("1°: " + vendedoresCadastrados[0]);
		System.out.println("2°: " + vendedoresCadastrados[1]);
		System.out.println("3°: " + vendedoresCadastrados[2]);
		System.out.println("4°: " + vendedoresCadastrados[3]);
		System.out.println("5°: " + vendedoresCadastrados[4]);
	}
	public void fornecedorCadastrado() {
		// CNPJ cadastrado = 2024
		Menu menu = new Menu();
		Vendedores vendedores = new Vendedores();
		System.out.println("#################");
		System.out.print("Informe o CNPJ:");
		cnpj = sc.nextInt();

		if(cnpj == this.cnpjCadastrado) {
			System.out.print("Acesso liberado com sucesso, você será redirecionado para a lista de vendedores. \nEntre contato com um de nossos vendedores"
					+ " para que possa verificar o que estamos precisando.");
			vendedoresCadastrados();
		}else {
			System.out.println("CNPJ incorreto, retornando ao menu principal");
			menu.menuPrincipal();
		}

	}

}
