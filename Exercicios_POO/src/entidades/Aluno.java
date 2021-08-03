package entidades;

public class Aluno {
	//Atributos
	private long matricula;
	private String nome;
	private String email;
	
	//Métodos Geter e Seter
	public long getMatricula() {
		return matricula;
	}
	public void setMatricula(long matricula) {
		this.matricula = matricula;
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
	
	//Método toSting
	@Override
	public String toString() {
		return "Detalhes da ficha do Aluno: \n"
				+ " Nº da matricula ..: " + matricula + "\n" 
				+ " Nome .............: " + nome + "\n"
				+ " Email ............: " + email;
	}	
	
}
