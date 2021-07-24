package exercicio2;

public class Empregado {
	//Atributos
	private String nome;
	private double salario;
	private double imposto;
	
	//Métodos geter e seter
	private String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	private double getSalario() {
		return this.salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	private double getImposto() {
		return this.imposto;
	}
	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	//Métodos públicos
	public double salarioLimpo() {
		return this.getSalario() - this.getImposto();
	}
	
	public void detalhesFuncionario() {
		System.out.println("");
	}
}
