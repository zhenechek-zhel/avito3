package com.amr.project.converter;

import com.amr.project.model.dto.ImageDTO;
import com.amr.project.model.entity.Image;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = ShopMapper.class)
public interface ImageMapper {
    ImageDTO toImageDto(Image image);
    Image toImage(ImageDTO imageDto);
}
