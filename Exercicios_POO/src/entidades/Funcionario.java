package entidades;

public class Funcionario {
	//Atributos
	private int registo;
	private String nome;
	private int idade;
	private String cargo;
	private double salario;
	
	//Métodos construtores
	public Funcionario() {
		this.salario = 1500.00;
	}
	
	public Funcionario(String nome, double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}
	
	public Funcionario(int registo, String nome, int idade, String cargo, double salario) {
		super();
		this.registo = registo;
		this.nome = nome;
		this.idade = idade;
		this.cargo = cargo;
		this.salario = salario;
	}
	


	//Métodos geter e seter
	public int getRegisto() {
		return registo;
	}
	
	public void setRegisto(int registo) {
		this.registo = registo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	//Método toSting
	@Override
	public String toString() {
		return " *** Ficha de Funcionario *** " + "\n" +
				" Registo ....: " + registo + 
				" Nome .......: " + nome + 
				" Idade ......: " + idade +
				" Cargo ......: " + cargo + 
				" Salario ....: " + salario + "\n";
	}
	
}
