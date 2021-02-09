package bh.dao;

import java.util.List;

import javax.ws.rs.FormParam;
import javax.ws.rs.PathParam;

import bh.entity.Product;

public class ProductDAO {
	
	public List<Product> getAllProducts() {
		// establish connection
		// create sql
		// execute sql
		// map from resultset
		// return list of Products
		return null;
	}
	
	public Product getProduct(int productId) {
		// establish connection
		// create sql
		// execute sql
		// map from resultset
		// return Product
		return null;
	}
	
	public Product createProduct(String name, String description, float price, int itemsInStock) {
		// establish connection
		// create sql
		// execute sql
		// map from resultset
		// return Product with additional details
		return null;
	}
	
	public Product updateProduct(int productId, String name, String description, float price, int itemsInStock) {
		// establish connection
		// create sql
		// execute sql
		// map from resultset
		// return Product with additional details
		return null;
	}
	
	public Product updateProductPrice(int productId, float price) {
		// establish connection
		// create sql
		// execute sql
		// map from resultset
		// return Product with additional details
		return null;
	}
	
	public Product updateProductCount(int productId, int itemsInStock) {
		// establish connection
		// create sql
		// execute sql
		// map from resultset
		// return Product with additional details
		return null;
	}
	
	public Product deleteProduct(int productId) {
		// establish connection
		// create sql
		// execute sql
		// map from resultset
		// return Product with additional details
		return null;
	}
	
	public float getPrice(@FormParam("productid") int productId, @FormParam("quantity") int quantity) {
		// establish connection
		// create sql
		// execute sql
		// map from resultset
		// do calculation, return
		return 0f;
	}

}
