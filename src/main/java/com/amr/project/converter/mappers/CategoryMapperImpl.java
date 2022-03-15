package com.amr.project.converter.mappers;

import com.amr.project.model.dto.CategoryDTO;
import com.amr.project.model.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CategoryMapperImpl implements CategoryMapper {

    private final CategoryMapper categoryMapper;

    @Autowired
    public CategoryMapperImpl(CategoryMapper categoryMapper) {
        this.categoryMapper = categoryMapper;
    }

    @Override
    public CategoryDTO toDTO(Category category) {
        return categoryMapper.toDTO(category);
    }

    @Override
    public Category toEntity(CategoryDTO categoryDTO) {
        return categoryMapper.toEntity(categoryDTO);
    }

    @Override
    public List<CategoryDTO> toDTOList(List<Category> categories) {
        if (categories == null) return null;
        List<CategoryDTO> list = new ArrayList<>(categories.size());
        for (Category category : categories) {
            list.add(categoryMapper.toDTO(category));
        }
        return list;
    }

    @Override
    public List<Category> toEntityList(List<CategoryDTO> categoryDTOS) {
        if (categoryDTOS == null) return null;
        List<Category> list = new ArrayList<>(categoryDTOS.size());
        for (CategoryDTO categoryDTO : categoryDTOS) {
            list.add(categoryMapper.toEntity(categoryDTO));
        }
        return list;
    }
}
