/**
 * 
 */
package fr.eni.product_project.produits.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

/**
 * Classe en charge de
 * 
 * @author tipha
 * @version
 */
@Entity
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCat;
	private String catName;
	private String CatDescription;
	
	@JsonIgnore //Eviter les références croisées = boucles infinies lors de la serialisation
	@OneToMany(mappedBy = "category") //La classe category est reliée à la classe Product par l'attribut category
	private List<Product> products;

	/**
	 * Constructeur
	 */
	public Category() {
		super();
	}

	/**
	 * Constructeur
	 * @param catName
	 * @param catDescription
	 * @param products
	 */
	public Category(String catName, String catDescription, List<Product> products) {
		super();
		this.catName = catName;
		CatDescription = catDescription;
		this.products = products;
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
	public List<Product> getProducts() {
		return products;
	}

	/**
	 * Setter pour products.
	 * @param products the products to set
	 */
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	

}
