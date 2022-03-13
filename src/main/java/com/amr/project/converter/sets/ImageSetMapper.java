package com.amr.project.converter.sets;

import com.amr.project.converter.ImageMapper;
import com.amr.project.model.dto.ImageDTO;
import com.amr.project.model.entity.Image;
import org.mapstruct.Mapper;

import java.util.Set;

@Mapper(uses = ImageMapper.class)
public interface ImageSetMapper {

    Set<Image> toImageSet(Set<ImageDTO> dtos);

    Set<ImageDTO> toImageDTO(Set<Image> entities);
}
