package com.amr.project.converter;

import com.amr.project.model.dto.CategoryDTO;
import com.amr.project.model.entity.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", uses =  ItemMapper.class)
public interface CategoryMapper {
    CategoryDTO toCategoryDTO (Category category);
    Category toCategory(CategoryDTO categoryDTO);
}
