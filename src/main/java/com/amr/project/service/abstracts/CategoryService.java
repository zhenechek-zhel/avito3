package com.amr.project.service.abstracts;

import com.amr.project.model.dto.CategoryDto;

import java.util.List;

public interface CategoryService {

    List<CategoryDto> getAllCategories();

    CategoryDto getCategoryById(Long id);

    void saveCategory(CategoryDto itemDTO);

    void updateCategory(CategoryDto itemDTO);

    void deleteCategory(Long id);
}
