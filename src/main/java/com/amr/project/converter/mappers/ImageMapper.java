package com.amr.project.converter.mappers;

import com.amr.project.model.dto.ImageDto;
import com.amr.project.model.entity.Image;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = ShopMapper.class)
public interface ImageMapper {

    ImageDto toDto(Image image);

    Image toEntity(ImageDto imageDto);

    List<Image> toEntityList(List<ImageDto> images);

    List<ImageDto> toDTOList(List<Image> imageDtos);
}
