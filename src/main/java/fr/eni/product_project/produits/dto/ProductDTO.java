/**
 * 
 */
package fr.eni.product_project.produits.dto;

import java.util.Date;

/**
 * Classe en charge de
 * @author tipha
 * @version
 */
public class ProductDTO {
	private Long idProduct;
	private String productName;
	private Double productPrice;
	private Date creationDate;
	private CategoryDTO category;
	private String catName;
	/**
	 * Constructeur
	 */
	public ProductDTO() {
		super();
	}
	/**
	 * Constructeur
	 * @param idProduct
	 * @param productName
	 * @param productPrice
	 * @param creationDate
	 * @param category
	 */
	public ProductDTO(Long idProduct, String productName, Double productPrice, Date creationDate,
			CategoryDTO category, String catName) {
		super();
		this.idProduct = idProduct;
		this.productName = productName;
		this.productPrice = productPrice;
		this.creationDate = creationDate;
		this.category = category;
		this.catName = catName;
	}
	/**
	 * Getter pour idProduct
	 * @return the idProduct
	 */
	public Long getIdProduct() {
		return idProduct;
	}
	/**
	 * Setter pour idProduct.
	 * @param idProduct the idProduct to set
	 */
	public void setIdProduct(Long idProduct) {
		this.idProduct = idProduct;
	}
	/**
	 * Getter pour productName
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}
	/**
	 * Setter pour productName.
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	/**
	 * Getter pour productPrice
	 * @return the productPrice
	 */
	public Double getProductPrice() {
		return productPrice;
	}
	/**
	 * Setter pour productPrice.
	 * @param productPrice the productPrice to set
	 */
	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}
	/**
	 * Getter pour creationDate
	 * @return the creationDate
	 */
	public Date getCreationDate() {
		return creationDate;
	}
	/**
	 * Setter pour creationDate.
	 * @param creationDate the creationDate to set
	 */
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	/**
	 * Getter pour category
	 * @return the category
	 */
	public CategoryDTO getCategory() {
		return category;
	}
	/**
	 * Setter pour category.
	 * @param category the category to set
	 */
	public void setCategory(CategoryDTO category) {
		this.category = category;
	}
	/**
	 * Getter pour catName
	 * @return the catName
	 */
	public String getCatName() {
		return catName;
	}
	/**
	 * Setter pour catName.
	 * @param catName the catName to set
	 */
	public void setCatName(String catName) {
		this.catName = catName;
	}
	
}
