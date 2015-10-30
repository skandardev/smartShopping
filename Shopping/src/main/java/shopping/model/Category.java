package shopping.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PreRemove;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
/***
 * 
 * @author skan
 *
 */
@Entity
@Table(name="t_category")
@XmlRootElement
public class Category implements Serializable {
	
	private static final long serialVersionUID = 1077338873585734472L;
	
	private int id;
	private String name;
	
	private List<Product> products;
	
	
	public Category() {
	}
	public Category(int id, String name) {
		this.id = id;
		this.name = name;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	@XmlTransient
	@OneToMany(mappedBy = "category")
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public void addProduct(Product product){
		this.getProducts().add(product);
		product.setCategory(this);
	}
	@PreRemove
	public void preRemove(){
		for(Product p:products)
			p.setCategory(null);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Category other = (Category) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
   
}
