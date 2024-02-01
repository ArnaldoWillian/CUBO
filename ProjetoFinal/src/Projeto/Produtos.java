package Projeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Produtos {
	Scanner sc = new Scanner(System.in);
	List<String> medicamentosEscolhidos = new ArrayList<>();
	List<Double> valoresItens = new ArrayList<>();
	public String contMedicamento;
	double contQTD;
	String outroItem;

	double total = 0;

	public void listarRemedios() {
		Menu menu = new Menu();

		while (true) {
			System.out.println("##########################################");
			System.out.println("Produtos e valores dos medicamentos:     #");
			System.out.println("Xantinon com 10 comprimidos R$5,20       #");
			System.out.println("Epocler 01  flanconete R$ 2,50           #");
			System.out.println("Omecor com 30 comprimidos R$35,80        #");
			System.out.println("Benegripe com 06 comprimidos R$11,00     #");
			System.out.println("Betina com 04 comprimidos R$40,00        #");
			System.out.println("##########################################");
			System.out.print("Informe o nome do medicamento desejado: ");
			String contMedicamento = sc.next();
			System.out.print("Informe a quantidade: ");
			double contQTD = sc.nextDouble();

			double valorItem = 0;

			if (contMedicamento.equals("Xantinon")) {
				valorItem = contQTD * 5.20;
			} else if (contMedicamento.equals("Epocler")) {
				valorItem = contQTD * 2.50;
			} else if (contMedicamento.equals("Omecor")) {
				valorItem = contQTD * 35.80;
			} else if (contMedicamento.equals("Benegripe")) {
				valorItem = contQTD * 11.00;
			} else if (contMedicamento.equals("Betina")) {
				valorItem = contQTD * 40.00;
			}

			total += valorItem;

			medicamentosEscolhidos.add(contMedicamento);
			valoresItens.add(valorItem);

			System.out.printf("O Medicamento escolhido foi %s e o valor a ser pago é de: R$%.2f reais%n",
					contMedicamento, valorItem);
			System.out.printf("Total do carrinho: R$%.2f reais%n", total);

			System.out.print("\nSe você deseja comprar outro item, digite 0:");
			System.out.print("\nOu pressione qualquer tecla para voltar ao Menu Inicial:");
			System.out.print("Digite a opção desejada: ");
			String outroItem = sc.next();

			if (!outroItem.equals("0")) {
				System.out.println("Voltando ao Menu Inicial");
				menu.menuPrincipal();
				break; // Sair do loop se o cliente não quiser comprar mais itens
			}
		}

		// Exibir medicamentos no carrinho
		System.out.println("\nMedicamentos no Carrinho:");
		for (int i = 0; i < medicamentosEscolhidos.size(); i++) {
			System.out.printf("Medicamento: %s, Valor: R$%.2f reais%n", medicamentosEscolhidos.get(i),
					valoresItens.get(i));
		}
		System.out.printf("Total do carrinho: R$%.2f reais%n", total);

		sc.close();
	}
}


