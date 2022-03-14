package com.amr.project.converter.lists;

import com.amr.project.converter.mappers.ImageMapper;
import com.amr.project.model.dto.ImageDTO;
import com.amr.project.model.entity.Image;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(uses = ImageMapper.class)
public interface ImageListMapper {

    ImageListMapper INSTANCE = Mappers.getMapper(ImageListMapper.class);

    List<Image> toEntityList(List<ImageDTO> images);

    List<ImageDTO> toDTOList(List<Image> imageDTOS);
}
