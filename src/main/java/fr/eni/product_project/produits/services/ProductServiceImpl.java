/**
 * 
 */
package fr.eni.product_project.produits.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.eni.product_project.produits.dto.CategoryDTO;
import fr.eni.product_project.produits.dto.ProductDTO;
import fr.eni.product_project.produits.entities.Category;
import fr.eni.product_project.produits.entities.Product;
import fr.eni.product_project.produits.repositories.ProductRepository;

/**
 * Classe en charge de
 * 
 * @author tipha
 * @version
 */
@Service
public class ProductServiceImpl implements ProductService {
	@Autowired // injection de dépendance
	ProductRepository productRepository;
	
	@Autowired //Test library
	ModelMapper modelMapper;

	@Override
	public ProductDTO saveProduct(ProductDTO p) {
		return convertEntityToDto(productRepository.save(convertDtoToEntity(p)));

	}

	@Override
	public ProductDTO updateProduct(ProductDTO p) {
		return convertEntityToDto(productRepository.save(convertDtoToEntity(p)));
	}

	@Override
	public void deleteProduct(Product p) {
		productRepository.delete(p);
	}

	@Override
	public void deleteProductById(Long id) {
		productRepository.deleteById(id);
	}

	@Override
	public ProductDTO getProduct(Long id) {
		return convertEntityToDto(productRepository.findById(id).get());
	}

	@Override
	public List<ProductDTO> getAllProducts() {
		List<Product> prods = productRepository.findAll();
		List<ProductDTO> listprodDto = new ArrayList<>(prods.size());
		for (Product p : prods)
			listprodDto.add(convertEntityToDto(p));
		return listprodDto;
	}

	@Override
	public List<Product> findByProductName(String name) {
		return productRepository.findByProductName(name);

	}

	@Override
	public List<Product> findByProductNameContains(String name) {
		return productRepository.findByProductNameContains(name);
	}

	@Override
	public List<Product> findByNamePrice(String name, Double price) {
		return productRepository.findByNamePrice(name, price);

	}

	@Override
	public List<Product> findByCategory(Category category) {
		return productRepository.findByCategory(category);

	}

	@Override
	public List<Product> findByCategoryIdCat(Long idCat) {
		return productRepository.findByCategoryIdCat(idCat);

	}

	@Override
	public List<Product> findAllByOrderByProductNameAsc() {
		return productRepository.findAllByOrderByProductNameAsc();
	}

	@Override
	public List<Product> OrderProductsByNameAndPrice() {
		return productRepository.OrderProductsByNameAndPrice();
	}

	// Méthode qui permet de récupérer une entity de type Product et retourner un
	// objet de type ProductDTO
//	@Override
//	public ProductDTO convertEntityToDto(Product product) {
//		ProductDTO productDTO = new ProductDTO();
//		productDTO.setIdProduct(product.getIdProduct());
//		productDTO.setProductName(product.getProductName());
//		productDTO.setProductPrice(product.getProductPrice());
//		productDTO.setCreationDate(product.getCreationDate());
//
//		// Convertir la catégorie
//		productDTO.setCategory(convertCategoryToDto(product.getCategory()));
//
//		// Récupérer le nom simple de la catégorie
//		productDTO.setCatName(product.getCategory().getCatName());
//
//		return productDTO;
//	}
	
	//Méthode avec modelMapper qui affecte tous les attr de Product dans ProductDTO
	@Override
	public ProductDTO convertEntityToDto(Product product) {
		// Configurer le mapping pour catName
	    modelMapper.typeMap(Product.class, ProductDTO.class).addMappings(mapper -> {
	        mapper.map(src -> src.getCategory().getCatName(), ProductDTO::setCatName);
	    });
		ProductDTO productDTO = modelMapper.map(product, ProductDTO.class);
	 return productDTO;
	 }

	private CategoryDTO convertCategoryToDto(Category category) {
		if (category == null) {
			return null;
		}
		CategoryDTO categoryDTO = new CategoryDTO();
		categoryDTO.setIdCat(category.getIdCat());
		categoryDTO.setCatName(category.getCatName());
		categoryDTO.setCatDescription(category.getCatDescription());
		return categoryDTO;
	}

//	@Override
//	public Product convertDtoToEntity(ProductDTO productDto) {
//		Product product = new Product();
//		product.setIdProduct(productDto.getIdProduct());
//		product.setProductName(productDto.getProductName());
//		product.setProductPrice(productDto.getProductPrice());
//		product.setCreationDate(productDto.getCreationDate());
//		
//		// Convertir CategoryDTO en Category
//		product.setCategory(convertDtoToCategory(productDto.getCategory()));
//		
//		return product;
//	}
	
	//Méthode avec modelMapper qui affecte tous les attr de ProductDTO dans Product
	@Override
	public Product convertDtoToEntity(ProductDTO productDto) {
		Product product = new Product();
		product = modelMapper.map(productDto, Product.class);
		return product;
	}

	// Méthode pour convertir CategoryDTO en Category
//	private Category convertDtoToCategory(CategoryDTO categoryDTO) {
//		if (categoryDTO == null) {
//			return null;
//		}
//		Category category = new Category();
//		category.setIdCat(categoryDTO.getIdCat());
//		category.setCatName(categoryDTO.getCatName());
//		category.setCatDescription(categoryDTO.getCatDescription());
//		return category;
//	}
}
