package Projeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RelatorioDeVendas {
	Scanner sc = new Scanner(System.in);
	// Vendedores vendedor = new Vendedores();
	Menu menu = new Menu();
	int opcaoVendedor;
	String medicamentos;
	int num = 5;

	public void vendasRealizadas() {

		ArrayList<String> vendas = new ArrayList<>();
		vendas.add(
				"Venda realizadas por: Rosana Costa - 01 - Unidade de Epocler, 02 unidades de Xantinon, 03 - Xantinon");
		vendas.add(
				"\nVenda realizadas por: Fausto Silva - 03 - Unidade de Betina, 03 unidades de Benegripe, 04 - Omecor");
		vendas.add(
				"\nVenda realizadas por: Caio Ribeiro - 05 - Unidade de Epocler, 01 unidades de Xantinon, 02 - Omecor");
		vendas.add(
				"\nVenda realizadas por: Vinicius Oliveira - 04 - Unidade de Betina, 04 unidades de Benegripe, 01 - Omecor");
		vendas.add("\nVenda realizadas por: Lucas Lira - 05 - Unidades de Xantinon, 01 - Omecor");

		 
	    String vendasFormatadas = String.join("", vendas);

	    
	    System.out.println(vendasFormatadas);

		System.out.print("Se você deseja voltar ao Menu Princial, digite 1:");
		String opcao = sc.next();
		menu.setOpcao(opcao);
		
		if( menu.getOpcao() != null && menu.getOpcao().equals("1")) {
			menu.menuPrincipal();
		}
		
	}

}
