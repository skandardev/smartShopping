package shopping.service;

import java.util.List;

import javax.ejb.Local;

import shopping.model.Category;
import shopping.model.Product;


@Local
public interface CatalogServiceLocal {
	void createProduct(Product product);
	void saveOrUpdateProduct(Product product);
	Product findProductById(int id);
	void removeProduct(Product product);
	List<Product> findAllProducts();
	
	List<Product> findProductsByCategory(Category category);
	
	
	void createCategory(Category category);
	void saveOrUpdateCategory(Category category);
	Category findCategoryById(int id);
	Category findCategoryByName(String name);
	void removeCategory(Category category);
	List<Category> findAllCategories();
}
