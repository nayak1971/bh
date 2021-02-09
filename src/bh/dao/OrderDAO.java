package bh.dao;

import java.util.List;

import javax.ws.rs.FormParam;
import javax.ws.rs.PathParam;

import bh.entity.Order;
import bh.entity.Product;

public class OrderDAO {

	public List<Order> getAllOrders() {
		// will work fine when we do not have a lot of order
		
		
		// establish connection
		// create sql
		// execute sql
		// map from resultset
		// return list of Orders
		return null;
	}
	
	public Order getOrder(int orderid) {
		// establish connection
		// create sql
		// execute sql
		// map from resultset
		// return list of Orders
		return null;
	}
	
	public Order createOrder(int customerId, int productId, float quantityOrdered, float shippingcharge, float totalprice) {
		// establish connection
		// create sql
		// execute sql
		// map from resultset
		// return new Order
		return null;
	}
	
	public Order updateOrder(int customerId, int orderId, int productId, float quantityOrdered, float shippingcharge, float totalprice) {
		// establish connection
		// create sql
		// execute sql
		// map from resultset
		// return updated Order with additional details
		return null;
	}
	
	public Order deleteOrder(@PathParam("orderid") int orderId) {
		// establish connection
		// create sql
		// execute sql
		// return deleted order
		return null;
	}

}
