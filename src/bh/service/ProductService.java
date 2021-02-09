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

import bh.dao.ProductDAO;
import bh.entity.Product;

@Path("/ProductService")
public class ProductService {
	
	ProductDAO dao = new ProductDAO();

	@GET
	@Path("/products")
	@Produces(MediaType.APPLICATION_XML)
	public List<Product> getProducts() {
		return dao.getAllProducts();
	}
	
	@GET
	@Path("/products/{productid}")
	@Produces(MediaType.APPLICATION_XML)
	public Product getProduct(@PathParam("productid") int productid) {
		return dao.getProduct(productid);
	}
	
	@PUT
	@Path("/products")
	@Produces(MediaType.APPLICATION_XML)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public Product createProduct(@FormParam("name") String name, @FormParam("description") String description, @FormParam("price") float price, @FormParam("itemsinstock") int itemsInStock) {
		return dao.createProduct(name, description, price, itemsInStock);
	}
	
	@POST
	@Path("/products")
	@Produces(MediaType.APPLICATION_XML)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public Product updateProduct(@FormParam("productid") int productId, @FormParam("name") String name, @FormParam("description") String description, @FormParam("price") float price, @FormParam("itemsinstock") int itemsInStock) {
		return dao.updateProduct(productId, name, description, price, itemsInStock);
	}
	
	@POST
	@Path("/products")
	@Produces(MediaType.APPLICATION_XML)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public Product updateProductPrice(@FormParam("productid") int productId, @FormParam("price") float price) {
		return dao.updateProductPrice(productId, price);
		// return type can vary based on requirement
	}
	
	/*
	 * +ve or -ve value
	 */
	@POST
	@Path("/products")
	@Produces(MediaType.APPLICATION_XML)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public Product updateProductCount(@FormParam("productid") int productId, @FormParam("itemsinstock") int itemsInStock) {
		return dao.updateProductPrice(productId, itemsInStock);
		// return type can vary based on requirement
	}
	
	@DELETE
	@Path("/products/{productid}")
	@Produces(MediaType.APPLICATION_ATOM_XML)
	public Product deleteProduct(@PathParam("productid") int productId) {
		return dao.deleteProduct(productId);
		// return type can vary based on requirement
	}
	
	@POST
	@Path("/products")
	@Produces(MediaType.APPLICATION_XML)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public float getPrice(@FormParam("productid") int productId, @FormParam("quantity") int quantity) {
		return dao.getPrice(productId, quantity);
		// need to work on return type
	}
}
