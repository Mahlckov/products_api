/**
 * 
 */
package fr.eni.product_project.produits.entities;
/**
 * 
 */
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

/**
 * Classe en charge de
 * 
 * @author tipha
 * @version
 */
@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProduct;
	private String productName;
	private Double productPrice;
	private Date creationDate;
	
	@ManyToOne
	private Category category;


	public Product() {
		super();
	}

	public Product(String productName, Double productPrice, Date creationDate) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
		this.creationDate = creationDate;
	}
	
	

	/**
	 * Constructeur
	 * @param idProduct
	 * @param productName
	 * @param productPrice
	 * @param creationDate
	 * @param category
	 */
	public Product(Long idProduct, String productName, Double productPrice, Date creationDate, Category category) {
		super();
		this.idProduct = idProduct;
		this.productName = productName;
		this.productPrice = productPrice;
		this.creationDate = creationDate;
		this.category = category;
	}

	/**
	 * Getter pour idProduct
	 * 
	 * @return the idProduct
	 */
	public Long getIdProduct() {
		return idProduct;
	}

	/**
	 * Setter pour idProduct.
	 * 
	 * @param idProduct the idProduct to set
	 */
	public void setIdProduct(Long idProduct) {
		this.idProduct = idProduct;
	}

	/**
	 * Getter pour nameProduct
	 * 
	 * @return the nameProduct
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * Setter pour nameProduct.
	 * 
	 * @param nameProduct the nameProduct to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * Getter pour productPrice
	 * 
	 * @return the productPrice
	 */
	public Double getProductPrice() {
		return productPrice;
	}

	/**
	 * Setter pour productPrice.
	 * 
	 * @param productPrice the productPrice to set
	 */
	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}

	/**
	 * Getter pour creationDate
	 * 
	 * @return the creationDate
	 */
	public Date getCreationDate() {
		return creationDate;
	}

	/**
	 * Setter pour creationDate.
	 * 
	 * @param creationDate the creationDate to set
	 */
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	/**
	 * Getter pour category
	 * @return the category
	 */
	public Category getCategory() {
		return category;
	}

	/**
	 * Setter pour category.
	 * @param category the category to set
	 */
	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product [idProduct=");
		builder.append(idProduct);
		builder.append(", productName=");
		builder.append(productName);
		builder.append(", productPrice=");
		builder.append(productPrice);
		builder.append(", creationDate=");
		builder.append(creationDate);
		builder.append("]");
		return builder.toString();
	}

}

