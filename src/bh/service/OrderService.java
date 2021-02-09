package bh.service;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import bh.dao.OrderDAO;
import bh.entity.Order;

@Path("/OrderService")
public class OrderService {
	OrderDAO dao = new OrderDAO();
	
	@GET
	@Path("/orders")
	@Produces(MediaType.APPLICATION_XML)
	public List<Order> getOrders() {
		return dao.getAllOrders();
	}
	
	@GET
	@Path("/orders/{orderid}")
	@Produces(MediaType.APPLICATION_XML)
	public Order getOrder(@PathParam("orderid") int orderid) {
		return dao.getOrder(orderid);
	}
	
	@PUT
	@Path("/orders")
	@Produces(MediaType.APPLICATION_XML)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public Order createOrder(@FormParam("customerid") int customerId, @FormParam("productid") int productId, @FormParam("quantityordered") float quantityOrdered, @FormParam("shippingcharge") float shippingcharge, @FormParam("totalprice") float totalprice) {
		return dao.createOrder(customerId, productId, quantityOrdered, shippingcharge, totalprice);
	}
	
	@POST
	@Path("/orders")
	@Produces(MediaType.APPLICATION_XML)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public Order updateOrder(@FormParam("customerid") int customerId, @FormParam("orderid") int orderId, @FormParam("productid") int productId, @FormParam("quantityordered") float quantityOrdered, @FormParam("shippingcharge") float shippingcharge, @FormParam("totalprice") float totalprice) {
		return dao.updateOrder(customerId, orderId, productId, quantityOrdered, shippingcharge, totalprice);
	}
	

	@DELETE
	@Path("/order/{orderid}")
	@Produces(MediaType.APPLICATION_ATOM_XML)
	public Order deleteOrder(@PathParam("orderid") int orderId) {
		return dao.deleteOrder(orderId);
		// return type can vary
	}
}
