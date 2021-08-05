package entidades;

public class Professor {
	//Atributos
	private String nome;
	private long matricula;
	private double salario;
	
	//Métodos geter e seter
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getMatricula() {
		return matricula;
	}
	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	//Método descontoInss
	public void descontoInss(double salarioProf) {
		
	}
}
