package bh.dao;

import java.util.List;

import javax.ws.rs.FormParam;

import bh.entity.Customer;

public class CustomerDAO extends DBConnection {

	public List<Customer> getAllCustomers() {
		// establish connection
		// create sql
		// execute sql
		// map from resultset
		// return list of customers
		return null;
	}
	
	public Customer getCustomer(int customerId) {
		// establish connection
		// create sql
		// execute sql
		// map from resultset
		// return customer
		return null;
	}
	
	public Customer createCustomer(String name, String addressLine1, String addressLine2, String city, String state, String country) {
		// establish connection
		// create sql
		// execute sql
		// return customer object with all additional details
		return null;
	}
	
	public Customer updateCustomer(int customerId, String name, String addressLine1, String addressLine2, String city, String state, String country) {
		// establish connection
		// create sql
		// execute sql
		// return customer object with all additional details
		return null;
	}
	
	public Customer deleteCustomer(int customerId) {
		// establish connection
		// create sql
		// execute sql
		// return customer object with all additional details
		return null;
	}
	
	public Customer getCustomerOrders(int customerId) {
		// decide where to get the list of orders from (add business rules here or in order srevice
		// build the list of orders beloging to customer
		// return order list
		return null;
	}
}
