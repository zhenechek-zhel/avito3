package com.amr.project.converter.mappers;

import com.amr.project.model.dto.ImageDTO;
import com.amr.project.model.entity.Image;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", uses = ShopMapper.class)
public interface ImageMapper {

    ImageDTO toDTO(Image image);

    Image toEntity(ImageDTO imageDto);

    List<Image> toEntityList(List<ImageDTO> images);

    List<ImageDTO> toDTOList(List<Image> imageDTOS);
}
