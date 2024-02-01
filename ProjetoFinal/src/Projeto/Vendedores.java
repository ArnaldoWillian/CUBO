package Projeto;

import java.util.Scanner;

public class Vendedores {

	Scanner sc = new Scanner(System.in);
	int matricula, senhaVendedor, opcaoVendedor;
	String medicamentos;
	int num = 5;
	RelatorioDeVendas relatorios = new RelatorioDeVendas();

	Menu menu = new Menu();
	Clientes clientes = new Clientes();

	public void menuVendedor() {
		System.out.println("#########################################################################");
		System.out.println("Se você quer exibir a lista de vendedores cadastrados, digite 1         #");
		System.out.println("Se você já é vendedor e deseja fazer login, digite 2                    #");
		System.out.println("Se você deseja fazer uma venda, digite 3                                #");
		System.out.println("Se você deseja imprimir o relatório de vendas, digite 4                 #");
		System.out.println("Se você deseja consultar a lista de clientes cadastrados, digite 5      #");
		System.out.println("Se você deseja consultar a lista de clientes inativos, digite 6         #");
		System.out.println("Se você deseja retornar ao Menu Principal, digite 7                     #");
		System.out.println("#########################################################################");
		System.out.print("Opção: ");
		opcaoVendedor = sc.nextInt();
		System.out.println("________________________________________________________________________");
		if (opcaoVendedor == 1) {
			vendedoresCadastrados();
		} else if (opcaoVendedor == 2) {
			loginVendedor();
		} else if (opcaoVendedor == 3) {
			realizarVendas();
		} else if (opcaoVendedor == 4) {
			relatorios.vendasRealizadas();
		} else if (opcaoVendedor == 5) {
			clientes.clientesCadastrados();
		} else if (opcaoVendedor == 6) {
			clientes.clientesInativos(clientes.getClientesInativos());
		} else if (opcaoVendedor == 7) {
			menu.menuPrincipal();
		} else {
			System.out.println("Opção Inválida, retornando ao Menu de vendedores");
			menuVendedor();
		}

	}

	public void loginVendedor() {
		System.out.print("\nDigite a sua matrícula para acessar o menu: ");
		matricula = sc.nextInt();
		System.out.print("\nDigite a sua senha para acessar o menu: ");
		senhaVendedor = sc.nextInt();

		// matricula do vendedor para acessar o sistema = 2024 e senha = 2024
		// matricula do vendedor para acessar o sistema = 3030 e senha = 3030
		if (matricula == 2024 && senhaVendedor == 2024) {
			System.out.print("Acesso liberado com sucesso");
			System.out.print("\nVocê será redirecionado para o relatório de vendas.\n");
			relatorios.vendasRealizadas();
		} else if (matricula == 3030 && senhaVendedor == 3030) {
			System.out.print("Acesso liberado com sucesso");
			System.out.print("Você será redirecionado para o relatório de vendas.");
			relatorios.vendasRealizadas();
			// chamar o relatório de vendas ou menu relacionado a vendas
		}

		else {
			System.out.print("--------------------------------------------------------------------------------------");
			System.out
					.println("\nEssa matrícula não consta no nosso banco de dados, retornando ao menu para vendedor\n");
			System.out
					.println("--------------------------------------------------------------------------------------");
			menuVendedor();
		}
	}

	public void vendedoresCadastrados() {
		int retornandoAoMenu;

		String[] vendedoresCadastrados = new String[5];
		vendedoresCadastrados[0] = "Rosana Costa";
		vendedoresCadastrados[1] = "Fausto Silva";
		vendedoresCadastrados[2] = "Caio Ribeiro";
		vendedoresCadastrados[3] = "Vinicius Oliveira";
		vendedoresCadastrados[4] = "Lucas Lira";

		System.out.println("\nConforme solicitado, segue a lista de vendedores cadastrados.\n");
		System.out.println("1°: " + vendedoresCadastrados[0]);
		System.out.println("2°: " + vendedoresCadastrados[1]);
		System.out.println("3°: " + vendedoresCadastrados[2]);
		System.out.println("4°: " + vendedoresCadastrados[3]);
		System.out.println("5°: " + vendedoresCadastrados[4]);

		System.out.print(
				"Pressione a tecla 9 para voltar ao menu principal ou pressione 0 para voltar ao menu de vendedores:");
		retornandoAoMenu = sc.nextInt();

		if (retornandoAoMenu == 9) {
			System.out.println("Retornando ao Menu Principal");
			menu.menuPrincipal();

		} else if (retornandoAoMenu == 0) {
			System.out.println("Retornando ao Menu de Vendedores");
			menuVendedor();

		}

	}

	public void realizarVendas() {
		for (int i = 0; i <= num; i++) {
			System.out.print("Informe o nome do medicamento:");
			medicamentos = sc.next();
			System.out.print("Informe a quantidade desejada:");
			num = sc.nextInt();

		}
	}
}
