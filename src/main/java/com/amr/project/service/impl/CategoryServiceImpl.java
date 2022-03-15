package com.amr.project.service.impl;

import com.amr.project.converter.mappers.CategoryMapper;
import com.amr.project.dao.CategoryRepository;
import com.amr.project.model.dto.CategoryDto;
import com.amr.project.model.entity.Category;
import com.amr.project.service.abstracts.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryMapper categoryMapper;
    private final CategoryRepository categoryRepository;


    @Override
    public List<CategoryDto> getAllCategories() {
        List<Category> categories = categoryRepository.findAll();
        return categoryMapper.toDTOList(categories);
    }

    @Override
    public CategoryDto getCategoryById(Long id) {
        Category category = categoryRepository.getById(id);
        return categoryMapper.toDto(category);
    }

    @Override
    public void saveCategory(CategoryDto categoryDTO) {
        Category category = categoryMapper.toEntity(categoryDTO);
        categoryRepository.saveAndFlush(category);
    }

    @Override
    public void updateCategory(CategoryDto categoryDTO) {
        Category category = categoryMapper.toEntity(categoryDTO);
        categoryRepository.saveAndFlush(category);
    }

    @Override
    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }
}
