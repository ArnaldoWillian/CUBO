package Projeto;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Login {
	Scanner sc = new Scanner(System.in);
	Clientes clientes = new Clientes();
	Produtos produtos = new Produtos();
	// login do sistema: mvmv , senha: 2024
	private String nome, endereco, senha, usuario;
	int contador, max_tentativa;

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getCPF() {
		return CPF;
	}

	public void setCPF(int cPF) {
		CPF = cPF;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	private int CPF;
	private char sexo;

	public void login() {
		Menu menu = new Menu();
		System.out.println("######################################################");
		System.out.println("Olá, sejá bem-vindo!!!");
		System.out.print("Para realizar o login no sistema informe o seu usuário: ");
		usuario = sc.next();
		System.out.print("Para realizar o login no sistema informe a sua senha: ");
		senha = sc.next();

		// login do sistema: mvmv , senha: mvmv
		// login do sistema: admin , senha: admin
		if (usuario.equals("mvmv") && senha.equals("mvmv")) {
			contador = 1;

			System.out.println("\n############################################################");
			System.out.println("");
			System.out.println("Login realizado com sucesso, você será redirecionado para a nossa página de Produtos.");
			System.out.println("");

			produtos.listarRemedios();

		} else if (usuario.equals("admin") && senha.equals("admin")) {
			System.out.println("###########################");
			System.out.println("Login realizado com sucesso, você será redirecionado para a nossa página de Produtos.");
			produtos.listarRemedios();;
		} else {
			System.out.print("Credenciais erradas.");
		}

	}

	public void cadastrarUsuarios() {
		Scanner sc = new Scanner(System.in);
		int TAMANHO_MAXIMO = 10;
		Usuario[] usuarios = new Usuario[TAMANHO_MAXIMO];
		int indiceAtual = 0;

		// Loop para cadastrar usuários
		while (true) {
			System.out.println("Cadastro de Usuário");

			// Solicitando informações do usuário
			System.out.print("Informe o nome do usuário: ");
			String nome = sc.nextLine();

			System.out.print("Informe uma senha: ");
			String senha = sc.nextLine();
			//sc.nextLine(); // Consumir a quebra de linha

			// Criando um novo objeto Usuario
			Usuario novoUsuario = new Usuario(nome, senha);

			// Adicionando o usuário ao vetor
			usuarios[indiceAtual] = novoUsuario;

			// Incrementando o índice atual
			indiceAtual++;

			System.out.print("Deseja cadastrar outro usuário? (S/N): ");
			String resposta = sc.nextLine().toUpperCase();

			// Verificando se o usuário deseja sair do cadastro
			if (resposta.equals("S")) {
				cadastrarUsuarios();
			}else {
				System.out.println("\nUsuários Cadastrados:");
				for (int i = 0; i < indiceAtual; i++) {
					System.out.println("Nome: " + usuarios[i].getNome() + ", Senha: " + usuarios[i].getSenha());
					System.out.println("Você será redirecionado para a lista de produtos");
					produtos.listarRemedios();				}
			}
		}

		
	}
	
	
	

	public void mostraHoraEData() {

		System.out.println("### Extrato da Conta Corrente###");

		SimpleDateFormat sfd = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date data = new Date();
		System.out.println("Data é: " + sfd.format(data));

	}
}