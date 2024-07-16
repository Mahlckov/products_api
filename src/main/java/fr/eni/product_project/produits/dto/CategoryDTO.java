/**
 * 
 */
package fr.eni.product_project.produits.dto;

import java.util.List;

/**
 * Classe en charge de
 * 
 * @author tipha
 * @version
 */
public class CategoryDTO {
	private Long idCat;
	private String catName;
	private String CatDescription;
//	private List<ProductDTO> products;
	/**
	 * Constructeur
	 */
	public CategoryDTO() {
		super();
	}
	/**
	 * Constructeur
	 * @param idCat
	 * @param catName
	 * @param catDescription
	 * @param products
	 */
	public CategoryDTO(Long idCat, String catName, String catDescription, List<ProductDTO> products) {
		super();
		this.idCat = idCat;
		this.catName = catName;
		CatDescription = catDescription;
//		this.products = products;
	}
	/**
	 * Getter pour idCat
	 * @return the idCat
	 */
	public Long getIdCat() {
		return idCat;
	}
	/**
	 * Setter pour idCat.
	 * @param idCat the idCat to set
	 */
	public void setIdCat(Long idCat) {
		this.idCat = idCat;
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
	/**
	 * Getter pour catDescription
	 * @return the catDescription
	 */
	public String getCatDescription() {
		return CatDescription;
	}
	/**
	 * Setter pour catDescription.
	 * @param catDescription the catDescription to set
	 */
	public void setCatDescription(String catDescription) {
		CatDescription = catDescription;
	}
	/**
	 * Getter pour products
	 * @return the products
	 */
//	public List<ProductDTO> getProducts() {
//		return products;
//	}
//	/**
//	 * Setter pour products.
//	 * @param products the products to set
//	 */
//	public void setProducts(List<ProductDTO> products) {
//		this.products = products;
//	}

}
