package Projeto;

import java.util.Scanner;

public class Menu {

	Login login = new Login();

	Scanner sc = new Scanner(System.in);
	private String opcao;

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public String getOpcao() {
		return opcao;
	}

	public void setOpcao(String opcao) {
		this.opcao = opcao;
	}

	public void menuPrincipal() {
		Vendedores vendedor = new Vendedores();
		Login login = new Login();
		System.out.println("##########################################");
		System.out.println("Olá, seja bem-vindo a Farmácia CUBO      #");
		System.out.println("Se você já nosso cliente, digite: 1      #");
		System.out.println("Se você não é nosso cliente, digite: 2   #");
		System.out.println("Se você é vendedor, digite: 3            #");
		System.out.println("Se você é fornecedor, digite: 4          #");
		System.out.println("Se você deseja encerrar, digite: 5       #");
		System.out.println("##########################################");
		System.out.print("Opção:");

		opcao = sc.next();

		switch (opcao) {
		case "1":
			login.login();
			break;
		case "2":
			login.cadastrarUsuarios();
			break;
		case "3":
			vendedor.menuVendedor();
			break;
		case "4":
			fornecedorCadastrado();
			break;
		case "5":
			encerrandoPrograma();
			break;
		default:
			encerrandoPrograma();

		}

	}

	private void fornecedorCadastrado() {
		Fornecedores fornecedor = new Fornecedores();
		fornecedor.fornecedorCadastrado();
	}

	public void encerrandoPrograma() {
		try {
			if (opcao != null) {
				if (opcao.equals("5")) {
					System.out.println("Conforme solicitado, encerrando o programa.");
					System.exit(0);
				} else {

					System.out.println("Opção inválida. O programa será encerrado.");
					System.exit(0);
				}
			}
		} catch (Exception e) {
			System.out.println("Erro ao processar a opcao: ");

		}
	}
}
