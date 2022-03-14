package com.amr.project.converter.sets;


import com.amr.project.converter.mappers.CategoryMapper;
import com.amr.project.model.dto.CategoryDTO;
import com.amr.project.model.entity.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper( uses = CategoryMapper.class)
public interface CategoryListMapper {


    CategoryListMapper INSTANCE = Mappers.getMapper(CategoryListMapper.class);

    List<CategoryDTO> toDTOList(List<Category> categories);

    List<Category> toEntityList(List<CategoryDTO> categoryDTOS);
}
