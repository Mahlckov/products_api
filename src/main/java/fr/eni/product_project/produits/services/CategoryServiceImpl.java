/**
 * 
 */
package fr.eni.product_project.produits.services;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.eni.product_project.produits.dto.CategoryDTO;
import fr.eni.product_project.produits.entities.Category;
import fr.eni.product_project.produits.repositories.CategoryRepository;

/**
 * Classe en charge de
 * 
 * @author tipha
 * @version
 */
@Service
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public List<CategoryDTO> getAllCategories() {
		return categoryRepository.findAll().stream().map(this::convertEntityToDto).collect(Collectors.toList());
	}

	@Override
	public CategoryDTO getCategory(Long id) {
		return convertEntityToDto(categoryRepository.findById(id).get());
	}

	@Override
	public CategoryDTO saveCategory(CategoryDTO categoryDTO) {
		return convertEntityToDto(categoryRepository.save(convertDtoToEntity(categoryDTO)));

	}

	@Override
	public CategoryDTO updateCategory(CategoryDTO categoryDTO) {
		return convertEntityToDto(categoryRepository.save(convertDtoToEntity(categoryDTO)));
	}

	@Override
	public void deleteCategoryById(Long id) {
		categoryRepository.deleteById(id);
	}

	@Override
	public CategoryDTO convertEntityToDto(Category category) {
        return modelMapper.map(category, CategoryDTO.class);
    }

	@Override
	public Category convertDtoToEntity(CategoryDTO categoryDTO) {
		Category category = new Category();
		category = modelMapper.map(categoryDTO, Category.class);

		return category;
	}
}