package exercicio3;

public class Aluno {
	//Atibutos
	private String nome;
	private double notaPriTrim;
	private double notaSegTrim;
	private double notaTercTrim;
	
	//métodos geter e seter
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getNotaPriTrim() {
		return this.notaPriTrim;
	}
	public void setNotaPriTrim(double notaPriTrim) {
		this.notaPriTrim = notaPriTrim;
	}
	
	public double getNotaSegTrim() {
		return this.notaSegTrim;
	}
	public void setNotaSegTrim(double notaSegTrim) {
		this.notaSegTrim = notaSegTrim;
	}
	
	public double getNotaTercTrim() {
		return this.notaTercTrim;
	}
	public void setNotaTercTrim(double notaTercTrim) {
		this.notaTercTrim = notaTercTrim;
	}
}
