package com.Api.Service;

import com.Api.DTO.CategoryDTO;
import com.Api.Entity.Category;
import com.Api.Repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {


    public CategoryRepository categoryRepository;

    public List<Category> getAllCategories(){
        return (List<Category>) categoryRepository.findAll();
    }

    public Category createCategory(CategoryDTO categoryDTO) {
        Category category=new Category();
        categoryDTO.setId(category.getId());
        categoryDTO.setCategoryName(category.getCategoryName());
        categoryDTO.setDescription(categoryDTO.getDescription());

        categoryRepository.save(category);
        return category;
    }

    public Category readCategory(String categoryName) {
        return categoryRepository.findByCategoryName(categoryName);
    }

    public Optional<Category> readCategory(Integer categoryId) {
        return categoryRepository.findById(categoryId);
    }


    public void updateCategory(Integer categoryId, Category category){
        Category newCategory = category;
        Category oldCategory = categoryRepository.findById(categoryId).get();
        oldCategory.setCategoryName(newCategory.getCategoryName());
        oldCategory.setDescription(newCategory.getDescription());

        categoryRepository.save(oldCategory);
    }

    public void deleteCategory(Integer categoryId){
        Category category = categoryRepository.findById(categoryId).get();
        categoryRepository.delete(category);
    }
}
