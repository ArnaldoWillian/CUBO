package Projeto;

public class Usuario {
	
	    private String nome, senha;
	  

	    // Construtor
	    public Usuario(String nome, String senha) {
	        this.nome = nome;
	        this.senha = senha;
	    }

	    // Métodos de acesso
	    public String getNome() {
	        return nome;
	    }

	    public String getSenha() {
	        return senha;
	    }
	}

