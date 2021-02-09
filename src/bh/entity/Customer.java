package bh.entity;

public class Customer {

	public enum customerType {STANDARD, PREMIUM};
	
	private int id;
	private String name = null;
	private Address address = null;
	private customerType type = null;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public customerType getType() {
		return type;
	}
	public void setType(customerType type) {
		this.type = type;
	}
	
}
