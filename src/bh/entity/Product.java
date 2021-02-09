package bh.entity;

public class Product {
	
	private int id;
	private float price;
	private String description;
	private int itemsInStock;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getItemsInStock() {
		return itemsInStock;
	}
	public void setItemsInStock(int itemsInStock) {
		this.itemsInStock = itemsInStock;
	}

}
