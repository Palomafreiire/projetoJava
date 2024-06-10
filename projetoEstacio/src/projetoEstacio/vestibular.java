package projetoEstacio;


import java.util.Scanner;


public abstract class vestibular {

	private String fichaInscricao;
	private String areaCurso;
	private String curso;
	boolean concluida;
	private String menuVestibular;
	private String nome;
			
	Scanner ler = new Scanner(System.in);
	
	public void fichaInscricao() {
		
		System.out.println("Nome: ");
		String nome= ler.next();
		this.nome = nome;
		System.out.println("idade: ");
		int idade = ler.nextInt();
		System.out.println("=====================FICHA DE INSCRIÇÃO ====================");
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + idade);
		System.out.println("Area do curso escolhida: "+ this.areaCurso);
		System.out.println("Curso: "+ this.curso);
		System.out.println("============================================================");
				
	}
	
	public void concluida (boolean concluida) {
		if (concluida == true) {
			System.out.println("Parabéns " +nome+ " você concluiu a sua inscrição no curso " + curso);
		}
		else {
			System.out.println("Infelizmente você não concluiu a sua ficha de inscrição");
		}
	}
	
	abstract void areaCurso();
		
	void area() {	
	}
	
	abstract void menuVestibular();
	
	
	
	public String getFichaInscricao() {
		return fichaInscricao;
	}
	public void setFichaInscricao(String fichaInscricao) {
		this.fichaInscricao = fichaInscricao;
	}
	public String getAreaCurso() {
		return areaCurso;
	}
	public void setAreaCurso(String areaCurso) {
		this.areaCurso = areaCurso;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getMenuVestibular() {
		return menuVestibular;
	}

	public void setMenuVestibular(String menuVestibular) {
		this.menuVestibular = menuVestibular;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
}
