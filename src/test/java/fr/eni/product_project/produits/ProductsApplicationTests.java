package fr.eni.product_project.produits;

import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import fr.eni.product_project.produits.entities.Category;
import fr.eni.product_project.produits.entities.Product;
import fr.eni.product_project.produits.repositories.ProductRepository;

@SpringBootTest
class ProductsApplicationTests {

	@Autowired
	private ProductRepository productRepository;

	@Test
	public void testCreateProduit() {
		Product prod = new Product("PC Dell", 2200.500, new Date());
		productRepository.save(prod);
	}

	@Test
	public void testFindProduit() {
		Product p = productRepository.findById(1L).get();
		System.out.println(p);
	}

	@Test
	public void testUpdateProduit() {
		Product p = productRepository.findById(1L).get();
		p.setProductPrice(1000.0);
		productRepository.save(p);
		System.out.println(p);
	}

	@Test
	public void testDeleteProduit() {
		productRepository.deleteById(1L);
		;
	}

	@Test
	public void testListerTousProduits() {
		List<Product> prods = productRepository.findAll();
		for (Product p : prods) {
			System.out.println(p);
		}
	}

	@Test
	public void testFindByProductName() {
		List<Product> prods = productRepository.findByProductName("iphone X");
		for (Product p : prods) {
			System.out.println(p);
		}
	}

	@Test
	public void testFindByProductNameContains() {
		List<Product> prods = productRepository.findByProductNameContains("iphone");
		for (Product p : prods) {
			System.out.println(p);
		}
	}

	@Test
	public void testFindPriceByName() {
		List<Product> prods = productRepository.findByNamePrice("iPhone X", 999.00);
		System.out.println("Number of products found: " + prods.size());
		for (Product p : prods) {
			System.out.println(p);
		}

		// Assertion to verify that the list is not empty
		assertFalse(prods.isEmpty(), "No products found with the given name and price");
	}

	@Test
	public void testfindByCategory() {
		Category cat = new Category();
		// Category 1 electronics
		cat.setIdCat(1L);
		List<Product> prods = productRepository.findByCategory(cat);
		for (Product p : prods) {
			System.out.println(p);
		}
	}

	@Test
	public void testFindByCategoryIdCat() {
		List<Product> prods = productRepository.findByCategoryIdCat(1L);
		for (Product p : prods) {
			System.out.println(p);
		}
	}

	@Test
	public void testFindAllByOrderByNomProduitAsc() {
		List<Product> prods = productRepository.findAllByOrderByProductNameAsc();
		for (Product p : prods) {
			System.out.println(p);
		}
	}

	@Test
	public void testTrierProduitsNomsPrix() {
		List<Product> prods = productRepository.OrderProductsByNameAndPrice();
		for (Product p : prods) {
			System.out.println(p);
		}
	}

}
