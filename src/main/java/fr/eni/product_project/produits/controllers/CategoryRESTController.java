/**
 * 
 */
package fr.eni.product_project.produits.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.eni.product_project.produits.dto.CategoryDTO;
import fr.eni.product_project.produits.entities.Category;
import fr.eni.product_project.produits.repositories.CategoryRepository;
import fr.eni.product_project.produits.services.CategoryService;
import fr.eni.product_project.produits.services.ProductService;

/**
 * Classe en charge de
 * 
 * @author tipha
 * @version
 */
@RestController
@RequestMapping("/categories")
@CrossOrigin("*")
public class CategoryRESTController {
	@Autowired
	CategoryRepository categoryRepository;
	
	@Autowired
	CategoryService categoryService;

	@GetMapping
	public List<Category> getAllCategories() {
		return categoryRepository.findAll();
	}

	@GetMapping("/{id}")
	public Category getCategorieById(@PathVariable("id") Long id) {
		return categoryRepository.findById(id).get();
	}

	@PostMapping
    public CategoryDTO createCategory(@RequestBody CategoryDTO categoryDTO) {
        return categoryService.saveCategory(categoryDTO);
    }

    @PutMapping
    public CategoryDTO updateCategory(@RequestBody CategoryDTO categoryDTO) {
        return categoryService.updateCategory(categoryDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable("id") Long id) {
        categoryService.deleteCategoryById(id);
    }
}
