package com.amr.project.converter.sets;


import com.amr.project.converter.mappers.CategoryMapper;
import com.amr.project.model.dto.CategoryDTO;
import com.amr.project.model.entity.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.Set;

@Mapper(componentModel = "spring", uses = CategoryMapper.class)
public interface CategorySetMapper {


    CategorySetMapper INSTANCE = Mappers.getMapper(CategorySetMapper.class);

    Set<CategoryDTO> toDTOSet(Set<Category> categories);

    Set<Category> toEntitySet(Set<CategoryDTO> categoryDTOS);
}
