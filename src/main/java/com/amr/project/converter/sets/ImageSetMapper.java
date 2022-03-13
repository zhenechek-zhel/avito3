package com.amr.project.converter.sets;

import com.amr.project.converter.mappers.ImageMapper;
import com.amr.project.model.dto.ImageDTO;
import com.amr.project.model.entity.Image;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.Set;

@Mapper(componentModel = "spring", uses = ImageMapper.class)
public interface ImageSetMapper {

    ImageSetMapper INSTANCE = Mappers.getMapper(ImageSetMapper.class);

    Set<Image> toEntitySet(Set<ImageDTO> images);

    Set<ImageDTO> toDTOSet(Set<Image> imageDTOS);
}
