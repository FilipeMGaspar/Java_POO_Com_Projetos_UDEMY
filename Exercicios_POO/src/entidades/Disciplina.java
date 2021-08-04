package entidades;

public class Disciplina {
	//Atributos
	private String nome;
	private int cargaHoraria;
	private String codigo;
	
	//M�todos Geter e Seter
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
		
	//M�todo toSting
	@Override
	public String toString() {
		return "Detalhes da disciplina" + "\n"
				+ " Nome ...........: " + nome + "\n" 
				+ " Carga Horaria ..: " + cargaHoraria + "\n" 
				+ " C�digo .........: " + codigo 
				+ "\n";
	}
	
	
}
