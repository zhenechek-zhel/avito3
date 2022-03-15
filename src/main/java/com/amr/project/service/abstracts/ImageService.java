package com.amr.project.service.abstracts;

import com.amr.project.model.dto.ImageDTO;

import java.util.List;

public interface ImageService {
    List<ImageDTO> getAllImages();

    ImageDTO getImageById(Long id);

    void saveImage(ImageDTO imageDTO);

    void updateImage(ImageDTO imageDTO);

    void deleteImage(Long id);
}
