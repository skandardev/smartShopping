package shopping.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
/***
 * 
 * @author skan
 *
 */
@Entity
@Table(name="t_product")
@XmlRootElement
public class Product implements Serializable {
	
	private static final long serialVersionUID = -9045920277895107981L;
	
	private int id;
	private String name;
	private float unitCost;
	private String barCode;
	
	private Category category;
	
	
	

	public Product() {
	}
	
	public Product(int id, String name, float unitCost) {
		this.id = id;
		this.name = name;
		this.unitCost = unitCost;
	}

	@Id    
	public int getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	@Column( name  = "unit_cost")
	public float getUnitCost() {
		return this.unitCost;
	}

	@ManyToOne
	@XmlElement
	@JoinColumn( name = "category_fk" , nullable = true)
	public Category getCategory() {
		return category;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setUnitCost(float unitCost) {
		this.unitCost = unitCost;
		
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getBarCode() {
		return barCode;
	}

	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}
	
	
   
}
