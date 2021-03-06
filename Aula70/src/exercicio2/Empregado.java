package exercicio2;

public class Empregado {
	//Atributos
	private String nome;
	private double salario;
	private double imposto;
	
	//M?todos geter e seter
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
	
	//M?todos p?blicos
	public double salarioLimpo() {
		return this.getSalario() - this.getImposto();
	}
	
	public void detalhesFuncionario() {
		System.out.println("\n-----------------------------------");
		System.out.println("Ficha do funcin?rio ");
		System.out.println("  > Nome ....: " + this.getNome());
		System.out.printf("  > Sal?rio .: %.2f \n", this.salarioLimpo());
		System.out.println("-----------------------------------\n");
	}
	
	public void aumentoDoSalario(double aumento) {
		double novoSalario = this.getSalario() + (this.getSalario() * aumento/100) - this.getImposto() ;
		
		System.out.println("\n-----------------------------------");
		System.out.println("Ficha do funcin?rio: (Sal?rio atualizado)");
		System.out.println("  > Nome ....: " + this.getNome());
		System.out.printf("  > Sal?rio .: %.2f \n", novoSalario);
		System.out.println("-----------------------------------\n");
	}
}
