package br.edu.infnet.model.domain;

public class Aluno {
	
	private String nome;
	private String email; 
	private String escolaridade; 
	private String [] disciplinas; 
	private String regiao;
	private float mensalidade;
	private int idade;
	
	
	public float getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(float mensalidade) {
		this.mensalidade = mensalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Aluno (String nome, String email) {
		this.nome = nome;
		this.email =email;
	}
	
	@Override
	public String toString() {

		
		return String.format("[%s] O aluno %s, com email: [%s] esta cursando [%d] disciplinas na regiao [%s]",
				escolaridade,
				nome,
				email,
				idade,
				mensalidade,
				disciplinas.length,
				regiao
				);
	}
		
    public void impressao() {
	
    	System.out.println(this);
    	
    	
	for(String disciplina : disciplinas) {
		System.out.println("-" + disciplina);
	}
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEscolaridade() {
		return escolaridade;
	}
	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}
	public String[] getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(String[] disciplinas) {
		this.disciplinas = disciplinas;
	}
	public String getRegiao() {
		return regiao;
	}
	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}

}
