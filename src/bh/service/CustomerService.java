package bh.service;
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

import bh.dao.CustomerDAO;
import bh.entity.Customer;
import bh.entity.Order;

import java.util.List;  


@Path("/CustomerService")
public class CustomerService {
	public CustomerDAO dao = new CustomerDAO();

	@GET
	@Path("/customers")
	@Produces(MediaType.APPLICATION_XML)
	public List<Customer> getCustomers() {
		return dao.getAllCustomers();
	}
	
	@GET
	@Path("/customers/{customerid}")
	@Produces(MediaType.APPLICATION_XML)
	public Customer getCustomer(@PathParam("customerid") int customerid) {
		return dao.getCustomer(customerid);
	}
	
	@PUT
	@Path("/customers")
	@Produces(MediaType.APPLICATION_XML)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public Customer createCustomer(@FormParam("name") String name, @FormParam("addressLine1") String addressLine1, @FormParam("addressLine2") String addressLine2, @FormParam("city") String city, @FormParam("state") String state, @FormParam("country") String country) {
		return dao.createCustomer(name, addressLine1, addressLine2, city, state, country);
		// return type can be changed depending upon the requirement
	}
	
	@POST
	@Path("/customers")
	@Produces(MediaType.APPLICATION_XML)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public Customer updateCustomer(@FormParam("id") int custId, @FormParam("name") String name, @FormParam("addressLine1") String addressLine1, @FormParam("addressLine2") String addressLine2, @FormParam("city") String city, @FormParam("state") String state, @FormParam("country") String country) {
		return updateCustomer(custId, name, addressLine1, addressLine2, city, state, country);
		// return type can be changed depending upon the requirement
	}
	
	@DELETE
	@Path("/customers/{customerid}")
	@Produces(MediaType.APPLICATION_ATOM_XML)
	public Customer deleteCustomer(@PathParam("customerid") int customerid) {
		return dao.deleteCustomer(customerid);
		// return type can be changed depending upon the requirement
	}
	
	@GET
	@Path("/customers/{customerid}")
	@Produces(MediaType.APPLICATION_XML)
	public List<Order> getCustomerOrders(@PathParam("customerid") int customerid) {
		return null;
	}
}
