package exercicio3;

public class Aluno {
	//Atibutos
	private String nome;
	private double notaPriTrim;
	private double notaSegTrim;
	private double notaTercTrim;
	
	//métodos geter e seter
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
	
	private double notaFinalDoAluno() {
		double notaFinal = this.getNotaPriTrim() + this.getNotaSegTrim() + this.getNotaTercTrim();
		return notaFinal;
	}
	
	private boolean situacaoDoAluno() {
		boolean aprovado;
		
		if(this.notaFinalDoAluno() >= 60) {
			aprovado = true;
		}else {
			aprovado = false;
		}
		return aprovado;
	}
	
	private void situacaoFinaldoAluno() {
		double pontosParaPassar = 60.00;
		
		if (this.situacaoDoAluno()) {
			System.out.print("APROVADO");			
		}else {
			System.out.print("REPROVADO \n");
			System.out.println("} Faltaram " + (pontosParaPassar - this.notaFinalDoAluno()) + " pontos para ser aprovado!");
		}
	}
	
	
	
	//métodos públicos 
	public void detalhesAluno() {
		System.out.println("\n\n=============================================");
		System.out.println("** Ficha do aluno: **\n");
		System.out.println("# NOME ....................: " + this.getNome());
		System.out.println("# Nota primeiro Trimestre .: " + this.getNotaPriTrim());
		System.out.println("# Nota segundo Trimestre ..: " + this.getNotaSegTrim());
		System.out.println("# Nota terceiro Trimestre .: " + this.getNotaTercTrim());
		System.out.println();
		System.out.println("> Nota final ................: " + this.notaFinalDoAluno());
		System.out.print("> Situação ..................: ");
		this.situacaoFinaldoAluno();
		System.out.println();
		
	}
}
