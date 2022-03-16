package com.amr.project.converter.mappers;

import com.amr.project.model.dto.CategoryDto;
import com.amr.project.model.entity.Category;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = ItemMapper.class)
public interface CategoryMapper {

    CategoryDto toDto(Category category);

    Category toEntity(CategoryDto categoryDto);

    List<CategoryDto> toDTOList(List<Category> categories);

    List<Category> toEntityList(List<CategoryDto> categoryDtos);
}
