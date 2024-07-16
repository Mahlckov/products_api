/**
 * 
 */
package fr.eni.product_project.produits.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import fr.eni.product_project.produits.entities.Category;
import fr.eni.product_project.produits.entities.Product;

/**
 * Classe en charge de réaliser toutes les opérations du CRUD sur l'entité
 * Product
 * 
 * @author tipha
 * @version
 */
public interface ProductRepository extends JpaRepository<Product, Long> {
	List<Product> findByProductName(String name);

	List<Product> findByProductNameContains(String name);

	// Paramètres positionnels
//	@Query("select p from Product p where p.productName like %?1 and p.productPrice > ?2")
//	List<Product> findPriceByName(String name, Double price);
	
	// Paramètres nommés
	@Query("select p from Product p where p.productName like %:name and p.productPrice > :price")
	List<Product> findByNamePrice (@Param("name") String name,@Param("price") Double price);
	
	@Query("select p from Product p where p.category = ?1")
	List<Product> findByCategory (Category category);
	
	List<Product> findByCategoryIdCat(Long idCat);
	
	List<Product> findAllByOrderByProductNameAsc();

	@Query("select p from Product p order by p.productName ASC, p.productPrice DESC")
	List<Product> OrderProductsByNameAndPrice();
}
