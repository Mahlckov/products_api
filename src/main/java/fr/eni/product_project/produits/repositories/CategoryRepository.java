/**
 * 
 */
package fr.eni.product_project.produits.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import fr.eni.product_project.produits.entities.Category;

/**
 * Classe en charge de
 * @author tipha
 * @version
 */
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
