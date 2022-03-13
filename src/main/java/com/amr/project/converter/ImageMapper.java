package com.amr.project.converter;

import com.amr.project.model.dto.ImageDTO;
import com.amr.project.model.entity.Image;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = ShopMapper.class)
public interface ImageMapper {
    ImageMapper INSTANCE = Mappers.getMapper(ImageMapper.class);
    ImageDTO toDTO(Image image);
    Image toEntity(ImageDTO imageDto);
}
