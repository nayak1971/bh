package bh.entity;

public class Order {

	private int orderId;
	private int customerId;
	private int productId;
	private float quantityOrdered;
	private float totalPrice;
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public float getQuantityOrdered() {
		return quantityOrdered;
	}
	public void setQuantityOrdered(float quantityOrdered) {
		this.quantityOrdered = quantityOrdered;
	}
	public float getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}
}
