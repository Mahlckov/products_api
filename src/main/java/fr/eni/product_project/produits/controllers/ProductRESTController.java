/**
 * 
 */
package fr.eni.product_project.produits.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import fr.eni.product_project.produits.dto.ProductDTO;
import fr.eni.product_project.produits.entities.Product;
import fr.eni.product_project.produits.services.ProductService;

/**
 * Classe en charge de gérer les produits
 * 
 * @author tipha
 * @version
 */
@RestController
@RequestMapping("")
@CrossOrigin // permet à toutes les origines de consommer les services
public class ProductRESTController {
	@Autowired
	ProductService productService;

	@GetMapping
	public List<ProductDTO> getAllProduits() {
		return productService.getAllProducts();
	}

	@GetMapping("/{id}")
	public ProductDTO getProduitById(@PathVariable("id") Long id) {
		return productService.getProduct(id);
	}

	@PostMapping
	public ProductDTO createProduit(@RequestBody ProductDTO productDTO) {
		return productService.saveProduct(productDTO);
	}

	@PutMapping
	public ProductDTO updateProduit(@RequestBody ProductDTO productDTO) {
		return productService.updateProduct(productDTO);
	}

	@DeleteMapping("/{id}")
	public void deleteProduit(@PathVariable("id") Long id) {
		productService.deleteProductById(id);
	}

	// Retourne les produits d'une catégorie
	@GetMapping("/prodscat/{idCat}")
	public List<Product> getProduitsByCatId(@PathVariable("idCat") Long idCat) {
		return productService.findByCategoryIdCat(idCat);
	}

	@GetMapping("/prodsByName/{name}")
    public List<Product> findByNomProduitContains(@PathVariable("name") String name) {
        return productService.findByProductNameContains(name);
    }
}
