package entidade;

public class Empregado {
	//Atibutos
	private int id;
	private String Nome;
	private double salario;
	
	//M�todo construtor
	public Empregado(int id, String nome, double salario) {
		this.setId(id);
		this.setNome(nome);
		this.setSalario(salario);
	}

	//M�todos Geter e seter
	public int getId() {
		return id;
	}

	private void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return Nome;
	}

	private void setNome(String nome) {
		Nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	private void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	//M�todo para aumentar o sal�rio
	public void aumentarSalario (double porcent) {
		this.setSalario(this.getSalario() + (this.getSalario() * porcent / 100));
	}
	
}
