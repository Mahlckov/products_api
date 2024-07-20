/**
 * 
 */
package fr.eni.product_project.produits.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import fr.eni.product_project.produits.entities.Category;

/**
 * Classe en charge de
 * @author tipha
 * @version
 */
@RepositoryRestResource(path = "cat")
@CrossOrigin("http://localhost:4200/") //pour autoriser angular 
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
