package com.amr.project.converter.mappers;

import com.amr.project.model.dto.CategoryDTO;
import com.amr.project.model.entity.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", uses = ItemMapper.class)
public interface CategoryMapper {

    CategoryDTO toDTO(Category category);

    Category toEntity(CategoryDTO categoryDTO);

    List<CategoryDTO> toDTOList(List<Category> categories);

    List<Category> toEntityList(List<CategoryDTO> categoryDTOS);
}
