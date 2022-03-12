package com.amr.project.converter;

import com.amr.project.model.entity.Image;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ImageMapper {

    ImageMapper INSTANCE = Mappers.getMapper(ImageMapper.class);

    ImageDto toImageDto(Image image);

    Image toImage(ImageDto imageDto);
}
