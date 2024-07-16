/**
 * 
 */
package fr.eni.product_project.produits.services;

import java.util.List;

import fr.eni.product_project.produits.dto.ProductDTO;
import fr.eni.product_project.produits.entities.Category;
import fr.eni.product_project.produits.entities.Product;

/**
 * Classe en charge de
 * 
 * @author tipha
 * @version
 */
public interface ProductService {
	ProductDTO saveProduct(ProductDTO p);

	ProductDTO updateProduct(ProductDTO p);

	void deleteProduct(Product p);

	void deleteProductById(Long id);

	ProductDTO getProduct(Long id);

	List<ProductDTO> getAllProducts();

	List<Product> findByProductName(String name);

	List<Product> findByProductNameContains(String name);

	List<Product> findByNamePrice(String name, Double price);

	List<Product> findByCategory(Category category);

	List<Product> findByCategoryIdCat(Long idCat);

	List<Product> findAllByOrderByProductNameAsc();

	List<Product> OrderProductsByNameAndPrice();

	ProductDTO convertEntityToDto (Product product);

	Product convertDtoToEntity(ProductDTO productDto);

}
