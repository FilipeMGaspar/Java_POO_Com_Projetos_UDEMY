package entities;

import java.sql.Date;

public class Order {
	
	//Atributos
	private Date date;
	private Product product;
		
	//M�todo Construtor
	public Order(Date date, Product product) {
		super();
		this.date = date;
		this.product = product;
	}

	//M�todos geter e seter
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
		
}
