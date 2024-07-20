package fr.eni.product_project.produits;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import fr.eni.product_project.produits.entities.Category;
import fr.eni.product_project.produits.entities.Product;

@SpringBootApplication
public class ProductsApplication implements CommandLineRunner{
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;

	public static void main(String[] args) {
		SpringApplication.run(ProductsApplication.class, args);
	}
	
//	@Bean
//	public ModelMapper modelMapper()
//	{
//		return new ModelMapper();
//	}

	//exposer les id des objets
	@Override
	public void run(String... args) throws Exception {
		repositoryRestConfiguration.exposeIdsFor(Product.class,Category.class);
		
	}

}
