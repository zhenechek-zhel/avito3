package com.amr.project.service.abstracts;

import com.amr.project.model.dto.CategoryDTO;
import com.amr.project.model.dto.ItemDTO;

import java.util.List;

public interface CategoryService {

    List<CategoryDTO> getAllCategories();

    CategoryDTO getCategoryById(Long id);

    void saveCategory(CategoryDTO itemDTO);

    void updateCategory(CategoryDTO itemDTO);

    void deleteCategory(Long id);
}
