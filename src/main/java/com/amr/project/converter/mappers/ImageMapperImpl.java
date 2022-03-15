package com.amr.project.converter.mappers;

import com.amr.project.model.dto.ImageDTO;
import com.amr.project.model.entity.Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ImageMapperImpl implements ImageMapper {

    private final ImageMapper imageMapper;

    @Autowired
    public ImageMapperImpl(ImageMapper imageMapper) {
        this.imageMapper = imageMapper;
    }

    @Override
    public ImageDTO toDTO(Image image) {
        return imageMapper.toDTO(image);
    }

    @Override
    public Image toEntity(ImageDTO imageDto) {
        return imageMapper.toEntity(imageDto);
    }

    @Override
    public List<Image> toEntityList(List<ImageDTO> imageDTOS) {
        if (imageDTOS == null) return null;
        List<Image> list = new ArrayList<>(imageDTOS.size());
        for (ImageDTO imageDTO : imageDTOS) {
            list.add(imageMapper.toEntity(imageDTO));
        }
        return list;
    }

    @Override
    public List<ImageDTO> toDTOList(List<Image> images) {
        if (images == null) return null;
        List<ImageDTO> list = new ArrayList<>(images.size());
        for (Image image : images) {
            list.add(imageMapper.toDTO(image));
        }
        return list;
    }
}
