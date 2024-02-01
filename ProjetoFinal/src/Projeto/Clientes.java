package Projeto;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Clientes {

	String clientesInativos = "Pedro Alencar , João Carlos e José Pereira";
	Scanner sc = new Scanner(System.in);

	public String getClientesInativos() {
		return clientesInativos;
	}

	public void setClientesInativos(String clientesInativos) {
		this.clientesInativos = clientesInativos;
	}

	public void clientesCadastrados() {
		Vendedores vendedores = new Vendedores();
		Menu menu = new Menu();
//		ArrayList <String>  clientes = new ArrayList<>();
//		clientes.add("João Pereira");
//		clientes.add("Ortiz Silveira");
//		clientes.add("Maria José");
//		clientes.add("Ana Beatriz");

		String[] clientes = new String[5];
		clientes[0] = "Joao Pereira";
		clientes[1] = "Maria Roberta";
		clientes[2] = "Juliana Silva";
		clientes[3] = "Carlos André";
		clientes[4] = "Roberto Silva";

		for (String cliente : clientes) {
			System.out.println(cliente);
		}
		System.out.println("Para voltar ao menu dos vendedores digite 1:");
		String opcao = sc.next();
		if (opcao.equals("1")) {
			System.out.print("Retornando ao menu dos vendedores\n");
			vendedores.menuVendedor();
		}else {
			System.out.print("Opção inválida, você será redirecionado para o menu principal\n");
			menu.menuPrincipal();
		}
	}

	public String clientesInativos(String nome) {
		Vendedores vendedores = new Vendedores();
		Menu menu = new Menu();
		System.out.println("Segue a data e hora em que os clientes encontram-se inativos:");
		SimpleDateFormat sfd = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		Date data = new Date();
		System.out.println("Data é: " + sfd.format(data) + "h");
		System.out.println("Cliente Inativos: " + nome);

		System.out.println("Para voltar ao menu dos vendedores digite 1:");
		String opcao = sc.next();
		if (opcao.equals("1")) {
			System.out.print("Retornando ao menu dos vendedores\n");
			vendedores.menuVendedor();
		}else {
			System.out.print("Opção inválida, você será redirecionado para o menu principal\n");
			menu.menuPrincipal();
		}
		return this.clientesInativos;
	}
}
