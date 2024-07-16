/**
 * 
 */
package fr.eni.product_project.produits.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.eni.product_project.produits.entities.Category;
import fr.eni.product_project.produits.repositories.CategoryRepository;

/**
 * Classe en charge de
 * @author tipha
 * @version
 */
@RestController
@RequestMapping("/api/cat")
@CrossOrigin("*")
public class CategoryRESTController {
	@Autowired
	CategoryRepository categoryRepository;
	
	@GetMapping
	public List<Category> getAllCategories()
	{
	return categoryRepository.findAll();
	}
	@GetMapping("/{id}")
	public Category getCategorieById(@PathVariable("id") Long id) {
	return categoryRepository.findById(id).get();
	}

}
