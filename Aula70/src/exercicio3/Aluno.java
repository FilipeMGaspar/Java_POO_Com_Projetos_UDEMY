package exercicio3;

public class Aluno {
	//Atibutos
	private String nome;
	private double notaPriTrim;
	private double notaSegTrim;
	private double notaTercTrim;
	
	//m�todos geter e seter
	private String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	private double getNotaPriTrim() {
		return this.notaPriTrim;
	}
	public void setNotaPriTrim(double notaPriTrim) {
		this.notaPriTrim = notaPriTrim;
	}
	
	private double getNotaSegTrim() {
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
	
	//m�todos p�blicos 
	public void detalhesAluno() {
		System.out.println("\n\n=============================================");
		System.out.println("** Ficha do aluno: **");
		System.out.println("  > NOME ....................: " + this.getNome());
		System.out.println("  > Nota primeiro Trimestre .: " + this.getNotaPriTrim());
		System.out.println("  > Nota segundo Trimestre ..: " + this.getNotaSegTrim());
		System.out.println("  > Nota terceiro Trimestre .: " + this.getNotaTercTrim());
		System.out.println();
	}
}
