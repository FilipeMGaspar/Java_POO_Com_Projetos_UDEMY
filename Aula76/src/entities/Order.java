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
	
}
