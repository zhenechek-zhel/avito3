package com.amr.project.service.impl;

import com.amr.project.converter.mappers.CategoryMapper;
import com.amr.project.dao.abstracts.CategoryRepository;
import com.amr.project.model.dto.CategoryDTO;
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
    public List<CategoryDTO> getAllCategories() {
        List<Category> categories = categoryRepository.findAll();
        return categoryMapper.toDTOList(categories);
    }

    @Override
    public CategoryDTO getCategoryById(Long id) {
        Category category = categoryRepository.getById(id);
        return categoryMapper.toDTO(category);
    }

    @Override
    public void saveCategory(CategoryDTO itemDTO) {
        Category category = categoryMapper.toEntity(itemDTO);
        //categoryRepository.saveAllAndFlush(category);
    }

    @Override
    public void updateCategory(CategoryDTO itemDTO) {

    }

    @Override
    public void deleteCategory(Long id) {

    }
}
