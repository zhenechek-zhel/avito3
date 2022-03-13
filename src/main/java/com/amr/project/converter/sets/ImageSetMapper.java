package com.amr.project.converter.sets;

import com.amr.project.converter.ImageMapper;
import com.amr.project.model.dto.ImageDTO;
import com.amr.project.model.entity.Image;
import org.mapstruct.Mapper;

import java.util.Set;

@Mapper(componentModel = "spring", uses = ImageMapper.class)
public interface ImageSetMapper {
    Set<Image> toEntitySet(Set<ImageDTO> images);
    Set<ImageDTO> toDTOSet(Set<Image> imageDTOS);
}
