package entities;

public class Product {
	//Atributos
	public String name;
	public double price;
	public int quantity;
	
	//M?todo Construtor padr?o
	public Product() {//Sobrecarga
		
	}
	
	//M?todo Construtor personalizado
	public Product(String name, double price, int quantity) {//Sobrecarga
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	//M?todo Construtor personalizado
	public Product(String name, double price) {//Sobrecarga
		this.name = name;
		this.price = price;
		//this.quantity = 0; //Linha opcional
	}
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name
				+ ", $ "
				+ String.format("%.2f", price)
				+ ", "
				+ quantity
				+ " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}
