/**
 * 
 */
package fr.eni.product_project.produits.services;

import java.util.List;

import fr.eni.product_project.produits.dto.CategoryDTO;
import fr.eni.product_project.produits.entities.Category;

/**
 * Classe en charge de
 * 
 * @author tipha
 * @version
 */
public interface CategoryService {
	List<CategoryDTO> getAllCategories();

	CategoryDTO getCategory(Long id);

	CategoryDTO saveCategory(CategoryDTO categoryDTO);

	CategoryDTO updateCategory(CategoryDTO categoryDTO);

	void deleteCategoryById(Long id);

	CategoryDTO convertEntityToDto(Category category);

	Category convertDtoToEntity(CategoryDTO categoryDTO);

}
