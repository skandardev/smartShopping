package shopping.service;

import java.util.List;

import javax.ejb.Local;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import shopping.model.Category;
import shopping.model.Product;


@Local
@Path("/webservice")
public interface CatalogServiceLocal {
	void createProduct(Product product);
	void saveOrUpdateProduct(Product product);
	Product findProductById(int id);
	void removeProduct(Product product);
	@GET 
	@Path("/products")
	@Produces(MediaType.APPLICATION_XML)
	List<Product> findAllProducts();
	
	List<Product> findProductsByCategory(Category category);
	
	
	void createCategory(Category category);
	void saveOrUpdateCategory(Category category);
	Category findCategoryById(int id);
	Category findCategoryByName(String name);
	void removeCategory(Category category);
	List<Category> findAllCategories();
}
