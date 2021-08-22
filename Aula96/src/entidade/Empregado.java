package entidade;

public class Empregado {
	//Atibutos
	private int id;
	private String Nome;
	private double salario;
	
	//Método construtor
	public Empregado(int id, String nome, double salario) {
		this.id = id;
		Nome = nome;
		this.salario = salario;
	}

	//Métodos Geter e seter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
