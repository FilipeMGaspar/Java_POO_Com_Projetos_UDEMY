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
	private int descontoInss(double salarioProf) {
		int valorDesconto = 0;
		
		if(salarioProf > 600) {
			valorDesconto = 20;
		}else if(salarioProf > 1200) {
			valorDesconto = 25;
		}else if(salarioProf > 2000) {
			valorDesconto = 30;
		}else {
			valorDesconto = 0;
		}
		return valorDesconto;
	}
		
	//Método toString
	@Override
	public String toString() {
		return "Professor" +
				" > Nome ..........: " + nome + 
				" > Matricula .....: " + matricula +
				" > Salario .......:" + salario + 
				" > Desconto INSS .:" + this.descontoInss(salario);
	}
	
}
