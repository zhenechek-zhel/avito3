package com.amr.project.service.abstracts;

import com.amr.project.model.dto.ImageDTO;

import java.util.List;

public interface ImageService {
    List<ImageDTO> getAllItems();

    ImageDTO getItemById(Long id);

    void saveItem(ImageDTO imageDTO);

    void updateItem(ImageDTO imageDTO);

    void deleteItem(Long id);
}
